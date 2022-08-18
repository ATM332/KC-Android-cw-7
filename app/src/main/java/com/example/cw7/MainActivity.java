package com.example.cw7;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList <Items> items = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Items num1 = new Items("Vietnam", "A",R.drawable.vietnam, 20);
        Items num2 = new Items("Horse", "FZ",R.drawable.horse,25);
        Items num3 = new Items("Xiao", "R",R.drawable.xiao, 20);
        Items num4 = new Items("Zhlongi","R",R.drawable.zhlongi,17);
        Items num5 = new Items("Starry Night", "A", R.drawable.starry_night, 15);
        Items num6 = new Items("Pradoxical feelings", "FZ",R.drawable.pradox,20);
        Items num7 = new Items("Galazy", "A",R.drawable.galaxy, 10);
        Items num8 = new Items("Satoru Gojo", "R",R.drawable.satoru_gojo, 25);
        Items num9= new Items("chains", "FZ",R.drawable.chains,14);

        items.add(num1);
        items.add(num2);
        items.add(num3);
        items.add(num4);
        items.add(num5);
        items.add(num6);
        items.add(num7);
        items.add(num8);
        items.add(num9);

        ListView itemslist = findViewById(R.id.listView);

        ItemAdapter a = new ItemAdapter(this, 0,items);

        itemslist.setAdapter(a);









    }
}