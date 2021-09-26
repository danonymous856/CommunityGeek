package com.company;

import javax.swing.*;
import java.util.Scanner;

public class Fibonnaci {
    public static void main(String[] args) {
        System.out.println("Please enter the n^th value to get that Fibonacci number" +":");
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int previous=0;
        int initial=1;

        int count=2;

        while (count<=n){
            int temperory = initial;
            initial=initial+previous;
            previous=temperory;
            count++;
        }
        System.out.println(initial);
    }
}
