package com.example.e_tech.FlashOffers;

public class Offers {


    String offers_name;
    String offers_desc;
    double offers_price;
    int offers_image;
    String offers_off;

    public Offers(String offers_name, String offers_desc, double offers_price, int offers_image, String offers_off) {
        this.offers_name = offers_name;
        this.offers_desc = offers_desc;
        this.offers_price = offers_price;
        this.offers_image = offers_image;
        this.offers_off = offers_off;
    }

    public String getOffers_name() {
        return offers_name;
    }

    public void setOffers_name(String offers_name) {
        this.offers_name = offers_name;
    }

    public String getOffers_desc() {
        return offers_desc;
    }

    public void setOffers_desc(String offers_desc) {
        this.offers_desc = offers_desc;
    }

    public double getOffers_price() {
        return offers_price;
    }

    public void setOffers_price(double offers_price) {
        this.offers_price = offers_price;
    }

    public int getOffers_image() {
        return offers_image;
    }

    public void setOffers_image(int offers_image) {
        this.offers_image = offers_image;
    }

    public String getOffers_off() {
        return offers_off;
    }

    public void setOffers_off(String offers_off) {
        this.offers_off = offers_off;
    }
}
