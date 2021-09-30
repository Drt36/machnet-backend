package com.springtask2.question2;

import org.springframework.stereotype.Component;
import org.springframework.context.annotation.Scope;

@Component
@Scope(value = "prototype")
public class Student {
    private int studentId;
    private String studentName;
}
