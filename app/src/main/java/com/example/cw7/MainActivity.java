package com.example.cw7;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;

import java.io.Serializable;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList <Items> items = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Items num1 = new Items("Vietnam", "A",R.drawable.vietnam, 20, "A painting about vietnames landscape made using acrylic paint colors.  Paints or other forms of color are commonly applied to using a paintbrush. However, artists do use different tools such as sponges, spray paint");
        Items num2 = new Items("Horse", "FZ",R.drawable.horse,25, "A horse portrate painted with oil paints");
        Items num3 = new Items("Xiao", "R",R.drawable.xiao, 20, "A game related charater drawn using penicls and markers");
        Items num4 = new Items("Zhlongi","R",R.drawable.zhlongi,17,"Paints or other forms of color are commonly applied to using a paintbrush. However, artists do use different tools such as sponges, spray paint");
        Items num5 = new Items("Starry Night", "A", R.drawable.starry_night, 15,"Paints or other forms of color are commonly applied to using a paintbrush. However, artists do use different tools such as sponges, spray paint");
        Items num6 = new Items("Pradoxical feelings", "FZ",R.drawable.pradox,20,"Paints or other forms of color are commonly applied to using a paintbrush. However, artists do use different tools such as sponges, spray paint");
        Items num7 = new Items("Galazy", "A",R.drawable.galaxy, 10, "Paints or other forms of color are commonly applied to using a paintbrush. However, artists do use different tools such as sponges, spray paint");
        Items num8 = new Items("Satoru Gojo", "R",R.drawable.satoru_gojo, 25, "Paints or other forms of color are commonly applied to using a paintbrush. However, artists do use different tools such as sponges, spray paint");
        Items num9= new Items("chains", "FZ",R.drawable.chains,14, "Paints or other forms of color are commonly applied to using a paintbrush. However, artists do use different tools such as sponges, spray paint");

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

        itemslist.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Items currentitem = items.get(i);

                Intent intent1 = new Intent(MainActivity.this , MainActivity2.class);
                intent1.putExtra("painting", currentitem);
                startActivity(intent1);
            }
        });










    }
}