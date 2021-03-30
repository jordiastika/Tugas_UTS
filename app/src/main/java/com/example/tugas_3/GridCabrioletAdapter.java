package com.example.tugas_3;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class GridCabrioletAdapter extends RecyclerView.Adapter<GridCabrioletAdapter.GridViewHolder> {


    private ArrayList<cabriolet> listCabriolet;
    public GridCabrioletAdapter(ArrayList<cabriolet> list){
        this.listCabriolet = list;
    }


    @NonNull
    @Override
    public GridViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_grid_cars, viewGroup, false);
        return new GridViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull GridViewHolder holder, int position) {
        Glide.with(holder.itemView.getContext())
                .load(listCabriolet.get(position).getPhoto())
                .apply(new RequestOptions().override(350,350))
                .into(holder.photo);

    }


    @Override
    public int getItemCount() {
      return listCabriolet.size();
    }

    public class GridViewHolder extends RecyclerView.ViewHolder{
        public ImageView photo;

        public GridViewHolder(@NonNull View itemView) {
            super(itemView);
            photo = itemView.findViewById(R.id.img_item_photo);
        }
    }
}
