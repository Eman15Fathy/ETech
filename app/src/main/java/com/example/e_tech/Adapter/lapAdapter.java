package com.example.e_tech.Adapter;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.constraint.ConstraintLayout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.e_tech.Activities.Mobile_detailsActivity;
import com.example.e_tech.Laptops.Laptop;
import com.example.e_tech.Mobiles.Mobile;
import com.example.e_tech.R;

import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;

public class lapAdapter extends ArrayAdapter {


    private ArrayList<Laptop> laptopArrayList = new ArrayList<>();



    public lapAdapter(@NonNull Context context, @NonNull ArrayList<Laptop> laptops) {
        super(context, 0, laptops);
        laptopArrayList = laptops ;
    }

    @NonNull
    @Override
    public View getView(final int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        if(convertView ==null) {

            convertView = LayoutInflater.from(getContext()).inflate(R.layout.laptops_row, parent, false);
        }

        ConstraintLayout item = convertView.findViewById(R.id.lap_item);
        TextView tv_name = convertView.findViewById(R.id.laptop_title) ;
        TextView tv_disc = convertView.findViewById(R.id.laptop_desc);
        TextView tv_price = convertView.findViewById(R.id.laptop_price);
        ImageView imageView = convertView.findViewById(R.id.laptop_image);

        item.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent go = new Intent(getContext(), Mobile_detailsActivity.class);
                Bundle bundle = new Bundle();
                bundle.putString("name",laptopArrayList.get(position).getLaptop_name());
                bundle.putString("disc",laptopArrayList.get(position).getLaptop_desc());
                bundle.putDouble("price",laptopArrayList.get(position).getLaptop_price());
                bundle.putInt("image" ,laptopArrayList.get(position).getLaptop_image());
                go.putExtras(bundle);
                getContext().startActivity(go); }
        });


        tv_name.setText(laptopArrayList.get(position).getLaptop_name());
        tv_disc.setText(laptopArrayList.get(position).getLaptop_desc());
        tv_price.setText("" + laptopArrayList.get(position).getLaptop_price());
        imageView.setImageResource(laptopArrayList.get(position).getLaptop_image());

        return convertView;

    }}



