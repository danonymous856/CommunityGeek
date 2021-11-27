package com.Anita;

import java.util.ArrayList;
import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int num= input.nextInt();
        System.out.println(rev(num));
    }

    private static int rev(int num) {
        int rem=num/10; //this will give me back the remaining of the number like 521/10=52
        int last=num%10; //this will give me back the remaining of the number like 521%10=1

        if (num==0){
            return num;
        }
        return (int) (last * Math.pow(10, digit(num) - 1) + rev(rem)) ;
    }
    static int digit(int n){
        if (n/10==0){
            return 1;
        }
        return 1+digit(n/10);
    }
}
