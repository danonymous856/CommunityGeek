package com.Sorting;

class Solution {
    public int missingNumber(int[] nums) {
        int i=0;
        while (i<nums.length){
            int correctIndex=nums[i];
            if (nums[i]<nums.length && nums[i]!=nums[correctIndex]){
                swap(nums,i,correctIndex);
            }
            else {
                i++;
            }
        }

        for (int in = 0; in < nums.length; in++) {
            if (nums[in]!=in){
                return in;
            }
        }
        return nums.length;
    }
    static void swap(int[] arr,int f,int l){
        int temp=arr[f];
        arr[f]=arr[l];
        arr[l]=temp;
    }
}