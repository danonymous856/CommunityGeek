package com.Recursion;

import java.util.ArrayList;

public class NumPad {
    public static void main(String[] args) {
        System.out.println(padRet("","12"));
        pad("","12");
        System.out.println(pad_count("","12"));
    }

//    This will give the possible answers.
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
    //    This will give the possible answers in Arraylist .
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
//    This will give the number of possibilities.
    static int pad_count(String p,String q){
        if (q.isEmpty()){
            return 1;
        }
        int count = 0;
        int digit = q.charAt(0)-'0';

        for (int i = (digit-1)*3 ; i < digit*3; i++) {
            char ch=(char) ('a'+i);
            count = count + pad_count(p+ch,q.substring(1));

        }
        return count;
    }
}
