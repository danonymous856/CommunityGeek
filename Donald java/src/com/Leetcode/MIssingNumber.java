package com.Leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MIssingNumber {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int[] arr=new int[8];

        for (int i = 0; i < arr.length; i++) {
            arr[i]=input.nextInt();
        }
        System.out.print("initial array:"+Arrays.toString(arr)+"\n");

        System.out.print("Ans:"+missingNumber(arr));

                //here is just for reminding the previous JAVA Algos
        /*int target=intput.nextInt();
        System.out.print("Binary search Ans:"+binarysearch(arr,target))*/
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
/*
static void binarysearch(int[] arr,int target){
    int start=0;
    int end=arr.length-1;
    while (start<end){
        int mid=end+(start+end)/2;

        if (target<arr[mid]){
            end=mid-1;
        }
        else if (target>arr[mid]){
            start=end+1;
        }
        else{
            return arr.length;
        }
    }

}
*/
