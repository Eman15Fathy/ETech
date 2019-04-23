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
import com.example.e_tech.Mobiles.Mobile;
import com.example.e_tech.R;
import com.example.e_tech.Tablets.Tablet;

import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;

public class tabAdapter extends ArrayAdapter {


    private ArrayList<Tablet> tablets = new ArrayList<>();



    public tabAdapter(@NonNull Context context, @NonNull ArrayList<Tablet> tabletss) {
        super(context, 0, tabletss);
        tablets = tabletss ;
    }

    @NonNull
    @Override
    public View getView(final int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        if(convertView ==null) {

            convertView = LayoutInflater.from(getContext()).inflate(R.layout.tablets_row, parent, false);
        }

        ConstraintLayout item = convertView.findViewById(R.id.item);
        TextView tv_name = convertView.findViewById(R.id.tab_title) ;
        TextView tv_disc = convertView.findViewById(R.id.tab_desc);
        TextView tv_price = convertView.findViewById(R.id.tab_price);
        ImageView imageView = convertView.findViewById(R.id.tab_image);

        item.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent go = new Intent(getContext(), Mobile_detailsActivity.class);
                Bundle bundle = new Bundle();
                bundle.putString("name",tablets.get(position).getTab_name());
                bundle.putString("disc",tablets.get(position).getTab_desc());
                bundle.putDouble("price",tablets.get(position).getTab_price());
                bundle.putInt("image" ,tablets.get(position).getTab_image());
                go.putExtras(bundle);
                getContext().startActivity(go); }
        });


        tv_name.setText(tablets.get(position).getTab_name());
        tv_disc.setText(tablets.get(position).getTab_desc());
        tv_price.setText("" + tablets.get(position).getTab_price());
        imageView.setImageResource(tablets.get(position).getTab_image());

        return convertView;

    }}

