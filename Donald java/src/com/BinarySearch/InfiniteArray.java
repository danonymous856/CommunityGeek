package com.BinarySearch;

import java.util.Scanner;

public class InfiniteArray {
    public static void main(String[] args) {
        int[] nums={1,5,7,17,18,21,25,28,35,39};

        int target=39;

        int ans=ans(nums,target);
        System.out.println(ans);
        System.out.println(ans(nums,target));
    }

    static  int ans(int[] nums,int target){
        int start=0;
        int end=1;

        while (target>nums[end]){
            int temp=end+1;
            end=end+(end-start+1)*2;//end =previous end+sizeofchunk*2
            start=temp;
        }
        return binarySearch(nums,target,start,end);
    }

    private static int binarySearch(int[] nums, int target,int start,int end) {
        while (start<=end){
            int mid=start+(end-start)/2;
            if (target<nums[mid]){
                end=mid-1;
            }
            else if (target>nums[mid]){
                start=mid+1;
            }
            else {
                return mid;
            }
        }
    return -1;
    }

}

