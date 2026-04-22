package com.pluralsight;

import java.io.*;
import java.util.Scanner;
import java.util.regex.Pattern;

public class PayrollReader {
    public static void main(String[] args) {
        //Asking for user input
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter name of the employee file to process: ");
        String fileInput = scanner.nextLine();

        System.out.print("Enter name of payroll file to create: ");
        String fileOutput = scanner.nextLine();


        try {

            //reading file
            FileReader fileReader = new FileReader("src/main/resources/employees.csv");
            BufferedReader buffreader = new BufferedReader(fileReader);

            //This creates the file writer
            FileWriter fileWriter = new FileWriter("src/main/resources" + "/" + fileOutput + ".csv" );
            //This creates the buffered writer
            BufferedWriter buffwriter = new BufferedWriter(fileWriter);

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

                //Write file output
                buffwriter.write(employee.getEmployeeID() + "|" + employee.getName() + "|" + employee.getGrossPay());
                buffwriter.newLine();

            }

            buffreader.close();
            buffwriter.close();

        } catch(IOException e) {
            e.printStackTrace();
            System.out.println("Problem with IO");

        }// close curly for initial try


    }
    }









