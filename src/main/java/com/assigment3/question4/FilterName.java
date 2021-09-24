package com.assigment3.question4;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FilterName {
    public static void main(String[] args) {
        String[] nameArray={"Abi","abin","abinash","Aasha","Ambika","Dharma","Usha","kiran"};

        Predicate<String> filteredName=predicate-> predicate.toLowerCase().startsWith("a") && predicate.length()<=5;

        List<String> filteredNAmeList= Arrays.stream(nameArray).filter(name->filteredName.test(name)).collect(Collectors.toList());

        System.out.println("------Names starts with “a” or “A” and contains length no more than 5-------");
        System.out.println(filteredNAmeList);
    }
}
