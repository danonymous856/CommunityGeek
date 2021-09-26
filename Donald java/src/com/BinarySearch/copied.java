package com.BinarySearch;

public class copied {
    public static void main(String[] args) {
        int[] nums={1,2,3,4,8,5,9};
        int target=7;
//        int[] ans=twoSum(nums,target);
        System.out.println(twoSum(nums,target));
    }
    static int[] twoSum(int[] nums, int target) {

        int[] ret={-1,-1};

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (target==nums[i]+nums[j]){
                    return new int[] {i,j};
                }

            }
        }
        return ret;
    }

}
   /* public int[] twoSum(int[] nums, int target) {
        int[] ret={-1,-1};

        for (int i = 0; i < nums.length; i++) {

            int[] ans={i,i};

            while (target==nums[i]+nums[i]){
                return ans;
            }
        }
        return ret;
    }*/