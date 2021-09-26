package com.company;

import java.util.Scanner;

public class Swift {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);

        String fruit=in.next();

        switch (fruit) {
            case "mango" -> System.out.println("king of fruits.");
            case "apple" -> System.out.println("red sweet fruit.");
            case "pineaple" -> System.out.println("apple with pines.");
            case "chiku" -> System.out.println("sweet brown fruit.");
            default -> System.out.println("enter a valid fruit name.");
        }

    }
}
