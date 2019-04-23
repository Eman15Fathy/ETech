package com.example.e_tech.Accesories;

import com.example.e_tech.Mobiles.Mobile;

import java.util.ArrayList;

public class Acc_menu {

    String menu_name;

    String menu_desc;

    int menu_image;

    ArrayList<Accesories> AccArrayList = new ArrayList<>();

    public Acc_menu(String menu_name, String menu_desc, int menu_image, ArrayList<Accesories> accArrayList) {
        this.menu_name = menu_name;
        this.menu_desc = menu_desc;
        this.menu_image = menu_image;
        AccArrayList = accArrayList;
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

    public ArrayList<Accesories> getAccArrayList() {
        return AccArrayList;
    }

    public void setAccArrayList(ArrayList<Accesories> accArrayList) {
        AccArrayList = accArrayList;
    }
}
