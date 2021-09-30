package com.springtask2.question_3_4_5;

import org.springframework.stereotype.Component;
import org.springframework.context.annotation.Primary;

@Component
@Primary
public class JavaProgramming implements Programming {
    @Override
    public void programming() {
        System.out.println("Interested in Java Programming");
    }
}
