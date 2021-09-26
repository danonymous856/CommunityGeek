/*
package com.BinarySearch;

public class Search {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9,11,16,17,36,45,54};

        int target=11;

        int ans=BiSearch(arr,target);
        System.out.println(ans);

    }

     static int BiSearch(int[] arr, int target) {
        int start=0;
        int end= arr.length-1;

        while (start<=end){
            int mid_element=start+(end-start)/2; //coz integer has a limited amt of value to be assigned

            if (target<arr[mid_element]){
                end=mid_element-1;
            }
            else if (target>arr[mid_element]){
                start=mid_element+1;
            }
            else {
               return mid_element;
            }
        }
        return start;
    }
    static int


}
*/
