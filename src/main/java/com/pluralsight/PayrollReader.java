package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Pattern;

public class PayrollReader {
    public static void main(String[] args) {
        try {


            //reading file
            FileReader fileReader = new FileReader("src/main/resources/employees.csv");
            BufferedReader buffreader = new BufferedReader(fileReader);

            String line;
            buffreader.readLine();

            while ((line = buffreader.readLine()) != null) {
                // Split the lines here using |
                String[] tokens = line.split(Pattern.quote("|"));

                //Change tokens into variables & use to make new employee object
                int id = Integer.parseInt(tokens[0]);
                String name = tokens[1];
                double hoursWorked = Double.parseDouble(tokens[2]);
                double payRate = Double.parseDouble(tokens[3]);

                Employee employee = new Employee(id, name, hoursWorked , payRate);

                //printing employee
                System.out.printf("Id: %d | Name: %s | Gross Pay: $%.2f%n", employee.getEmployeeID() , employee.getName() , employee.getGrossPay());
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                    System.out.println("Problem with IO");

                }
            }

            buffreader.close();
        } catch(IOException e) {
            e.printStackTrace();
            System.out.println("Problem with IO");

        }// close curly for initial try
    }
    }









