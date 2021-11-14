package com.General;

import java.util.Scanner;

public class Testing {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("enter the numb:\n");
        int n= in.nextInt();
        for (int i = 1; i < n; i++) {
            System.out.println("for "+ i +" it is "+truth(i));
        }

    }

    private static boolean truth(int n) {
        int count = 1;

        while (count<n){
            if (n%2==0 || n%3==0){
                return true;
            }

            count++;
        }

        return false;

    }

}
