package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class PayrollReader {
    public static void main(String[] args) {

        //Getting user input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter employee name (First Last): ");
        String empName = scanner.nextLine();


        //Reading the file
        FileReader fileReader = new FileReader("src/main/resources/employees.csv");
        BufferedReader buffreader = new BufferedReader(fileReader);

        String line;

        while ((line = buffreader.readLine()) != null) {

        }











    }
}
