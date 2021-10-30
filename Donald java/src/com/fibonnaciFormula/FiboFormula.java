package com.fibonnaciFormula;

import java.util.Scanner;

public class FiboFormula {
    public static void main(String[] args) {
        for (int i = 0; i < 13; i++) {
            System.out.println(UniFibo(i));
        }

        System.out.println("Enter the N^th value to get that fibonnaci number:");
        Scanner input=new Scanner(System.in);
        long ans=IndexFibo(input.nextInt());
        System.out.println(ans);
    }

    private static long UniFibo(int n) {
        return (long) (Math.pow((1+Math.sqrt(5))/2,n)/Math.sqrt(5));
    }
    static long IndexFibo(int n){
        return UniFibo(n);
    }
}
