package com.example.techeventsapp.Adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.helper.widget.Layer;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.techeventsapp.Domain.ItemsDomain;
import com.example.techeventsapp.R;
import com.example.techeventsapp.activities.DetailsActivity;

import java.text.DecimalFormat;
import java.time.Instant;
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
        holder.titleText.setText(items.get(position).getTitle());
        holder.dateText.setText(items.get(position).getDate());
        holder.priceText.setText(String.format("€" + formatter.format(items.get(position).getPrice())));

        int drawableResouceId=holder.itemView.getResources().getIdentifier(items.get(position).getPic(),"drawable",holder.itemView.getContext().getPackageName());
        Glide.with(holder.itemView.getContext())
                .load(drawableResouceId)
                .into(holder.pic);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, DetailsActivity.class);
                intent.putExtra("object",items.get(position));
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView titleText,dateText,priceText;
        ImageView pic;

        public ViewHolder(@NonNull View itemView) {

            super(itemView);
            titleText = itemView.findViewById(R.id.titleText);
            dateText = itemView.findViewById(R.id.dateText);
            priceText = itemView.findViewById(R.id.priceText);
            pic = itemView.findViewById(R.id.pic);
        }
    }
}
