package com.Recursion;

import java.util.ArrayList;

public class NumPad {
    public static void main(String[] args) {
        pad("","12");
//        System.out.println();
        System.out.println(padRet("","12"));
    }
    static void pad(String a,String b){
        if (b.isEmpty()){
            System.out.println(a);
            return;
        }

        int digit = b.charAt(0) - '0' ;  //type casting string to integer

        for (int i = (digit-1)*3; i < digit*3 ; i++) {
            char ch =(char) ('a'+i);
            pad(a+ch,b.substring(1));
        }
    }
    static ArrayList<String> padRet(String a,String b){
        if (b.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(a);
            return list;
        }
        int digit = b.charAt(0)+'0';

        ArrayList<String> nums = new ArrayList<>();

        for (int i = (digit-1)*3; i < digit*3 ; i++) {
            char ch =  (char) ('a'+i);
            nums.addAll(padRet(a+ch,b.substring(1)));
        }
        return nums;
    }
}
