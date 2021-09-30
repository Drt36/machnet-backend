package com.springtask2.question2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(config.class);
        Student student1 = context.getBean("student", Student.class);
        Student student2 = context.getBean("student", Student.class);

        if (student1.hashCode() == student2.hashCode()) {
            System.out.println("Objects are same with hash code respectively: student 1--> " + student1.hashCode() + "  student2-->   " + student2.hashCode());
        } else {
            System.out.println("Objects are different with hash code respectively: student 1--> " + student1.hashCode() + "   student2-->   " + student2.hashCode());
        }

    }
}
