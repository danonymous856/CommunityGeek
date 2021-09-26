package com.Sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr={2,1,5,4,6,3,7,8,9};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }

     static void bubble(int[] arr) {
        boolean swapped ;

        for (int i = 0; i < arr.length; i++) {
            swapped=false;    //false=the two numbers assigned at the moment by I and J are not sorted.
            for (int j = 1; j < arr.length-i; j++) {
                if (arr[j]<arr[j-1]){
                    swap(arr,j);
                    swapped=true;
                }
            }
            if (swapped==true){
                break;
            }
        }
    }

     static void swap(int[] arr,int j) {
        int temp=arr[j];
        arr[j]=arr[j-1];
        arr[j-1]=temp;
    }

//    ctrl +c && ctrl+v

   /* static void bubble(int[] arr) {
        boolean swapped;
        // run the steps n-1 times
        for (int i = 0; i < arr.length; i++) {
            swapped = false;
            // for each step, max item will come at the last respective index
            for (int j = 1; j < arr.length - i; j++) {
                // swap if the item is smaller than the previous item
                if (arr[j] < arr[j-1]) {
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }
            }
            // if you did not swap for a particular value of i, it means the array is sorted hence stop the program
            if (!swapped) { // !false = true
                break;
            }
        }
    }*/


}
