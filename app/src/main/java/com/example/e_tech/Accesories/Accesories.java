package com.example.e_tech.Accesories;

public class Accesories {


    String acc_name;
    String acc_desc;
    double acc_price;
    int acc_image;

    public Accesories(String acc_name, String acc_desc, double acc_price, int acc_image) {
        this.acc_name = acc_name;
        this.acc_desc = acc_desc;
        this.acc_price = acc_price;
        this.acc_image = acc_image;
    }

    public String getAcc_name() {
        return acc_name;
    }

    public void setAcc_name(String acc_name) {
        this.acc_name = acc_name;
    }

    public String getAcc_desc() {
        return acc_desc;
    }

    public void setAcc_desc(String acc_desc) {
        this.acc_desc = acc_desc;
    }

    public double getAcc_price() {
        return acc_price;
    }

    public void setAcc_price(double acc_price) {
        this.acc_price = acc_price;
    }

    public int getAcc_image() {
        return acc_image;
    }

    public void setAcc_image(int acc_image) {
        this.acc_image = acc_image;
    }
}
