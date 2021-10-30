package com.Recursion;

import javax.swing.*;

public class RecursiveRotatedBinarySearch {
    public static void main(String[] args) {
        int[] arr={5,6,7,8,9,1,2,3};
        int ans=RotatedBiSearch(arr,8,0, arr.length-1);
        System.out.println(ans);
    }

    private static int RotatedBiSearch(int[] arr, int target,int start,int end) {
        int mid=start+(end-start)/2;

        if (start>end){
            return -1;
        }

        if (arr[start]<=arr[mid]){
            if (target<=arr[mid] && target>=arr[start]){
                return RotatedBiSearch(arr, target, start, mid-1);
            }
            else {
                return RotatedBiSearch(arr, target, mid+1, end);
            }
        }
        if (target>=arr[mid] && target<=arr[end]){
            return RotatedBiSearch(arr, target, mid+1, end);
        }

        return RotatedBiSearch(arr, target, start, mid-1);

    }


}
