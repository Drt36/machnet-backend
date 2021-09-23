package com.question2and3;

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

    public int getSemester() {
        return semester;
    }

    public String getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public static void main(String[] args) {
        int size = 5;
        Student studentArray[] = new Student[size];
        studentArray[0] = new Student("Dharma Raj", 3, "Male", 20);
        studentArray[1] = new Student("John Doe", 3, "Male", 25);
        studentArray[2] = new Student("jasmine", 3, "Female", 20);
        studentArray[3] = new Student("Usha", 5, "Female", 22);
        studentArray[4] = new Student("jony", 6, "Male", 30);

        List<Student> list = Arrays.asList(studentArray);

        //answer of question no.2
        List<String> studentNameList=list.stream()
                .map(student -> student.getName())
                .collect(Collectors.toList());

        System.out.println("----------Students Name List----------");
        studentNameList.forEach(System.out::println);

        //answer of question no.3
        List<Student> filteredStudentList=list.stream()
                .filter(student ->student.getName().toLowerCase().startsWith("j"))
                .filter(student -> student.getSemester()==3)
                .collect(Collectors.toList());

        System.out.println("----------Filtered Students List----------");
        for(Student student:filteredStudentList){
            System.out.println(student.getName()+","+student.getSemester()+","+student.getAge()+","+student.getGender());
        }

    }
}
