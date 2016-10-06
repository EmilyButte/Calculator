package CalculatorProject;

import java.util.Scanner;

public class User {

    public String getCommand() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a command ");
        return input.next();
    }

    public double inputFromUser() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number ");
        return input.nextDouble();
    }
}


