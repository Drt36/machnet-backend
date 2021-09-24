package com.assigment3.question3;

public class Triangle {

    public static void main(String[] args) {
       Shape calcArea= (base,height) ->0.5*base*height;
       double areaOfTriangle=calcArea.calculateArea(10,5);
       System.out.println("Area Of Triangle: "+areaOfTriangle);
    }
}
