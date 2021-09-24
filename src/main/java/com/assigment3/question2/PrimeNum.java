package com.assigment3.question2;

import java.util.function.Supplier;
import java.util.stream.IntStream;

public class PrimeNum {

    public static boolean isPrime(int input){
        return input > 1 && IntStream.rangeClosed(2, input/ 2).noneMatch(i -> input% i == 0);
    }

    public static void main(String[] args) {
        Supplier<Integer> primeNumber=()->(int)(Math.random()*(91)+10);
        int num=0;

        while(!isPrime(num)){
                num=primeNumber.get();
            }
        System.out.println("The Random Prime Number is: "+num);
        }
}
