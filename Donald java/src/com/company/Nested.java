package com.company;

import java.util.Scanner;

public class Nested {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);

        int ID=input.nextInt();
        String department=input.next();

//        System.out.println("Please enter the department:");
        switch (ID) {
            case 1 -> System.out.println("Department of info Tech.");
            case 2 -> System.out.println("This is the department of Home Science.");
            case 3 -> {
                System.out.println(" ID: 3");
                switch (department) {
                    case "IT" -> System.out.println("Donald Laishram");
                    case "CSI" -> System.out.println("Rohit jha.");
                    case "Home Science" -> System.out.println("NIti mohan.");
                    default -> System.out.println("Sorry invalid ID.");
                }
            }
            default -> System.out.println("Sorry invalid department.");
        }
    }
}
