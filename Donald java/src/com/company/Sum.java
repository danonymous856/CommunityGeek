package com.company;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the two numbers: ");
        float num1= input.nextFloat();
        float num2= input.nextFloat();

        float Sum=num1+num2;

        System.out.println("Sum = " + Sum);
    }
}
