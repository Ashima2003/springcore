package com.springcore.lifecycle;

public class Samosa {
    private double price;

    @Override
    public String toString() {
        return "Samosa{" +
                "price=" + price +
                '}';
    }

    public Samosa() {

    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        System.out.println("Setting price");
        this.price = price;
    }

    public void init(){
        System.out.println("Inside init");
    }

    public void destroy(){
        System.out.println("Inside destroy");
    }
}
