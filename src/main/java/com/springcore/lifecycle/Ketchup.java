package com.springcore.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Ketchup {
    private String color;

    @Override
    public String toString() {
        return "Ketchup{" +
                "color='" + color + '\'' +
                '}';
    }

    public Ketchup() {
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    @PostConstruct
    public void start(){
        System.out.println("Starting Method");
    }
    @PreDestroy
    public void end(){
        System.out.println("Ending Method");
    }
}
