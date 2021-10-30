/*
package com.Leetcode;

import java.util.ArrayList;
import java.util.List;

public class MixOfArray {
    public static void main(String[] args) {


    }

    public int[] twoSum(int[] numbers, int target) {

        int start=0;
        int end= numbers.length-1;

        if (start>end) {
            int[] ret={-1,-1};
            return ret;
        }

        while (start<=end){
            int mid=start+(end-start)/2;

            if (target==numbers[mid]){
                System.out.println(mid);;
            }
            else if (target<numbers[mid]){
                end=mid-1;
            }
            else {
                start=mid+1;
            }
            if (numbers[]) {
            }

        }

        return numbers;
    }

}
*/
