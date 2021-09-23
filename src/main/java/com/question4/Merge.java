package com.question4;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Merge {
    public static boolean isPrime(int input){
        int flag = 0;
        for (int i = 1; i <=(input/2); i++) {
            if ((input % i) == 0) {
                flag += 1;
            }
        }
        return flag==1;
    }

    public static void main(String[] args) {
        Integer [][] intArray= {{1,3,5,7,9,11,13,15},{2,4,6,8}};

        List<Integer> combinedList = Arrays.stream(intArray)
                .flatMap(Stream::of)
                .collect(Collectors.toList());

        System.out.println("------Combined List--------");
        System.out.println(combinedList);

        List<Integer> primeNumberList= combinedList.stream()
                .filter(element-> isPrime(element)==true)
                .collect(Collectors.toList());

        System.out.println("------Prime Number List--------");
        System.out.println(primeNumberList);
    }
}
