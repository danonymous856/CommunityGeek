package com.Donald;

import java.util.Scanner;

public class PrimeCheck {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int n= in.nextInt();
        System.out.println(Prime(n));
    }

    static boolean Prime(int n){
        if ((n*1==n)&&((n%2!=0)&&(n%3!=0)&&(n%5!=0)&&(n%7!=0))){
            return true;
        }
        else
            return false;
    }
}
