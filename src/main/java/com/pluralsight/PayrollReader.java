package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class PayrollReader {
    public static void main(String[] args) {
        try {
            //getting use input
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter employee name (First Last): ");
            String empName = scanner.nextLine();

            //reading file
            FileReader fileReader = new FileReader("src/main/resources/employees.csv");
            BufferedReader buffreader = new BufferedReader(fileReader);

            String line;

            while ((line = buffreader.readLine()) != null) {
                System.out.println(line);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();

                }
            }

            buffreader.close();
        } catch(IOException e) {
            e.printStackTrace();
        }// close curly for initial try
    }
    }









