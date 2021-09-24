package com.assigment3.question1;

import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class NumConsumer {
    public static boolean isPrime(int input){
        int flag = 0;
        for (int i = 1; i <=(input/2); i++) {
            if ((input % i) == 0) {
                flag += 1;
            }
        }
        return flag==1;
    }

    public static boolean isOdd(int input){
        int flag = 0;
            if ((input % 2) != 0) {
                flag = 1;
            }
        return flag==1;
    }

    public static boolean isEven(int input){
        int flag = 0;
        if ((input % 2) == 0) {
            flag = 1;
        }
        return flag==1;
    }

    public static void numFilter(List<Integer> list){
        List<Integer> oddNumList=list.stream().filter(num->isOdd(num)).collect(Collectors.toList());
        List<Integer> evenNumList=list.stream().filter(num->isEven(num)).collect(Collectors.toList());
        List<Integer> primeNumList=list.stream().filter(num->isPrime(num)).collect(Collectors.toList());

        System.out.println("-------Filtered Numbers------");
        System.out.println("Odd Numbers: "+oddNumList);
        System.out.println("Even Numbers: "+evenNumList);
        System.out.println("Prime NUmbers: "+primeNumList);

    }

    public static void main(String[] args) {
        List<Integer> numList=Stream.iterate(1, num-> num + 1)
                .limit(50).collect(Collectors.toList());

        Consumer<List<Integer>> result=NumConsumer::numFilter;
        result.accept(numList);
    }
}
