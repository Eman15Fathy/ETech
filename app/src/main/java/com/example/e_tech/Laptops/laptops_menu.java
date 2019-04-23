package com.example.e_tech.Laptops;

import java.util.ArrayList;

public class laptops_menu {


        String menu_name;

        String menu_desc;

        int menu_image;

        ArrayList<Laptop> laptopArrayList = new ArrayList<>();

    public laptops_menu(String menu_name, String menu_desc, int menu_image, ArrayList<Laptop> laptopArrayList) {
        this.menu_name = menu_name;
        this.menu_desc = menu_desc;
        this.menu_image = menu_image;
        this.laptopArrayList = laptopArrayList;
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

    public ArrayList<Laptop> getLaptopArrayList() {
        return laptopArrayList;
    }

    public void setLaptopArrayList(ArrayList<Laptop> laptopArrayList) {
        this.laptopArrayList = laptopArrayList;
    }
}
