package com.springtask2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("beans.xml");
        Student student2= (Student) applicationContext.getBean("student2");
        Address address= (Address) applicationContext.getBean("address1");

        System.out.println(student2);
        System.out.println(address);
    }
}
