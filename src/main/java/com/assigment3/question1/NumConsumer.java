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

    public static void main(String[] args) {
        List<Integer> numList=Stream.iterate(1, num-> num + 1)
                .limit(50).collect(Collectors.toList());

        Consumer<List<Integer>> oddNumList=list->list.stream().filter(num->isOdd(num)).forEach(num->System.out.print(num+" "));
        Consumer<List<Integer>> evenNumList=list->list.stream().filter(num->isEven(num)).forEach(num->System.out.print(num+" "));
        Consumer<List<Integer>> primeNumList=list->list.stream().filter(num->isPrime(num)).forEach(num->System.out.print(num+" "));

        System.out.println("------Odd Numbers-----");
        oddNumList.accept(numList);
        System.out.println();
        System.out.println("------Even Numbers-----");
        evenNumList.accept(numList);
        System.out.println();
        System.out.println("------Prime Numbers-----");
        primeNumList.accept(numList);
    }
}
