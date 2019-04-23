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

import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.List;

public class mobileAdapter extends ArrayAdapter {


    private ArrayList <Mobile> mobiless = new ArrayList<>();



    public mobileAdapter(@NonNull Context context, @NonNull ArrayList<Mobile> mobiles) {
        super(context, 0, mobiles);
        mobiless = mobiles ;
    }

    @NonNull
    @Override
    public View getView(final int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        if(convertView ==null) {

            convertView = LayoutInflater.from(getContext()).inflate(R.layout.mobiles_row, parent, false);
        }

        ConstraintLayout item = convertView.findViewById(R.id.item);
        TextView tv_name = convertView.findViewById(R.id.mobile_title) ;
        TextView tv_disc = convertView.findViewById(R.id.mobile_desc);
        TextView tv_price = convertView.findViewById(R.id.mobile_price);
        ImageView imageView = convertView.findViewById(R.id.image);

        item.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent go = new Intent(getContext(), Mobile_detailsActivity.class);
                Bundle bundle = new Bundle();
                bundle.putString("name",mobiless.get(position).getMobile_name());
                bundle.putString("disc",mobiless.get(position).getMobile_desc());
                bundle.putDouble("price",mobiless.get(position).getMobile_price());
                bundle.putInt("image" ,mobiless.get(position).getMobile_image());
                go.putExtras(bundle);
                getContext().startActivity(go); }
        });


        tv_name.setText(mobiless.get(position).getMobile_name());
        tv_disc.setText(mobiless.get(position).getMobile_desc());
        tv_price.setText("" + mobiless.get(position).getMobile_price());
        imageView.setImageResource(mobiless.get(position).getMobile_image());

        return convertView;

    }}
