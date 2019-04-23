package com.example.e_tech.Laptops;

public class Laptop {

    String laptop_name;
    String laptop_desc;
    double laptop_price;
    int laptop_image;

    public Laptop(String laptop_name, String laptop_desc, double laptop_price, int laptop_image) {
        this.laptop_name = laptop_name;
        this.laptop_desc = laptop_desc;
        this.laptop_price = laptop_price;
        this.laptop_image = laptop_image;
    }

    public String getLaptop_name() {
        return laptop_name;
    }

    public void setLaptop_name(String laptop_name) {
        this.laptop_name = laptop_name;
    }

    public String getLaptop_desc() {
        return laptop_desc;
    }

    public void setLaptop_desc(String laptop_desc) {
        this.laptop_desc = laptop_desc;
    }

    public double getLaptop_price() {
        return laptop_price;
    }

    public void setLaptop_price(double laptop_price) {
        this.laptop_price = laptop_price;
    }

    public int getLaptop_image() {
        return laptop_image;
    }

    public void setLaptop_image(int laptop_image) {
        this.laptop_image = laptop_image;
    }
}
