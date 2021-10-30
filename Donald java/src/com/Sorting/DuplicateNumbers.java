package com.Sorting;

public class DuplicateNumbers {
    public static void main(String[] args) {

    }
    public int findDuplicate(int[] nums) {
        int i=0;
        while (i<nums.length) {
            int correctIndex=nums[i]-1;
            if (nums[i]!=nums[correctIndex]){
                swapp(nums,i,correctIndex);
            }
            else {
                i++;
            }
        }

//        looking for the duplicate
        for (int j = 0; j < nums.length; j++) {
            if (nums[j]!=j+1){
                return nums[j];
            }
        }

        return nums.length;

    }

    private void swapp(int[] nums, int i, int correctIndex) {
        int t=nums[i];
        nums[i]=nums[correctIndex];
        nums[correctIndex]=t;
    }

}
