package com.Recursion;

import java.util.Arrays;

public class MergeSortInPlace {
    public static void main(String[] args) {
        int[] arr={2,1,5,4,6,3,7,8,9};
        mergeSortInPlace(arr,0, arr.length);
        System.out.println(Arrays.toString(arr));
    }

    private static void mergeSortInPlace(int[] arr,int s,int e) {
        if (e-s == 1){
            return;
        }

        int mid =(e+s)/2;

        mergeSortInPlace(arr, s, mid);
        mergeSortInPlace(arr,mid,e);

        mergeInPlace(arr,s, e, mid);
    }

    private static void mergeInPlace(int[] arr,int s,int e,int mid) {
        int[] mix = new int[e-s];

        int i=s;
        int j=mid;
        int k=0;

        while (i < mid && j < e){
            if (arr[i]<arr[j]){
                mix[k]=arr[i];
                i++;
            }
            else{
                mix[k]=arr[j];
                j++;
            }
            k++;
        }

        while (i < mid){
            mix[k]=arr[i];
            i++;
            k++;
        }

        while (j < e){
            mix[k]=arr[j];
            j++;
            k++;
        }

        for (int l = 0; l < mix.length ; l++) {
            arr[s+l]  = mix[l];
        }

    }
}
