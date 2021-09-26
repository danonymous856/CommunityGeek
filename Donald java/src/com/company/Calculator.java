package com.company;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        long ans=0;

        while (true){
            System.out.println("Enter the operator:");
            char op=input.next().trim().charAt(0);
            if (op=='+' || op=='-' || op=='*' || op =='/') {

                System.out.println("Enter the two numbers:");
                long num1 = input.nextLong();
                long num2 = input.nextLong();

                if (op == '+') {
                    ans = num1 + num2;
                }
                if (op == '-') {
                    ans = num1 - num2;
                }
                if (op == '*') {
                    ans = num1 * num2;
                }
                if (op == '/') {
                    ans = num1 / num2;
                }
                if (op == '%') {
                    ans = num1 % num2;
                }
            }
            else if (op == 'x' || op=='X'){
                 break;
            }
            else{
                System.out.println("operation invalid");
            }
            System.out.println(ans);
        }

    }
}






