package com.example.lazyload;

import android.app.SearchManager;
import android.content.Context;
import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.SearchView;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.example.lazyload.databinding.ActivityMainBinding;

import java.util.Observable;
import java.util.Observer;

public class MainActivity extends AppCompatActivity implements Observer {

    private static final String TAG = MainActivity.class.getSimpleName();
    private ActivityMainBinding binding;
    private TecViewModel tecViewModel;
    int pageNumber = 1;
    TecAdapter adapter;
    private LinearLayoutManager mLayoutManager;

    //Constants for load more
    private int previousTotal = 0;
    private boolean loading = true;
    private int visibleThreshold = 25;
    int firstVisibleItem, visibleItemCount, totalItemCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        initDataBinding();
        setupListPeopleView(binding.tecRecyclerView);
        setupScrollListener();
        setupObserver(tecViewModel);
    }


    private void initDataBinding() {

        tecViewModel = new TecViewModel(this, pageNumber);
        binding.setMainViewModel(tecViewModel);
    }

    private void setupListPeopleView(RecyclerView listPeople) {
        adapter = new TecAdapter();
        listPeople.setAdapter(adapter);
        mLayoutManager = new LinearLayoutManager(this);
        listPeople.setLayoutManager(mLayoutManager);
        listPeople.addItemDecoration(new DividerItemDecoration(this, DividerItemDecoration.VERTICAL));

    }

    private void setupScrollListener() {

        binding.tecRecyclerView.addOnScrollListener(new RecyclerView.OnScrollListener() {

            @Override
            public void onScrolled(@NonNull RecyclerView recyclerView, int dx, int dy) {
                super.onScrolled(recyclerView, dx, dy);

                visibleItemCount = binding.tecRecyclerView.getChildCount();
                totalItemCount = mLayoutManager.getItemCount();
                firstVisibleItem = mLayoutManager.findFirstVisibleItemPosition();

                // Handling the infinite scroll
                if (loading && dy >0) {
                    if (totalItemCount > previousTotal) {
                        loading = false;
                        previousTotal = totalItemCount;
                    }
                }

                if (!loading && (totalItemCount - visibleItemCount)
                        <= (firstVisibleItem + visibleThreshold)) {
                    tecViewModel.loadMoreData(++pageNumber);
                    loading = true;
                }


                // Hide and show Filter button
            }
        });
    }

    public void setupObserver(Observable observable) {
        observable.addObserver(this);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        tecViewModel.reset();
    }


    @Override
    public void update(Observable observable, Object data) {
        if (observable instanceof TecViewModel) {
            TecViewModel projectViewModel = (TecViewModel) observable;
            adapter.setTecList(projectViewModel.getTecList());
        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        SearchManager searchManager = (SearchManager) getSystemService(Context.SEARCH_SERVICE);
        SearchView searchView = (SearchView) menu.findItem(R.id.menu_search)
                .getActionView();
        searchView.setSearchableInfo(searchManager
                .getSearchableInfo(getComponentName()));
        searchView.setMaxWidth(Integer.MAX_VALUE);

        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                loading = true;
                pageNumber = 1;
                adapter.clearTecList();
                tecViewModel.searchTec(pageNumber, query);
                return false;
            }

            @Override
            public boolean onQueryTextChange(String query) {
                return false;
            }
        });
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.menu_search) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return super.onSupportNavigateUp();
    }
}


