package com.example.cw7;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Bundle a = getIntent().getExtras();

        TextView itemName = findViewById(R.id.itemName);
        TextView itemPrice = findViewById(R.id.itemprice);
        TextView itemowner = findViewById(R.id.owner);
        TextView itemdescription = findViewById(R.id.description);
        ImageView itemImage = findViewById(R.id.itemImage);

        Items item1 = (Items) a.getSerializable("painting");

        itemName.setText(item1.getItemName());
        itemPrice.setText(String.valueOf(item1.getItemPrice()));
        itemowner.setText(item1.getItemArtist());
        itemImage.setImageResource(item1.getItemImage());
        itemdescription.setText(item1.getItemDescription());
    }
}