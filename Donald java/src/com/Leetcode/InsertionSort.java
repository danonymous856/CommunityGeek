package com.Leetcode;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr={1,4,2,3,5,8,6,7,9};

        System.out.println(sort(arr));
//        sort(arr);
    }

    private static int[] sort(int[] arr) {

//        for (int i = 0; i < arr.length; i++) {
        
            int i = 0;
            int k=arr[i];
            int j=i-1;
             while (j>=0 && arr[j]>k){
                 arr[j+1]=arr[j];
                 j-=1;
                 arr[j+1]=k;
             }
//        }
        return arr;
//        System.out.println(arr);

    }

}
