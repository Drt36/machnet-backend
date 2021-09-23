package com.question2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Student {
    private String name;
    private int semester;
    private String gender;
    private int age;

    public Student(String name, int semester, String gender, int age) {
        this.name = name;
        this.semester = semester;
        this.gender = gender;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public static void main(String[] args) {
        int size = 5;
        Student studentArray[] = new Student[size];
        studentArray[0] = new Student("Dharma Raj", 3, "Male", 20);
        studentArray[1] = new Student("John Doe", 3, "Male", 25);
        studentArray[2] = new Student("jasmine", 3, "Female", 20);
        studentArray[3] = new Student("Usha", 5, "Female", 22);
        studentArray[4] = new Student("shyam", 6, "Male", 30);

        List<Student> list = Arrays.asList(studentArray);

        List<String> studentNameList=list.stream()
                .map(student -> student.getName())
                .collect(Collectors.toList());

        studentNameList.forEach(System.out::println);
    }
}
