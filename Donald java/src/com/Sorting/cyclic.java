package com.Sorting;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

import static com.Sorting.BubbleSort.swap;

public class cyclic {
    public static void main(String[] args) {
        System.out.println("\t_____________________CYCLIC SORT______________________\t");
        Scanner in = new Scanner(System.in);
        int[] arr=new int[7];

        for (int index = 0; index < arr.length; index++) {
            arr[index]=in.nextInt();
        }

        System.out.println(Arrays.toString(arr));

        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }

    static int bubble(int[] arr) {
        boolean sorted;
        for (int i = 0; i < arr.length; i++) {
           sorted=false;
            for (int j = 1; j < arr.length-i; j++) {
                if (arr[j]<arr[j-1]){
                     swapped(arr,j);
                     sorted=true;
                }
            }
            if (sorted==true);
            break;
        }
        return -1;
    }

    private static int swapped(int[] arr, int j) {
        int temp=arr[j];
        arr[j]=arr[j-1];
        arr[j-1]=temp;
        return -1;
    }

}
