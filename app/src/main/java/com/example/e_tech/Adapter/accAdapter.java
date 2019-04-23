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

import com.example.e_tech.Accesories.Accesories;
import com.example.e_tech.Activities.Mobile_detailsActivity;
import com.example.e_tech.Mobiles.Mobile;
import com.example.e_tech.R;

import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;

public class accAdapter extends ArrayAdapter {


    private ArrayList<Accesories> accesoriesArrayList = new ArrayList<>();



    public accAdapter(@NonNull Context context, @NonNull ArrayList<Accesories> accesories) {
        super(context, 0, accesories);
       accesoriesArrayList = accesories ;
    }

    @NonNull
    @Override
    public View getView(final int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        if(convertView ==null) {

            convertView = LayoutInflater.from(getContext()).inflate(R.layout.accesories_row, parent, false);
        }

        ConstraintLayout item = convertView.findViewById(R.id.acc_item);
        TextView tv_name = convertView.findViewById(R.id.acc_title) ;
        TextView tv_disc = convertView.findViewById(R.id.acc_desc);
        TextView tv_price = convertView.findViewById(R.id.acc_price);
        ImageView imageView = convertView.findViewById(R.id.acc_image);

        item.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent go = new Intent(getContext(), Mobile_detailsActivity.class);
                Bundle bundle = new Bundle();
                bundle.putString("name",accesoriesArrayList.get(position).getAcc_name());
                bundle.putString("disc",accesoriesArrayList.get(position).getAcc_desc());
                bundle.putDouble("price",accesoriesArrayList.get(position).getAcc_price());
                bundle.putInt("image" ,accesoriesArrayList.get(position).getAcc_image());
                go.putExtras(bundle);
                getContext().startActivity(go); }
        });


        tv_name.setText(accesoriesArrayList.get(position).getAcc_name());
        tv_disc.setText(accesoriesArrayList.get(position).getAcc_desc());
        tv_price.setText("" + accesoriesArrayList.get(position).getAcc_price());
        imageView.setImageResource(accesoriesArrayList.get(position).getAcc_image());

        return convertView;

    }}



