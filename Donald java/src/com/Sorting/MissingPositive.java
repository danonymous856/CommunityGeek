package com.Sorting;

class Sol {
    public int firstMissingPositive(int[] nums) {

        int i = 0;
        while (i <= nums.length) {
            int coorectIndex=nums[i]-1;
            if (nums[i]<= nums.length && nums[i]>0 && nums[i]!=nums[coorectIndex]){
                swap(nums,i,coorectIndex);
            }
            else {
                i++;
            }
        }
//        return nums[i];

        for (int j = 0; j < nums.length; j++) {
            if (nums[j]!=nums[j]+1){
                return nums[j];
            }
        }

        return nums[i];
    }
    static void  swap(int[] arr,int first, int last ){
        int temp=arr[first];
        arr[first]=arr[last];
        arr[last]=temp;
    }

}