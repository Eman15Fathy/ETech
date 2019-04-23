package com.example.e_tech.Mobiles;

public class Mobile {

    String mobile_name;
    String mobile_desc;
    double mobile_price;
    int mobile_image;


    public Mobile(String mobile_name, String mobile_desc, double mobile_price, int mobile_image) {
        this.mobile_name = mobile_name;
        this.mobile_desc = mobile_desc;
        this.mobile_price = mobile_price;
        this.mobile_image = mobile_image;
    }

    public String getMobile_name() {
        return mobile_name;
    }

    public void setMobile_name(String mobile_name) {
        this.mobile_name = mobile_name;
    }

    public String getMobile_desc() {
        return mobile_desc;
    }

    public void setMobile_desc(String mobile_desc) {
        this.mobile_desc = mobile_desc;
    }

    public double getMobile_price() {
        return mobile_price;
    }

    public void setMobile_price(double mobile_price) {
        this.mobile_price = mobile_price;
    }

    public int getMobile_image() {
        return mobile_image;
    }

    public void setMobile_image(int mobile_image) {
        this.mobile_image = mobile_image;
    }
}
