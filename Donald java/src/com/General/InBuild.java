package com.General;

import java.util.Arrays;
import java.util.Scanner;

public class InBuild {
    public static void main(String[] args) {
        int[] arr=new int[7];
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i]=in.nextInt();
        }
        System.out.println(Arrays.toString(arr));

        //sorted built-in algorithm
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

    }
}
