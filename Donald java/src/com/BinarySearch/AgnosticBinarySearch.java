package com.BinarySearch;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class AgnosticBinarySearch {
    public static void main(String[] args) {
        System.out.println("Please enter the elements of the array:");

        Scanner input =new Scanner(System.in);
        int[] arr=new int[10];
        for (int index = 0; index < arr.length; index++) {
            arr[index]=input.nextInt();
        }
        System.out.println(Arrays.toString(arr));

        System.out.println("Please enter the target element:");
        int target=input.nextInt();

        int ans=BinSearch(arr,target);
        System.out.println(ans);
    }

    static int BinSearch(int[] arr, int target) {
        int start=0;
        int end= arr.length-1;

        boolean truth=arr[start]<arr[end];


        while (start<=end){
            int mid=start+(end - start)/2;

            if (arr[mid]==target) {
                return mid;
            }
            if (truth){
                if (target<arr[mid]){
                    end=mid-1;
                }
                else {
                    start=mid+1;
                }
            }
            else {
                if (target>arr[mid]){
                    end=mid-1;
                }
                else {
                    start=mid+1;
                }
            }
        }
        return -1;
    }


}

