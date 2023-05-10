package com.gnapse.jenny.baseproject;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.gnapse.jenny.baseproject.databinding.ListItemBinding;
import java.util.ArrayList;

public class ItemListAdapter extends RecyclerView.Adapter <ItemListAdapter.ItemViewHolder> {
    private ArrayList<Item> items;

    @NonNull
    @Override
    public ItemViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        ListItemBinding listItemBinding = DataBindingUtil.inflate(LayoutInflater.from(viewGroup.getContext()),
            R.layout.list_item, viewGroup, false);
        return new ItemViewHolder(listItemBinding);
    }

    @Override
    public void onBindViewHolder(@NonNull ItemViewHolder itemViewHolder, int position) {
        Item currentItem = items.get(position);
        itemViewHolder.listItemBinding.setItem(currentItem);
    }

    @Override
    public int getItemCount() {
        if(items != null) {
            return items.size();
        } else {
            return 0;
        }
    }

    public void setItems(ArrayList<Item> items) {
        this.items = items;
        notifyDataSetChanged();
    }

    public class ItemViewHolder extends RecyclerView.ViewHolder {
        private ListItemBinding listItemBinding;
        public ItemViewHolder(@NonNull ListItemBinding listItemBinding) {
            super(listItemBinding.getRoot());
            this.listItemBinding = listItemBinding;
        }
    }
}
