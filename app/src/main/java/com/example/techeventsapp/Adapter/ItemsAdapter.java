package com.example.techeventsapp.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.constraintlayout.helper.widget.Layer;
import androidx.recyclerview.widget.RecyclerView;

import com.example.techeventsapp.Domain.ItemsDomain;
import com.example.techeventsapp.R;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class ItemsAdapter extends  RecyclerView.Adapter<ItemsAdapter.ViewHolder>{
    public ItemsAdapter(ArrayList<ItemsDomain> items) {
        this.items = items;
        formatter=new DecimalFormat("###,###,###,###,##");
    }

    ArrayList<ItemsDomain> items;
DecimalFormat formatter;
Context context;
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View inflate= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_viewholder,parent,false);
        context=parent.getContext();
        return new ViewHolder(inflate);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
