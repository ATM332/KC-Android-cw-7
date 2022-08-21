package com.example.cw7;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
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

        ImageView delete = v.findViewById(R.id.delete);

        delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder dialog = new AlertDialog.Builder(getContext());
                dialog.setCancelable(false);
                dialog.setTitle("Dialog on Android");
                dialog.setMessage("Are you sure you want to delete this entry?" );
                dialog.setPositiveButton("Delete", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int id) {
                                itemsList.remove(position);
                                notifyDataSetChanged();
                            }
                        })
                        .setNegativeButton("Cancel ", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                //Action for "Cancel".
                            }
                        });

                final AlertDialog alert = dialog.create();
                alert.show();

            }
        });



        return v;


    }
}
