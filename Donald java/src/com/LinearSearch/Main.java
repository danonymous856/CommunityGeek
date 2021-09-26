package com.LinearSearch;

public class Main {
    public static void main(String[] args) {
        int[] nums ={2,7,86,9,69,338};
        int target=9;

        System.out.println(linearsearch(nums,target));
    }

//     search in array : Return the index if a item is found
//     Otherwise if a item is not found return -1
    static  int linearsearch(int[] list,int target){  //array and the terget element
        if (list.length==0){
            return -1;
        }

        for (int index = 0; index < list.length; index++) {
            int element=list[index];
            if (element == target){
                return index;
            }
        }
        return -1;
    }


}
