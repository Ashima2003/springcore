package com.springcore.auto.wire;

public class Employee {
    @Override
    public String toString() {
        return "Employee{" +
                "address=" + address +
                '}';
    }

    private Address address;

    public Employee(Address address) {
        this.address = address;
    }

    public Employee() {
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
