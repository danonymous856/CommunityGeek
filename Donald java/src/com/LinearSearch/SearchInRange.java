package com.LinearSearch;

import java.util.Scanner;

public class SearchInRange {

    public static void main(String[] args) {
        int[] nums ={2,9,7,86,9,69,338,9};
        int target=9;
        Scanner in=new Scanner(System.in);
        System.out.println(linearsearch(nums,target,in.nextInt(),in.nextInt()));
    }

    //     search in array : Return the index if a item is found
//     Otherwise if a item is not found return -1
    static  int linearsearch(int[] list,int target,int start,int end){  //array and the terget element
        if (list.length==0){
            return -1;
        }

        for (int index = start; index < end; index++) {
            int element=list[index];
            if (element == target){
                return index;
            }
        }
        return -1;
    }
}


