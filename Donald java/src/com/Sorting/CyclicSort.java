package com.Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class CyclicSort {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[8];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }

        cylic(arr);
        System.out.println(Arrays.toString(arr));



    }

    private static void swap(int[] arr, int initial,int pre) {
        int temp=arr[initial];
        arr[initial]=arr[pre];
        arr[pre]=temp;
    }

    /*------------------------------Kunal's algo-------------------------------*/

    private static void cylic(int[] arr) {
        int i=0;
        while (i< arr.length){
            int correct=arr[i]-1;

            if (arr[i]!=arr[correct]){
                swap(arr,i,correct);
            }
            else {
                i++;
            }
        }
    }

    /*------------------------------------------------------------------------*/

}
