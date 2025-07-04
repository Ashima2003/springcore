package com.springcore.standalone.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext con= new ClassPathXmlApplicationContext("alone-config.xml");
        Person person= con.getBean("person1", Person.class);
        System.out.println(person);
        System.out.println(person.getFriends().getClass().getName());
    }
}
