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

public class ListCabrioletAdapter extends RecyclerView.Adapter<ListCabrioletAdapter.ListViewHolder> {

    private ArrayList<cabriolet> listcabriolet;

    public ListCabrioletAdapter(ArrayList<cabriolet>list){
        this.listcabriolet = list;

    }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_row_cars, viewGroup, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ListViewHolder holder, int position) {
        cabriolet cabriolet = listcabriolet.get(position);
            Glide.with(holder.itemView.getContext())
                .load(cabriolet.getPhoto())
                .apply(new RequestOptions().override(55,55))
                .into(holder.photo);

            holder.name.setText(cabriolet.getName());
            holder.detail.setText(cabriolet.getDetail());


    }

    @Override
    public int getItemCount() {
        return listcabriolet.size();
    }

    class ListViewHolder extends RecyclerView.ViewHolder {

        ImageView photo;
        TextView name,detail;


        public ListViewHolder(@NonNull View itemView) {
            super(itemView);
            photo = itemView.findViewById(R.id.img_item_photo);
            name = itemView.findViewById(R.id.tv_item_name);
            detail = itemView.findViewById(R.id.tv_item_detail);

        }
    }
}
