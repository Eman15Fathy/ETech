package com.example.e_tech.Tablets;

public class Tablet {


    String tab_name;
    String tab_desc;
    double tab_price;
    int tab_image;

    public Tablet(String tab_name, String tab_desc, double tab_price, int tab_image) {
        this.tab_name = tab_name;
        this.tab_desc = tab_desc;
        this.tab_price = tab_price;
        this.tab_image = tab_image;
    }

    public String getTab_name() {
        return tab_name;
    }

    public void setTab_name(String tab_name) {
        this.tab_name = tab_name;
    }

    public String getTab_desc() {
        return tab_desc;
    }

    public void setTab_desc(String tab_desc) {
        this.tab_desc = tab_desc;
    }

    public double getTab_price() {
        return tab_price;
    }

    public void setTab_price(double tab_price) {
        this.tab_price = tab_price;
    }

    public int getTab_image() {
        return tab_image;
    }

    public void setTab_image(int tab_image) {
        this.tab_image = tab_image;
    }
}
