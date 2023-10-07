package com.BinarySearch;

public class BiSearch {
    public static void main(String[] args) {
        int[] nums={1,2,4,5,3,2,1};
        int target=3;
        int ans = search(nums,target);
        System.out.println(ans);
    }
    static int search(int[] nums, int target) {
        int peak=findPeakElement(nums);
        int order=orderAgnosticsBInarySearch(nums,target,0, peak);

        /*while (start<=end){
            int mid=start+(end-start)/2;

            if (target<nums[mid]){
                end=mid-1;
            }
            else if (target>nums[mid]){
                start=mid+1;
            }
            else{
                return mid;
            }
        }*/
        if (order !=-1){
            return order;
        }
        return orderAgnosticsBInarySearch(nums,target,peak+1, nums.length-1);
    }
//    To find the peak element !!!!
    static int findPeakElement(int[] nums) {
        int start=0;
        int end= nums.length-1;

        while(start<=end){
            int mid=start+(end-start)/2;

            if (nums[mid]>nums[mid+1]){
                end =mid;
            }
            else {
                start=mid+1;
            }
        }
        return end;
    }
    static int orderAgnosticsBInarySearch(int[] nums,int target, int start, int end){
        boolean isAsc=nums[start]<nums[end];

        while (start<=end){
            int mid=start+(end-start)/2;

            if (target==nums[mid]){
                return mid;
            }

            if (target<nums[mid]){
                end=mid-1;
            }

            else if (isAsc){
                if (target<nums[mid]) {
                    end = mid - 1;
                }
                else{
                    start=mid+1;
                }
            }
            else {
                if (target>nums[mid]) {
                    end = mid - 1;
                }
                else{
                    start=mid+1;
                }
            }
        }
        return -1;
    }
}


