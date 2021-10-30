package com.Sorting;

import java.util.ArrayList;
import java.util.List;

public class ArrayOfDuplicates {

    // leetcode starts here !!!
    public List<Integer> findDuplicates(int[] arr) {
//        Form here the Cyclic sorting starts !!!!!!!!
        int i=0;
        while (i< arr.length){
            int correctIndex=arr[i]-1;
            if (arr[i]!=arr[correctIndex]){
                swappp(arr,i,correctIndex);
            }
            else {
                i++;
            }
        }
//        Here the Cyclic sorting ends !!!!!!!!

//        As we need an array of duplicate values !!!!!!!!!!
        List<Integer> nums= new ArrayList<>();
        for (int index = 0; index < arr.length; index++) {
            if (arr[index]!=index+1){
                nums.add(arr[index]);
            }
        }
        return nums;
    }

    private void swappp(int[] nums, int i, int correctIndex) {
        int t=nums[i];
        nums[i]=nums[correctIndex];
        nums[correctIndex]=t;
    }


}
