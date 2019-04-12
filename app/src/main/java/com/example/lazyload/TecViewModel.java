package com.example.lazyload;

import android.content.Context;
import android.databinding.ObservableField;
import android.databinding.ObservableInt;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class TecViewModel extends Observable {
    public ObservableInt tecProgress;
    public ObservableInt tecRecycler;
    public ObservableInt tecLabel;
    public ObservableField<String> messageLabel;

    private List<Tec> tecList;
    private Context context;
    private int visible, invisible;
    private int pageNumber;

    public TecViewModel(@Nullable Context context, int pageNumber) {
        this.context = context;
        this.pageNumber = pageNumber;
        this.tecList = new ArrayList<>();
        tecProgress = new ObservableInt(View.GONE);
        tecRecycler = new ObservableInt(View.GONE);
        tecLabel = new ObservableInt(View.VISIBLE);
        messageLabel = new ObservableField<>("Not found");

        initializeViews();
        fetchTecList(pageNumber);
    }

    public void initializeViews() {
        visible = View.VISIBLE;
        invisible = View.GONE;
        viewVisibility(visible,invisible,invisible);
    }

    private void fetchTecList(int page) {
        RestApi api = APIClient.getClient().create(RestApi.class);

        Call<List<Tec>> call = api.fetchTecList("fetch_tec",page,"","");
        call.enqueue(new Callback<List<Tec>>() {
            @Override
            public void onResponse(@NonNull Call<List<Tec>> call, @NonNull Response<List<Tec>> response) {
                if (response.isSuccessful()) {
                    List<Tec> stringResponse = response.body();
                    if (stringResponse != null) {
                        if (stringResponse.isEmpty()){
                            messageLabel.set("Tec not found");
                            viewVisibility(invisible,invisible,visible);
                        }else {
                            changeTecDataSet(stringResponse);
                            viewVisibility(invisible,visible,invisible);
                        }
                    }
                }
            }

            @Override
            public void onFailure(@NonNull Call<List<Tec>> call, @NonNull Throwable t) {
                //String errorMessage = NetworkError.getNetworkErrorMessage(t);
                messageLabel.set("");
                viewVisibility(invisible,invisible,visible);
            }
        });
    }

    private void viewVisibility(int progress, int recyclerView, int label){
        tecProgress.set(progress);
        tecLabel.set(label);
        tecRecycler.set(recyclerView);

    }


    public void refreshTecList(int pageNumber) {
        tecList.clear();
        fetchTecList(pageNumber);
    }

    public void loadMoreData(int pageNumber){
        fetchTecList(pageNumber);
    }


    private void changeTecDataSet(List<Tec> tecs) {
        tecList.addAll(tecs);
        setChanged();
        notifyObservers();
    }

    public List<Tec> getTecList() {
        return tecList;
    }


    public void reset() {
        context = null;
    }


}
