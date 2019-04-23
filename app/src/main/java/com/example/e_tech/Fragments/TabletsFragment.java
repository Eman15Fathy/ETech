package com.example.e_tech.Fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.e_tech.Adapter.mobileAdapter;
import com.example.e_tech.Adapter.tabAdapter;
import com.example.e_tech.Mobiles.Mobile;
import com.example.e_tech.R;
import com.example.e_tech.Tablets.Tablet;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class TabletsFragment extends Fragment {


    public TabletsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_tablets, container, false);

        // Inflate the layout for this fragment}

        ArrayList<Tablet> tablets = new ArrayList<>();

Tablet tab1, tab2, tab3;

tablets.add(tab1= new Tablet("Samsung Galaxy Tab ", "Samsung Galaxy Tab A T285, 7 Inch, 8GB, 4G, LTE - White\n", 2649, R.drawable.tab1));

        tablets.add(tab2= new Tablet("SICO Tab Express ", "SICO Tab Express 3, 7 Inch, 8GB, 3G - Gold\n", 1150
                , R.drawable.tab2));
        tablets.add(tab1= new Tablet("iLife Kids Tab ", "iLife Kids Tab 4 Tablet, 7 Inch, 8 GB- Pink\n", 1199
                , R.drawable.tab3));

        ListView listView = view.findViewById(R.id.tablets_list_view);

        tabAdapter tabAdapter = new tabAdapter(view.getContext(), tablets);


        listView.setAdapter(tabAdapter);

        return view;
    }}

