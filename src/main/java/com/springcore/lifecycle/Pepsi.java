package com.springcore.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Pepsi implements InitializingBean, DisposableBean {
    private double price;

    @Override
    public String toString() {
        return "Pepsi{" +
                "price=" + price +
                '}';
    }

    public Pepsi() {
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        //init kyunki properties set k baad init chlta h
        System.out.println("Init Pepsi");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Put bottle back. Destroy it.");
    }
}
