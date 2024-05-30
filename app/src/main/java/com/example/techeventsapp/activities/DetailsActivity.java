package com.example.techeventsapp.activities;

import androidx.appcompat.app.AppCompatActivity;

<<<<<<< HEAD
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
=======
import android.os.Bundle;
>>>>>>> fc4498323e9a1cba19115dae6aa930bcc7f79fe6
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.techeventsapp.Domain.ItemsDomain;
import com.example.techeventsapp.R;

import java.text.DecimalFormat;

public class DetailsActivity extends AppCompatActivity {
    private TextView titleText,dateText,wifiText,foodText,drinkText,descriptionText,priceText;
    private ItemsDomain item;
    private ImageView pic;
<<<<<<< HEAD
    private Button btn;
=======
>>>>>>> fc4498323e9a1cba19115dae6aa930bcc7f79fe6
    DecimalFormat formatter=new DecimalFormat("###,###,###.##");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        initView();
        setVariable();
    }

    private void setVariable() {
        item=(ItemsDomain) getIntent().getSerializableExtra("object");
        titleText.setText(item.getTitle());
        dateText.setText(item.getDate());
        wifiText.setText(item.getWifi()+"Wifi");
        foodText.setText(item.getFood()+"Food");
        drinkText.setText(item.getDrink()+"Drink");
        descriptionText.setText(item.getDescription());
        priceText.setText("€"+formatter.format(item.getPrice()));


        if(item.isWifi()){
            wifiText.setText("Wifi");

        }else{
            wifiText.setText("No-Wifi");
        }
        if(item.isDrink()){
            drinkText.setText("Drinks");

        }else{
            drinkText.setText("No drinks");
        }
        if(item.isFood()){
            foodText.setText("Food");

        }else{
            foodText.setText("No food");
        }
        int drawableResourceId=getResources().getIdentifier(item.getPic(),"drawable",getPackageName());
        Glide.with(this)
                .load(drawableResourceId)
                .into(pic);

    }

    private void initView() {
        titleText=findViewById(R.id.titleText);
        dateText=findViewById(R.id.dateText);
        wifiText=findViewById(R.id.wifiText);
        foodText=findViewById(R.id.foodText);
        drinkText=findViewById(R.id.drinkText);
        descriptionText=findViewById(R.id.descriptionText);
        pic=findViewById(R.id.pic);
        priceText=findViewById(R.id.priceText);
<<<<<<< HEAD
        btn=findViewById(R.id.button);
        btn.setOnClickListener(v -> startActivity(new Intent(DetailsActivity.this,SignUpActivity.class)));
=======
>>>>>>> fc4498323e9a1cba19115dae6aa930bcc7f79fe6
    }
}