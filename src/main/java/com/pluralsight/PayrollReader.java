package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileReader;

public class PayrollReader {
    public static void main(String[] args) {

        //Reading the file
        FileReader fileReader = new FileReader("src/main/resources/employees.csv");
        BufferedReader buffreader = new BufferedReader(fileReader);

        String line;

        while ((line = buffreader.readLine()) != null) {

        }











    }
}
