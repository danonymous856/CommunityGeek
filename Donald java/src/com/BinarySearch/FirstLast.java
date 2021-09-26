package com.BinarySearch;

import java.util.Arrays;

public class FirstLast {
    public static void main(String[] args) {
        int[] nums={1,2,3,55,4,5,7,8,8,12,4,8};
        int target=8;

        int[] ans= searchRange(nums, target);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] searchRange(int[] nums, int target) {
        int[] ans={-1,-1};

        int start = bisearch(nums,target,true);
        int end = bisearch(nums,target , false);

        ans[0]=start;
        ans[1]=end;
//        int[] ans={-1,-1};
        return ans;
    }
    static int bisearch(int[] nums, int target, boolean TrueAndFalse) {
//        int ret = -1;
        int ans=-1;

        int start=0;
        int end= nums.length-1;

        while (start<=end){
            int mid=start+(end-start)/2;

            if (target<nums[mid]){
                end=mid-1;
            }
            else if (target>nums[mid]){
                start=mid+1;
            }
            else {
                ans=mid;
                if (TrueAndFalse){
                    end=mid-1;
                }
                else {
                    start=mid+1;
                }
            }
        }
        return ans;
//        return ret;
    }

}


