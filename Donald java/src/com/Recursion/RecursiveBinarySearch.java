package com.Recursion;

import java.util.Scanner;

public class RecursiveBinarySearch {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        System.out.println("Enter the value of the size of the arr:");
        int[] arr=new int[in.nextInt()];

        System.out.println("Enter the elements:");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=in.nextInt();
        }

        System.out.println("Enter the Target value :");
        int target= in.nextInt();

        System.out.println(Search(arr,target,0,arr.length-1));
    }

    private static int Search(int[] arr, int target, int start, int end) {
        if (start>end){
            return -1;
        }

        int mid=start+(end-start)/2; // initializing the middle element

        if (target==arr[mid]){
            return mid;
        }
        if (target<arr[mid]){
            return Search(arr,target,start,mid-1);  //here the new end is mid negative one as was in the binary search
        }
        return Search(arr, target, mid+1, end); //here the new start is mid positive one as was in the binary search
    }
}
