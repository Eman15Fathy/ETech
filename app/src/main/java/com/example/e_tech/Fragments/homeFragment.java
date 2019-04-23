package com.example.e_tech.Fragments;


import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.e_tech.Activities.MainActivity;
import com.example.e_tech.R;



public class homeFragment extends Fragment {

    public homeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        final View view = inflater.inflate(R.layout.fragment_home, container, false);

        Button btn_deals = view.findViewById(R.id.btn_deals);

        btn_deals.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                Intent go = new Intent(getContext(),MainActivity.class);
                MainActivity.opened = 5;
                startActivity(go);

            }
        });

        Button btn_mobiles = view.findViewById(R.id.btn_mobiles);

        btn_mobiles.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent go = new Intent(getContext(),MainActivity.class);
                MainActivity.opened = 2;
                startActivity(go);
            }
        });

        Button btn_tablets = view.findViewById(R.id.btn_tablets);

        btn_tablets.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent go = new Intent(getContext(),MainActivity.class);
                MainActivity.opened = 3;
                startActivity(go);

            }
        });

        Button btn_laptops = view.findViewById(R.id.btn_laptops);

        btn_laptops.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent go = new Intent(getContext(),MainActivity.class);
                MainActivity.opened = 4;
                startActivity(go);
            }
        });

        Button btn_acc = view.findViewById(R.id.btn_acc);

        btn_acc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               Intent go = new Intent(getContext(),MainActivity.class);
               MainActivity.opened = 1;
               startActivity(go);
            }
        });

        return view;
    }

}
