package com.example.e_tech.Fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.e_tech.Accesories.Accesories;
import com.example.e_tech.Adapter.accAdapter;
import com.example.e_tech.Adapter.mobileAdapter;
import com.example.e_tech.Mobiles.Mobile;
import com.example.e_tech.R;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class AccesoriesFragment extends Fragment {


    public AccesoriesFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_accesories, container, false);

        // Inflate the layout for this fragment}

        ArrayList<Accesories> accesoriesArrayList= new ArrayList<>();

        Accesories acc1, acc2, acc3, acc4, acc5, acc6 , acc7;

accesoriesArrayList.add(acc1 = new Accesories("Headphone", "Samsung In-Ear Headphone, Green- HS130", 169, R.drawable.acc1));

        accesoriesArrayList.add(acc2 = new Accesories("Cable", "Samsung Multi Charging Cable- White", 299
                , R.drawable.acc2));
        accesoriesArrayList.add(acc3 = new Accesories("Power Bank", "ICONZ Power Bank, 6000mAh, Green - P602", 350, R.drawable.acc3));

        accesoriesArrayList.add(acc4 = new Accesories("Charger", "iKU Home Charger 4Port - Blue", 185, R.drawable.acc4));

        accesoriesArrayList.add(acc5 = new Accesories("Headset", "HP H2800 Stereo Headset, Blue- J9C30AA", 315, R.drawable.acc5));

        accesoriesArrayList.add(acc6 = new Accesories("Car Charger", "Tronsmart Car Charger, 2 Ports, 24 Watt, Black - C24\n", 99, R.drawable.acc6));

        accesoriesArrayList.add(acc7 = new Accesories("Cover", "Ttec Stardust Back Cover For iPhone 7/8 Plus - Gold\n", 225, R.drawable.acc7));

        ListView listView = view.findViewById(R.id.acc_list_view);

        accAdapter accAdapter = new accAdapter(view.getContext(), accesoriesArrayList);


        listView.setAdapter(accAdapter);

        return view;
    }}

