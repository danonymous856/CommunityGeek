package com.Recursion;

import java.util.Scanner;

public class RecursiveFibonnnaci {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n= in.nextInt();
        for (int i = 0; i < n ; i++) {
            System.out.println(Fibo(i));
        }
    }

    private static int Fibo(int n) {
        if (n<2){
            return n;
        }
        int g= Fibo(n-1) + Fibo(n - 2);
        return g;
    }




}
