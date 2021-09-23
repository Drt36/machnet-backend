package com.question1;

import java.util.Arrays;

public class SumIntArray {

    public static void main(String[] args) {
        int size=50;
        int[] intArray=new int[size];

        for(int i=1;i<=50;i++){
            intArray[i-1]=i;
        }

        int sum= Arrays.stream(intArray).reduce(0,(acc,element)->acc+element);
        System.out.println("Sum of Given Array: "+sum);
    }
}
