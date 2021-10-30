package com.Anita;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class PoojaDudallwar {

//        System.out.println(book(300,400,"xyz","abc"));
public static void main(String[] args) {
    Scanner in =new Scanner(System.in);
    ArrayList<Integer> arr=new ArrayList<>(10);
    for (int index = 0; index < 10; index++) {
        arr.add(in.nextInt());
    }
    for (int index = 0; index < 10; index++) {
        System.out.println(arr.get(index));
    }
    System.out.println(arr);

    System.out.println("To insert a element!\nEnter the index: ");
    int index=in.nextInt();
    System.out.println("Enter the new element: ");
    int ele=in.nextInt();

    int insert=insertion(arr,index,ele);
    System.out.println("result:"+arr);

    System.out.println("To delete a element at index ____ : :");
    int inde=in.nextInt();
    int delete=deletion(arr,inde);
//        System.out.println(delete);
    System.out.println(arr);

    System.out.println("TO search for an element:\n Enter the element you want to look for:");
    int search=searching(arr, in.nextInt());
    System.out.println(search);
//        System.out.println(arr);

    System.out.println("TO Swap elements :\n Enter the indices which you wanna swap:");
    int swaping= swap(arr,in.nextInt(),in.nextInt());
//        System.out.println(swaping);
    System.out.println(arr);

    System.out.println("To update a value:\nEnter the index and element :  ");
    int update=updating(arr,in.nextInt(),in.nextInt());
//        System.out.println(update);
    System.out.println(arr);

}

    private static int updating(ArrayList<Integer> arr, int indi,int eleme) {
        arr.set(indi,eleme); //first parameter is for the index and the second is for that index value !
        return -1;
    }

    private static int swap(ArrayList<Integer> arr, int u, int y) {
        int temp= arr.get(u);
        arr.set(u, arr.get(y));
        arr.set(y, temp);
        return -1;
    }

    private static int searching(ArrayList<Integer> arr, int target ) {
        for (int g = 0; g < 10; g++) {
            if (target== arr.get(g)){
                return g;
            }
        }
        return -1;
    }

    private static int deletion(ArrayList<Integer> arr, int index) {

        arr.remove(index);
        return  -1;
    }

    private static int insertion(ArrayList<Integer> arr, int index, int i) {
        arr.add(index,i);
        return -1;
    }

}




