package com.springcore.javaconfig;

public class Student {
    private Samosa samosa;
    public void study(){
        this.samosa.display();
        System.out.println("Student is reading book.");
    }
    @Override
    public String toString() {
        return "Student{}";
    }

    public Student(Samosa samosa) {
        this.samosa = samosa;
    }

    public Samosa getSamosa() {
        return samosa;
    }

    public void setSamosa(Samosa samosa) {
        this.samosa = samosa;
    }
}
