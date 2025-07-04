package com.springcore.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("collectionconfig.xml");
        Emp emp1=(Emp) context.getBean("Emp1");

        System.out.println(emp1.getName());
        System.out.println(emp1.getPhones());
        System.out.println(emp1.getAddress());
        System.out.println(emp1.getCourses() );
        System.out.println(emp1.getProps());
        System.out.println(emp1.getPhones().getClass().getName());
    }
}
