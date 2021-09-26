package com.Leetcode;

import java.util.Arrays;
import java.util.Scanner;

public class MIssingNumber {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int[] arr=new int[4];

        for (int i = 0; i < arr.length; i++) {
            arr[i]=input.nextInt();
        }
        System.out.print("initial array:"+Arrays.toString(arr)+"\n");

        System.out.print("Ans:"+missingNumber(arr));
    }

    public static int missingNumber(int[] arr) {
            int i = 0;
            while (i < arr.length) {
                int correct = arr[i];
                if (arr[i] < arr.length && arr[i] != arr[correct]) {
                    swap(arr, i , correct);
                } else {
                    i++;
                }
            }

            // search for first missing number
            for (int index = 0; index < arr.length; index++) {
                if (arr[index] != index) {
                    return index;
                }
            }

            // case 2
            return arr.length;
        }

        static void swap(int[] arr, int first, int second) {
            int temp = arr[first];
            arr[first] = arr[second];
            arr[second] = temp;
        }


    /*---------------------------------kunal's code----------------------------------*/

   /* static class MissingNumber {

        public static void main(String[] args) {
            int[] arr = {4, 0, 2, 1};
            System.out.println(missingNumber(arr));
        }

        public static int missingNumber(int[] arr) {
            int i = 0;
            while (i < arr.length) {
                int correct = arr[i];
                if (arr[i] < arr.length && arr[i] != arr[correct]) {
                    swap(arr, i , correct);
                } else {
                    i++;
                }
            }

            // search for first missing number
            for (int index = 0; index < arr.length; index++) {
                if (arr[index] != index) {
                    return index;
                }
            }

            // case 2
            return arr.length;
        }

        static void swap(int[] arr, int first, int second) {
            int temp = arr[first];
            arr[first] = arr[second];
            arr[second] = temp;
        }
    }*/
}
