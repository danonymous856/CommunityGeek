package com.Donald;

import java.util.Scanner;

import static java.lang.Math.max;
import static java.lang.Math.pow;

public class Armstrong {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);

        int n= in.nextInt();
        System.out.println(Arms(n));
    }

     static boolean Arms(int n) {
        int original=n;
        int sum=0;


         for (int i = 0; i < 1000; i++) {
             int  x=n%10;
             n=n/10;
             sum=sum+x*x*x;
             System.out.println(sum);
         }

       while (n>0){
           int  x=n%10;
           n=n/10;
           sum=sum+x*x*x;
       }
       if (sum==original){
           return true;
       }
       return false;
    }


}
