package com.springcore.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("lifecycleconfig.xml");
//        Samosa s1 = (Samosa) context.getBean("s1");
//        System.out.println(s1);
        //registering shutdown hook it is there in abstract application context normal wale se nhi ho paaya
        context.registerShutdownHook();

//        Pepsi p1=(Pepsi) context.getBean("p1");
//        System.out.println(p1);

        Ketchup ketchup = (Ketchup) context.getBean("ketchup");
        System.out.println(ketchup);
    }
}
