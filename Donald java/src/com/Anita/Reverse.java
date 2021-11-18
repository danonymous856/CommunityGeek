package com.Anita;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int[] arr=new int[7];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=input.nextInt();
        }
        int n=input.nextInt();
        System.out.println(arr);
        rev(arr, n);
        System.out.println(arr);
    }

    private static void rev(int[] arr, int n) {
        if (n==0){
            return;
        }

    }

}
