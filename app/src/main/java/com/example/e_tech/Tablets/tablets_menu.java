package com.example.e_tech.Tablets;

import java.util.ArrayList;

public class tablets_menu {


        String menu_name;

        String menu_desc;

        int menu_image;

        ArrayList<Tablet> tabletArrayList = new ArrayList<>();

    public tablets_menu(String menu_name, String menu_desc, int menu_image, ArrayList<Tablet> tabletArrayList) {
        this.menu_name = menu_name;
        this.menu_desc = menu_desc;
        this.menu_image = menu_image;
        this.tabletArrayList = tabletArrayList;
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

    public ArrayList<Tablet> getTabletArrayList() {
        return tabletArrayList;
    }

    public void setTabletArrayList(ArrayList<Tablet> tabletArrayList) {
        this.tabletArrayList = tabletArrayList;
    }
}
