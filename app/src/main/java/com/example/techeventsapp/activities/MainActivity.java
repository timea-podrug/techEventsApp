package com.example.techeventsapp.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.techeventsapp.Adapter.ItemsAdapter;
import com.example.techeventsapp.Domain.ItemsDomain;
import com.example.techeventsapp.R;

import java.util.ArrayList;
import java.util.Objects;

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
                " For those craving a bite to eat, the menu will have that, as well.","Just chilling","Nikolina Kukoč",0,"pic1",true,true,true));

        ItemsArrayList.add(new ItemsDomain("Green Future Conference"," 1. i 2.6.2023. ","The Green Future Conference in Split brings together \n international and domestic technology leaders, companies, institutions, decision makers,\n scientists and other stakeholders from the sustainable development sector.\n" +
                 "\n"+
                "The aim of this conference is to position \n Croatia and Split on the world map of events \n when talking about sustainability, green transition and new technologies.","New Technologies, green future","multiple",150,"pic22",true,true,true));

        ItemsArrayList.add(new ItemsDomain("BlockSplit","23,24,25.5.2023","Meet web3 startups, developers, researchers, investors,\n designers and more from all over the world","AI","multiple",60,"pic3",true,true,true));
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