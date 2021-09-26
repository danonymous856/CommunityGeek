package com.Leetcode;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        System.out.println("Enter the number:");
        Scanner input =new Scanner(System.in);
       int n=input.nextInt();
       int ans=fact(n);
        System.out.println(ans);
    }

    private static int fact(int n) {
        if (n == 1) {
            return 1;
        }
        return n * fact(n - 1);

    }

}
