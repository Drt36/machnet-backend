package com.assigment3.question1;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.IntPredicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class NumConsumer {

    public static boolean isPrime(int input){
        return input > 1 && IntStream.rangeClosed(2, input/ 2).noneMatch(i -> input% i == 0);
    }

    public static void main(String[] args) {
        List<Integer> numList= IntStream.rangeClosed(1, 50).boxed().collect(Collectors.toList());

        IntPredicate isOdd = input-> input % 2 != 0;
        IntPredicate isEven = input-> input % 2 ==0;

        Consumer<List<Integer>> oddNumList=list->list.stream().filter(num->isOdd.test(num)).forEach(num->System.out.print(num+" "));
        Consumer<List<Integer>> evenNumList=list->list.stream().filter(num->isEven.test(num)).forEach(num->System.out.print(num+" "));
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
