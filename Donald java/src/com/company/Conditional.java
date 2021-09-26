package com.company;

import java.util.Scanner;

public class Conditional {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.printf("Please enter the three numbers: ");
//        float a= in.nextFloat();
//        float b= in.nextFloat();
//
//        if ((a+b)%2==0){
//            System.out.println("The number is " + (a+b)) ;
//        }
//        else {
//            System.out.println("it is not divisible by 2.");
//        }

        /* to find the greatest of three numbers */

        int number1= in.nextInt();
        int number2= in.nextInt();
        int number3= in.nextInt();

        int max=Math.max(number3,Math.max(number1,number2));

        System.out.println(max);
    }
}
