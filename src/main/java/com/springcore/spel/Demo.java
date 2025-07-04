package com.springcore.spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Demo {
    @Value("#{22+11}")
    private int x;
    private int y;
    @Value("#{T(java.lang.Math).sqrt(25)}")
    private double z;
    @Value("#{8>3}")
    private boolean isActive; //by default false

    @Override
    public String toString() {
        return "Demo{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                ", isActive=" + isActive +
                ", name='" + name + '\'' +
                ", e=" + e +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Value("#{new java.lang.String('Ashima Anand')}")
    private String name;

    public double getE() {
        return e;
    }

    public void setE(double e) {
        this.e = e;
    }

    @Value("#{T(java.lang.Math).E}")
    private double e;

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    public Demo() {
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
