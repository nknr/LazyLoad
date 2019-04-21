package com.example.lazyload;

import android.databinding.DataBindingUtil;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.example.lazyload.databinding.TecItemBinding;
import java.util.ArrayList;
import java.util.List;

public class TecAdapter extends RecyclerView.Adapter<TecAdapter.ItemTecViewHolder> {

    private List<Tec> tecList;

    TecAdapter() {
        tecList = new ArrayList<>();
    }

    public void setTecList(List<Tec> list) {
        tecList.addAll(list);
        notifyDataSetChanged();
    }


    @NonNull
    @Override
    public ItemTecViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        TecItemBinding itemBinding = DataBindingUtil.inflate(LayoutInflater.from(parent.getContext()),
                R.layout.tec_item, parent, false);
        return new ItemTecViewHolder(itemBinding);

    }

    @Override
    public void onBindViewHolder(@NonNull ItemTecViewHolder holder, int position) {
        holder.itemBinding.setTec(tecList.get(position));
        holder.itemBinding.executePendingBindings();
    }


    @Override
    public int getItemCount() {
        return tecList.size();
    }

    public void clearTecList() {
        tecList.clear();
    }

     class ItemTecViewHolder extends RecyclerView.ViewHolder {
        TecItemBinding itemBinding;

        ItemTecViewHolder(TecItemBinding itemBinding) {
            super(itemBinding.projectItem);
            this.itemBinding = itemBinding;

        }

    }
}