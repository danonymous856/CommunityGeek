package com.Array;

import java.util.Arrays;
import java.util.Scanner;

public class swap {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);

        int[] aar=new int[5];
        for (int i = 0; i < aar.length; i++) {
            aar[i] = in.nextInt();
        }
//        int[] arr={4,54,78,9,6,1,3,4,56,41,31};
        for (int i = 0; i < aar.length ; i++) {
            System.out.print(aar[i]+ " ");
        }
        System.out.println("\n");

        swap(aar,1,3 );
        System.out.println(Arrays.toString(aar));

    }
    static void swap(int[] arr,int index1,int  index2){
        int temp=arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;
    }
}
