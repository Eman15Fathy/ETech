package com.example.e_tech.Fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.e_tech.Adapter.lapAdapter;
import com.example.e_tech.Adapter.mobileAdapter;
import com.example.e_tech.Laptops.Laptop;
import com.example.e_tech.Mobiles.Mobile;
import com.example.e_tech.R;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class LaptopsFragment extends Fragment {


    public LaptopsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_laptops, container, false);

        // Inflate the layout for this fragment

    ArrayList<Laptop> laptopArrayList = new ArrayList<>();

    Laptop lap1 , lap2 , lap3 , lap4 , lap5 , lap6 , lap7 , lap8 , lap9 , lap10;

    laptopArrayList.add(lap1 = new Laptop("Lenovo Ideapad 330 Laptop", "Intel Core i5-8250, 15.6 Inch, 2T, 8GB RAM, DOS - Black\n", 11199,R.drawable.lap1));

        laptopArrayList.add(lap2 = new Laptop(" Dell Inspiron G3 3579 Laptop", "Intel Core i7-8750U, 15.6 Inch, 1TB+256GB, 16GB RAM, Dos - Black\n", 22399
                ,R.drawable.lap2));

        laptopArrayList.add(lap1 = new Laptop("Huawei MateBook D Laptop", "Intel core i7-8550U, 14 Inch, 256GB, 8GB RAM, Dos - Silver", 20387
                ,R.drawable.lap3));

        laptopArrayList.add(lap4 = new Laptop("Lenovo Yoga 530 Laptop", "Intel Core i5-8250U, 14 Inch, 256GB, 8GB RAM, Windows 10 - Black", 17799
                ,R.drawable.lap4));

        laptopArrayList.add(lap5 = new Laptop("Apple MacBook Pro 2016", "Laptop with Touch Bar MLW82 - Intel Core i7 2.7GHz, 15Inch, 512GB SSD, 16GB RAM, 2GB VGA Radeon Pro 455, English-Arabic Keyboard, macOS, Silver - Middle East Version", 23499,R.drawable.lap6));
        laptopArrayList.add(lap6 = new Laptop("Dell G5-5587 Gaming Laptop", "Intel Core i7-8750H - 15.6 inch - 16GB RAM - 1TB HDD with 256GB SSD - Nvidia 6GB - Ubuntu - Black", 11199,R.drawable.lap1));
        laptopArrayList.add(lap7 = new Laptop("Dell Alienware 17-K0336", "Processor Intel core i7-7700HQ , 256GB SSD with 1TB HDD , 32GB RAM , 17.3 inch screen , Nvidia Geforce GTX 1070, Windows 10 Home , Black", 43115,R.drawable.lap7));
        laptopArrayList.add(lap8 = new Laptop("HP Omen - 15-Dc0005Ne", "Intel Core I7-8750H - 15.6 Inch 4K Screen - 16Gb - 1Tb - 256Gb Ssd - Nvidia 4Gb - Windows 10 - Shadow Black", 28999,R.drawable.lap8));
        laptopArrayList.add(lap9 = new Laptop("Lenovo Ideapad 330 Laptop", "Intel Core I3-7020U, 15.6 Inch Hd, 4GB Ram, 1Tb, Amd Radeon 530 2Gb, Dos, Platinum Grey", 6399,R.drawable.lap9));
        laptopArrayList.add(lap10 = new Laptop("Lenovo IdeaPad 520 Laptop", "Intel Core i7-8550U, 15.6 Inch FHD, 2TB, 16GB RAM, 4GB VGA, Windows 10, En-Ar Keyboard, Gold", 16999,R.drawable.lap10));

        ListView listView = view.findViewById(R.id.laptops_listview);

        lapAdapter lapAdapter = new lapAdapter(view.getContext(), laptopArrayList);


        listView.setAdapter(lapAdapter);

        return view;
    }}


