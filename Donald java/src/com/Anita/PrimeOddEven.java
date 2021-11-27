package com.Anita;

import java.util.Scanner;

public class PrimeOddEven {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        System.out.println("prime:"+prime(n)+"\n"+"odd:"+Odd(n)+"\n"+"Even:"+Even(n));
    }
    private static boolean Odd(int n) {
        if (n%2==0){
            return false;
        }
        return true;
    }

    private static boolean Even(int n) {
        if ((n % 2 != 0)){
            return false;
        }
        return true;
    }

    private static boolean prime(int n) {
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
