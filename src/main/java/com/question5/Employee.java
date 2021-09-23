package com.question5;

import javax.swing.event.ListDataEvent;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Employee {
    private String name;
    private int age;
    private String gender;
    private String department;
    private double salary;

    public Employee(String name, int age, String gender, String department, double salary) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.department = department;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    public static void main(String[] args) {
        int size = 5;
        Employee empArray[] = new Employee[size];
        empArray[0] = new Employee("Dharma Raj", 3, "Male", "IT",30000d);
        empArray[1] = new Employee("John Doe", 3, "Male", "IT",45000d);
        empArray[2] = new Employee("jasmine", 3, "Female", "HR",50000d);
        empArray[3] = new Employee("Usha", 5, "Female", "Management",100000d);
        empArray[4] = new Employee("jony", 6, "Male", "Sales",40000d);

        List<Employee> empList= Arrays.asList(empArray);

        //average salary of employees
        List<Double> empSalaryList=empList.stream().map(employee -> employee.getSalary()).collect(Collectors.toList());
        Double sumSalary=empSalaryList.stream().reduce(0d,(acc,salary)->acc+salary);
        Double averageSalary=sumSalary/size;

        System.out.println("Average Salary of Employees: Rs."+averageSalary);

        //print unique department
        List<String> empDepartmentList=empList.stream().map(employee -> employee.getDepartment()).collect(Collectors.toList());

        List<String> uniqueDepartmentList=empDepartmentList.stream().distinct().collect(Collectors.toList());

        System.out.println("-----------Unique Departments-----------");
        for(String department:uniqueDepartmentList){
            System.out.println(department);
        }

        //average salary of department
        Map<String,Double> empByDepartment=empList.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment,Collectors.averagingDouble(Employee::getSalary)));

        System.out.println("---------Average salary By Department--------");
        System.out.println(empByDepartment);


    }
}
