package com.example.tugas_3;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView cc_cabriolet;
    private ArrayList<cabriolet> list = new ArrayList<>();

    private void showRecyclerGrid(){
        cc_cabriolet.setLayoutManager(new GridLayoutManager(this,2));
        GridCabrioletAdapter gridCabrioletAdapter = new GridCabrioletAdapter(list);
        cc_cabriolet.setAdapter(gridCabrioletAdapter);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       cc_cabriolet =findViewById(R.id.cc_cabriolet);
       cc_cabriolet.setHasFixedSize(true);

       list.addAll(CabrioletData.getListData());
       showRecylerList();
    }

    private void showRecylerList() {
        cc_cabriolet.setLayoutManager(new LinearLayoutManager(this));
        ListCabrioletAdapter listCabrioletAdapter = new ListCabrioletAdapter(list);
        cc_cabriolet.setAdapter(listCabrioletAdapter);
    }


    private void showRecyclerCardView(){
        cc_cabriolet.setLayoutManager(new LinearLayoutManager(this));
        CardViewCabrioletAdapter cardViewCabrioletAdapter = new CardViewCabrioletAdapter(list);
        cc_cabriolet.setAdapter(cardViewCabrioletAdapter);
    }


    /*tampilan main_menu*/

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        setMode(item.getItemId());
        return super.onOptionsItemSelected(item);
    }

    public void setMode(int selectedMode) {
        switch (selectedMode) {
            case R.id.action_list:
                showRecylerList();
                break;

            case R.id.action_grid:
                showRecyclerGrid();
                break;

            case R.id.action_cardview:
                showRecyclerCardView();
                break;

        }
    }
}