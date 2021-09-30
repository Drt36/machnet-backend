package com.springtask2.question_3_4_5;

import org.springframework.stereotype.Component;

@Component
public class JavaScriptProgramming implements Programming {
    @Override
    public void programming() {
        System.out.println("Interested in JavaScriptProgramming!");
    }
}
