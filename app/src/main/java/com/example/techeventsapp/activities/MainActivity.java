package com.example.techeventsapp.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.techeventsapp.Adapter.ItemsAdapter;
import com.example.techeventsapp.Domain.ItemsDomain;
import com.example.techeventsapp.R;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
private RecyclerView.Adapter adapterSoon,adapterNew;
private RecyclerView recyclerViewSoon,recyclerViewNew;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initRecyclerView();
    }

    private void initRecyclerView() {

        ArrayList<ItemsDomain> ItemsArrayList = new ArrayList<>();

        ItemsArrayList.add(new ItemsDomain("Locals'n'Nomads","29.5.2023","Our monthly dose of connecting locals and digital nomads \n " +
                "is ready and awaits only you to make it awesome.\n"+
                " A very usual thing for these meetups is lots of \n"+
                " good vibes and great networking over some really good drinks.\n"+
                " For those craving a bite to eat, the menu will have that, as well.","Just chilling","Nikolina Kukoč",0,"pic1",true));

        ItemsArrayList.add(new ItemsDomain("Locals'n'Nomads","29.5.2023","Our monthly dose of connecting locals and digital nomads \n " +
                "is ready and awaits only you to make it awesome.\n"+
                " A very usual thing for these meetups is lots of \n"+
                " good vibes and great networking over some really good drinks.\n"+
                " For those craving a bite to eat, the menu will have that, as well.","BlockChain","osoba2",0,"pic2",true));

        ItemsArrayList.add(new ItemsDomain("Locals'n'Nomads","29.5.2023","Our monthly dose of connecting locals and digital nomads \n " +
                "is ready and awaits only you to make it awesome.\n"+
                " A very usual thing for these meetups is lots of \n"+
                " good vibes and great networking over some really good drinks.\n"+
                " For those craving a bite to eat, the menu will have that, as well.","AI","osoba3",0,"pic3",true));
        recyclerViewSoon=findViewById(R.id.viewSoon);
        recyclerViewNew=findViewById(R.id.viewNew);

        recyclerViewSoon.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));
        recyclerViewNew.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));

        adapterNew=new ItemsAdapter(ItemsArrayList);
        adapterSoon=new ItemsAdapter(ItemsArrayList);

        recyclerViewNew.setAdapter(adapterNew);
        recyclerViewSoon.setAdapter(adapterSoon);
    }
}