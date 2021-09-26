package com.Array;

import java.util.Arrays;
import java.util.Scanner;

public class MAtrix {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        int[][] arr=new int[3][3];

        System.out.println("Please enter the rows and columns: ");
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] =in.nextInt();
            }
        }


        for (int i = 0; i < arr.length; i++) {
            int[] ints = arr[i];
            for (int col = 0; col < ints.length; col++) {
                System.out.print(ints[col] + " ");
            }
            System.out.println();
        }

       /* for (int row = 0; row < arr.length; row++) {
            System.out.println(Arrays.toString(arr[row]));

        }*/

    }
}
