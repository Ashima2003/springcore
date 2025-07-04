package com.springcore.auto.wire.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee {
    @Override
    public String toString() {
        return "Employee{" +
                "address=" + address +
                '}';
    }
    @Autowired
    @Qualifier("address2")
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
