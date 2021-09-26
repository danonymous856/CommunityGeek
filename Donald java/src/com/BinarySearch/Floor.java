package com.BinarySearch;

import java.util.Arrays;
import java.util.Scanner;

public class Floor {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("Enter the elements:\n");
        int[] list=new int[7];

        for (int index = 0; index < list.length; index++) {
            list[index]=input.nextInt();
        }
        System.out.println(Arrays.toString(list));

        System.out.println("Enter the target value:\n");
        int target=input.nextInt();

        int ans=BiSearch(list,target);
        System.out.println(ans);

    }
    static int BiSearch(int[] list, int target) {
        int start = 0;
        int end = list.length - 1;

        while (start <= end) {
            int mid_element = start + (end - start) / 2; //coz integer has a limited amt of value to be assigned

            if (target < list[mid_element]) {
                end = mid_element - 1;
            } else if (target > list[mid_element]) {
                start = mid_element + 1;
            } else {
                return mid_element;
            }
        }
        return end;
    }
}
