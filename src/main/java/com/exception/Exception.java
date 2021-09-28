package com.exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exception extends Throwable {
    public static void main(String[] args) {
        try {
            File file= new File("poms.xml");
            Scanner reader= new Scanner(file);

            while (reader.hasNextLine()) {
                String data=reader.nextLine();
                System.out.println(data);
            }

            reader.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException("File Not Exist.");
        }
    }
}
