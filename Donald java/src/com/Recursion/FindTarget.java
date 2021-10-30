package com.Recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class FindTarget {
    public static void main(String[] args) {
        Scanner i9n=new Scanner(System.in);
        int[] arr=new int[9];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=i9n.nextInt();
        }
        System.out.println("enter the target");
        int target=i9n.nextInt();

        System.out.println("Will give you tell you either the value is present or not \n"+findIndex(arr,target,0));/////
        System.out.println("Will give you the index from start \n"+findIndexFormStart(arr,target,0));
        System.out.println("Will give you the index from last \n"+findIndexFromLast(arr,target,arr.length-1));
        ArrayList<Integer> ans=findIndexAll(arr,target,0,new ArrayList<>());
        System.out.println("Will give you the index of all in Arraylist \n "+ ans);
    }
    static boolean findIndex(int[] arr, int target, int index){
        if ( index == arr.length){
            return false;
        }
        return arr[index]==target || findIndex(arr, target, index+1);
    }//TRue or false

    static int findIndexFromLast(int[] arr, int target, int index){
        if ( index == -1){
            return index;
        }
        if (arr[index]==target){
            return index;
        }
        else{
            return findIndexFromLast(arr, target, index-1);
        }
    }// int


    static ArrayList<Integer> findIndexAll(int[] arr, int target, int index,ArrayList<Integer> nums){

        if ( index == arr.length){
            return nums;
        }
        if (arr[index]==target){
            nums.add(index);
        }
        return findIndexAll(arr, target, index+1,nums);
    }//int[]

    static int findIndexFormStart(int[] arr, int target, int index){
        if ( index == arr.length){
            return -1;
        }
        if (arr[index]==target){
            return index ;
        }
        return  findIndexFormStart(arr, target, index+1);
    }//int

}
