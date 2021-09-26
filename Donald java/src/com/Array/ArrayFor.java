package com.Array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayFor {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);

        int[] arr=new int[8];

        for (int i = 1; i < arr.length; i++) {
            arr[i]=in.nextInt();
        }

        System.out.println(Arrays.toString(arr));

//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i]+ " ");
//        }

    }
}
