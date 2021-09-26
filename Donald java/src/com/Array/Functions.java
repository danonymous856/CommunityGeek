package com.Array;

import java.util.Scanner;

public class Functions {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int[] arr=new int[10];

        System.out.print("Please enter the elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=in.nextInt();
        }

        change(arr);
        System.out.println(arr);
    }

    private static void change(int[] don) {
        int fun=don[5]-don[2];
        System.out.println(fun);
    }
}
