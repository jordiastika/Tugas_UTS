package com.example.tugas_3;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class CardViewCabrioletAdapter extends RecyclerView.Adapter<CardViewCabrioletAdapter.CardViewHolder> {


    private ArrayList<cabriolet>listCabriolet;

    public CardViewCabrioletAdapter(ArrayList<cabriolet>list){
        this.listCabriolet = list;
    }


    @NonNull
    @Override
    public CardViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_cardview_cars, viewGroup, false);
        return new CardViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CardViewHolder holder, int position) {

        cabriolet cabriolet = listCabriolet.get(position);

        Glide.with(holder.itemView.getContext())
                .load(cabriolet.getPhoto())
                .apply(new RequestOptions().override(350,350))
                .into(holder.photo);

        holder.name.setText(cabriolet.getName());
        holder.list.setText(cabriolet.getList());
    }

    @Override
    public int getItemCount() {
        return listCabriolet.size();
    }

    public class CardViewHolder extends RecyclerView.ViewHolder {
        public ImageView photo;
        public TextView name;
        public TextView list;

        public CardViewHolder(@NonNull View itemView) {
            super(itemView);

            photo = itemView.findViewById(R.id.img_item_photo);
            name = itemView.findViewById(R.id.tv_item_name);
            list = itemView.findViewById(R.id.tv_item_list);
        }
    }
}
