package com.springtask2.question1;

public class Calculator {
    public int calculate(int num1, char operator, int num2) {
        int result = 0;
        switch (operator) {
            case '+':
                result = num1 + num2;
                break;

            case '-':
                result = num1 - num2;
                break;

            case '*':
                result = num1 * num2;
                break;

            case '/':
                result = num1 / num2;
                break;

            default:
                System.out.println("Invalid Input!");
                break;
        }
        return result;
    }

}
