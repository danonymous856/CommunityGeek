package com.Recursion;

import java.util.Arrays;
import java.util.Scanner;

public class RecursiveBubbleSort {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int[] arr=new int[9];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Please enter the the element of "+ i +"th index : ");
            arr[i]=in.nextInt();
        }
//        int[] arr={2,1,5,4,6,3,7,8,9};
        System.out.println("Unsorted array : "+Arrays.toString(arr));
        bubble(arr,0, arr.length-1);
        System.out.println("Sorted : "+Arrays.toString(arr));
    }
    static void bubble(int[] arr,int s,int e){
        if (e==0){
            return;
        } // base condition

        if (s<e){
            if (arr[s]>arr[s+1]){
                //swap
                int temp=arr[s];
                 arr[s]=arr[s+1];
                 arr[s+1]=temp;
            }
            bubble(arr, s+1, e);
        }
        else {
            bubble(arr, s, e-1);
        }

    }
}
