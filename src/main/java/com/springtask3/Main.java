package com.springtask3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("beans.xml");
        Student student3= (Student) applicationContext.getBean("student3");
        Address address2= (Address) applicationContext.getBean("address2");

        System.out.println(student3);
        System.out.println(address2);
    }
}
