package com.example.e_tech.Fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.e_tech.Adapter.mobileAdapter;
import com.example.e_tech.Mobiles.Mobile;
import com.example.e_tech.R;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class MobilesFragment extends Fragment {


    public MobilesFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_mobiles, container, false);

        // Inflate the layout for this fragment}

    ArrayList<Mobile> mobiles = new ArrayList<>();

    Mobile mobile1 , mobile2 , mobile3, mobile4, mobile5, mobile6 , mobile7 , mobile8 , mobile9,

    mobile10, mobile11, mobile12, mobile13, mobile14, mobile15;

mobile1 = new Mobile("Samsung Galaxy S10", "Samsung Galaxy S10 Dual Sim, 128GB, 4G LTE - Black With Clear View Cover (Pre-order)\n", 16599,(R.drawable.mobile1) );

mobile2 = new Mobile("Honor 8C ", "Honor 8C Dual Sim, 32GB, 4G LTE - Blue\n", 2799 , R.drawable.mobile2);

mobile3 = new Mobile("Apple iPhone 6","Apple iPhone 6, 32 GB, 4G LTE- Gold" , 6799 , R.drawable.m3 );

mobile4 = new Mobile( "Apple iPhone Xs" , "Apple iPhone Xs Dual Sim, 256GB, 4G LTE - Space Grey\n", 28300 , R.drawable.m4);

mobile5= new Mobile("HTC One X9 ", "HTC One X9 Dual Sim, 32GB, 4G, LTE - Gold", 3499 , R.drawable.m5);

mobile6 = new Mobile("Lenovo K8 Note ", "Lenovo K8 Note Dual Sim, 64GB, 4G LTE- Gold", 3199 , R.drawable.m6);

mobile7 = new Mobile("Nokia 5.1 Plus", "Nokia 5.1 Plus Dual Sim, 32GB, 4G LTE - White" , 3650 ,R.drawable.m7);

mobile8 = new Mobile( "Sony Xperia XZ1" , "Sony Xperia XZ1 Dual Sim, 64 GB, 4G LTE- Pink\n" , 5999, R.drawable.m8);

mobile9 = new Mobile(" Tecno F2" , "Tecno F2 Dual Sim, 8GB, 3G- Gold\n" , 1099 , R.drawable.m9 );

mobile10 = new Mobile( " Infinix S3 X573" , " Infinix S3 X573 Dual Sim, 32GB, 4G LTE - Black\n" , 2999 , R.drawable.m10);

mobile11 = new Mobile( " Alcatel 5 5086D" , " Alcatel 5 5086D Dual Sim, 32GB, 4G LTE - Black\n" , 2999 , R.drawable.m11);

mobile12 = new Mobile(" Xiaomi Mi A2 Lite" , " Xiaomi Mi A2 Lite Dual Sim, 64GB, 4G LTE - Black" , 3333 , R.drawable.m12);

mobile13 = new Mobile( " Xiaomi Mi A1" , " Xiaomi Mi A1 Dual Sim, 32 GB, 4G LTE - Red", 3666 , R.drawable.m13);

mobile14 = new Mobile(" Apple iPhone SE" , " Apple iPhone SE, 32GB, 4G LTE - Rose Gold\n" , 5888 , R.drawable.m14);

mobile15 = new Mobile( "Xiaomi Mi A1" , " Xiaomi Mi A1 Dual Sim, 32 GB, 4G LTE - Black\n" , 3499 , R.drawable.m15);

 mobiles.add(mobile15);

        mobiles.add(mobile1);
        mobiles.add(mobile2);
        mobiles.add(mobile3);
        mobiles.add(mobile4);
        mobiles.add(mobile5);
        mobiles.add(mobile6);
        mobiles.add(mobile7);
        mobiles.add(mobile8);
        mobiles.add(mobile9);
        mobiles.add(mobile10);
        mobiles.add(mobile11);
        mobiles.add(mobile12);
        mobiles.add(mobile13);
        mobiles.add(mobile14);


        ListView listView = view.findViewById(R.id.mobiles_listView);

        mobileAdapter mobileAdapter = new mobileAdapter(view.getContext(), mobiles);


        listView.setAdapter(mobileAdapter);

        return view;
}}
