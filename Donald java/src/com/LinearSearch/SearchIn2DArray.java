package com.LinearSearch;

import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] arr={
                {23,4,4},
                {45,6565,5544},
                {546,5,7,5},
                {4,5,5,8,7}
        };

        int target =546;
        int[] ans=search(arr,target);
        System.out.println(Arrays.toString(ans));
    }

    private static int[] search(int[][] arr, int target) {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == target){
                    return new int[]{row,col};
                }

            }
        }
        return new int[]{-1,-1};
    }
}
