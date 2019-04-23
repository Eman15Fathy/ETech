package com.example.e_tech.FlashOffers;


import java.util.ArrayList;

public class offers_menu {


    String menu_name;

    String menu_desc;

    int menu_image;

    ArrayList<Offers> offersArrayList = new ArrayList<>();

    public offers_menu(String menu_name, String menu_desc, int menu_image, ArrayList<Offers> offersArrayList) {
        this.menu_name = menu_name;
        this.menu_desc = menu_desc;
        this.menu_image = menu_image;
        this.offersArrayList = offersArrayList;
    }

    public String getMenu_name() {
        return menu_name;
    }

    public void setMenu_name(String menu_name) {
        this.menu_name = menu_name;
    }

    public String getMenu_desc() {
        return menu_desc;
    }

    public void setMenu_desc(String menu_desc) {
        this.menu_desc = menu_desc;
    }

    public int getMenu_image() {
        return menu_image;
    }

    public void setMenu_image(int menu_image) {
        this.menu_image = menu_image;
    }

    public ArrayList<Offers> getOffersArrayList() {
        return offersArrayList;
    }

    public void setOffersArrayList(ArrayList<Offers> offersArrayList) {
        this.offersArrayList = offersArrayList;
    }
}
