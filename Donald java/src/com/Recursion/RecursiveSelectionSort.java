package com.Recursion;

import java.util.Arrays;

public class RecursiveSelectionSort {
    public static void main(String[] args) {
        int[] arr={4,3,5,6,1,2};
        selection(arr, arr.length, 0,0);
        System.out.println(Arrays.toString(arr));
    }
    static void selection(int[] arr, int e,int s,int max){
        if (e==0){
            return;
        }
        if (s<e){
            if (arr[s] > arr[max]){
                selection(arr, e, s+1, s);
            }
            else {
                selection(arr, e, s+1, max);
            }
        }
        else {
            int temp = arr[max];
            arr[max]=arr[e-1];
            arr[e-1]=temp;
            selection(arr, e-1, 0, 0);
        }
    }


}

