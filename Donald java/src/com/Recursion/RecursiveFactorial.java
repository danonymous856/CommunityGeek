package com.Recursion;

import java.util.Scanner;

public class RecursiveFactorial {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        int n=input.nextInt();
//        fact(n);
        System.out.println("Printin the factorial of the number: "+ fact(n));
//        System.out.println(fact(n));
    }

    private static int fact(int n) {
        if (n==1){
            return n;
        }
        return n*fact(n-1);
    }
}
