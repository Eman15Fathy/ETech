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
import com.example.e_tech.FlashOffers.Offers;
import com.example.e_tech.Mobiles.Mobile;
import com.example.e_tech.R;

import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;

public class offersAdapter extends ArrayAdapter {


    private ArrayList<Offers> offersArrayList = new ArrayList<>();



    public offersAdapter(@NonNull Context context, @NonNull ArrayList<Offers> offersArrayList1) {
        super(context, 0, offersArrayList1);
        offersArrayList = offersArrayList1 ;
    }

    @NonNull
    @Override
    public View getView(final int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        if(convertView ==null) {

            convertView = LayoutInflater.from(getContext()).inflate(R.layout.flash_row, parent, false);
        }

        ConstraintLayout item = convertView.findViewById(R.id.offers_item);
        TextView tv_name = convertView.findViewById(R.id.flash_title) ;
        TextView tv_disc = convertView.findViewById(R.id.flash_desc);
        TextView tv_price = convertView.findViewById(R.id.flash_price);
        TextView off_price = convertView.findViewById(R.id.off_price);
        ImageView imageView = convertView.findViewById(R.id.flash_image);

        item.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent go = new Intent(getContext(), Mobile_detailsActivity.class);
                Bundle bundle = new Bundle();
                bundle.putString("name",offersArrayList.get(position).getOffers_name());
                bundle.putString("disc",offersArrayList.get(position).getOffers_desc());
                bundle.putString("off",offersArrayList.get(position).getOffers_off());
                bundle.putDouble("price",offersArrayList.get(position).getOffers_price());
                bundle.putInt("image" ,offersArrayList.get(position).getOffers_image());
                go.putExtras(bundle);
                getContext().startActivity(go); }
        });


        tv_name.setText(offersArrayList.get(position).getOffers_name());
        tv_disc.setText(offersArrayList.get(position).getOffers_desc());
        tv_price.setText("" + offersArrayList.get(position).getOffers_price());
        off_price.setText(offersArrayList.get(position).getOffers_off());
        imageView.setImageResource(offersArrayList.get(position).getOffers_image());

        return convertView;

    }}




