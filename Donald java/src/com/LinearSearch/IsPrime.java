package com.LinearSearch;

import java.util.Scanner;

public class IsPrime {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n= in.nextInt();

        for (int i = 0; i < n; i++) {
            if (isPrime(i)){
                System.out.println(i);
            }
        }
    }

    private static boolean isPrime(int n) {
        if (n<=1){
            return false;
        }

        int c=2;
        while (c<=Math.sqrt(n)){
            if (n%c==0){
                return false;
            }
            c++;
        }
        return true;
    }
}
