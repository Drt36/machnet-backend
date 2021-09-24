package com.assigment3.question5;

import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Sort {
    public static void main(String[] args) {
        List<Integer> numList= new Random().ints(100, 1,1000).boxed().collect(Collectors.toList());
        List<Integer> sortedList=numList.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());

        System.out.println("---------Numbers Before Sorting--------");
        System.out.println(numList);
        System.out.println("---------Numbers After Sorting--------");
        System.out.println(sortedList);
    }
}
