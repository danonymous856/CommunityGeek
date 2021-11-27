package com.Anita;

import java.util.Scanner;

public class AddOf10 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n= in.nextInt();
        for (int i = 1; i < n+1 ; i++) {
            System.out.println(sum(i));
        }
        System.out.println("\n");
        formula(n);
    }
    private static int sum(int n) {
        if (n == 0){
            return 0;
        }
        return n + sum(n - 1);
    }
    static void formula(int n) {
        n=n*(n+1)/2;
        System.out.println(n);
    }
}
