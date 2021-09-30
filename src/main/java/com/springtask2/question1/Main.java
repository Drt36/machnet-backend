package com.springtask2.question1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(Calculator.class);
        Calculator calculator = context.getBean("calculator", Calculator.class);

        int addResult = calculator.calculate(4, '+', 5);
        int substractionResult = calculator.calculate(5, '-', 3);
        int multiplicationResult = calculator.calculate(5, '*', 3);
        int divisionResult = calculator.calculate(10, '/', 2);

        System.out.println("Add Result: " + addResult);
        System.out.println("Substraction Result: " + substractionResult);
        System.out.println("Multiplication Result: " + multiplicationResult);
        System.out.println("Division Result: " + divisionResult);


    }
}
