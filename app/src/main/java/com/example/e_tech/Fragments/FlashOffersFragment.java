package com.example.e_tech.Fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.e_tech.Adapter.mobileAdapter;
import com.example.e_tech.Adapter.offersAdapter;
import com.example.e_tech.FlashOffers.Offers;
import com.example.e_tech.Mobiles.Mobile;
import com.example.e_tech.R;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class FlashOffersFragment extends Fragment {


    public FlashOffersFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.fragment_flash_offers, container, false);


        ArrayList<Offers> offersArrayList = new ArrayList<>();


        Offers off1, off2 , off3, off4, off5, off6, off7 ,off8;

       offersArrayList.add(off1= new Offers("Motorola G6\n", "Color : Blue\n" +
                "Operating System Type : Android\n" +
                "Storage Capacity : 64 GB\n" +
                "Number Of SIM : Dual SIM\n" +
                "Rear Camera Resolution : null\n" +
                "Mobile Phone Type : Smartphone\n" +
                "Cellular Network Technology : 4G LTE", 3775, R.drawable.off1, "12 % OFF\n"));

offersArrayList.add(off2= new Offers("Samsung Galaxy Note 9", "Dual SIM - 128GB, 6GB RAM, 4G LTE, Lavender Purple",13998, R.drawable.off2, "10 % OFF\n"));
        offersArrayList.add(off3= new Offers("Apple iPhone X", "Apple iPhone X with FaceTime - 64GB, 4G LTE, Silver\n",16998, R.drawable.off3, "11 % OFF\n"));

        offersArrayList.add(off4= new Offers("Apple iPhone 7 ", "with FaceTime - 32GB, 4G LTE, Silver\n",10695, R.drawable.off4, "14 % OFF\n"));

        offersArrayList.add(off5= new Offers("Active Car Holder", "Active Car Holder Compatible With Apple Iphone, Black\n",29.95, R.drawable.off5, "50 % OFF\n"));

        offersArrayList.add(off6= new Offers("Silicone Thumb ", "Silicone Thumb OK Design Stand Holder For Mobile Phones & Tablets - Blue\n",24.50, R.drawable.off6, "30 % OFF\n"));

        offersArrayList.add(off7= new Offers("Car Holder", "Universal Car Holder Desktop bed lazy bracket Kit Holder mobile Stand white\n",24.74, R.drawable.off7, "40 % OFF\n"));

        offersArrayList.add(off8= new Offers("HP 15-Ra009ne Notebook", "HP 15-Ra009ne Notebook, Celeron N3060, 15.6 Inch HD, 500 GB, 4 GB Ram, Free Dos - Black\n",3999, R.drawable.off8, "19 % OFF\n"));


        ListView listView = view.findViewById(R.id.offers_list_view);

        offersAdapter offersAdapter = new offersAdapter(view.getContext(), offersArrayList);


        listView.setAdapter(offersAdapter);

        return view;
    }}