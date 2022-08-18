package com.example.cw7;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class ItemAdapter extends ArrayAdapter<Items> {

    List<Items> itemsList;

    public ItemAdapter(@NonNull Context context, int resource, @NonNull List<Items> objects) {
        super(context, resource, objects);

        itemsList= objects;

    }


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item, parent, false);

        Items currentpainting = itemsList.get(position);

        TextView paintName = v.findViewById(R.id.paintname);
        TextView artistName = v.findViewById(R.id.artist);
        TextView price = v.findViewById(R.id.price);
        ImageView painting = v.findViewById(R.id.painting);

        paintName.setText(currentpainting.getItemName());
        artistName.setText(currentpainting.getItemArtist());
        price.setText(String.valueOf(currentpainting.getItemPrice()));
        painting.setImageResource(currentpainting.getItemImage());



        return v;


    }
}
