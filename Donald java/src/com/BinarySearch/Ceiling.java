package com.BinarySearch;

import java.util.Arrays;
import java.util.Scanner;

public class Ceiling {
    public static void main(String[] args) {
        System.out.println("please entr the value of the array:\n");
        Scanner in=new Scanner(System.in);
        int[] arr=new int[7];
        for (int index = 0; index < arr.length; index++) {
            arr[index]=in.nextInt();
        }
        System.out.println(Arrays.toString(arr));

        System.out.println("Enter the target:\n");
        int tar=in.nextInt();

        int ans=ceiling(arr,tar);
        System.out.println(ans);

    }
    static int ceiling(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid_element = start + (end - start) / 2; //coz integer has a limited amt of value to be assigned

            if (target < arr[mid_element]) {
                end = mid_element - 1;
            } else if (target > arr[mid_element]) {
                start = mid_element + 1;
            } else {
                return mid_element;
            }
        }
        return start;
    }
}
