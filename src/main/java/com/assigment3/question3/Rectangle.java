package com.assigment3.question3;

public class Rectangle {
    public static void main(String[] args) {
        Shape calcArea=((length, breadth) -> length*breadth);
        double areaOfRectangle=calcArea.calculateArea(5,6);
        System.out.println("Area of Rectangle: "+areaOfRectangle);
    }
}
