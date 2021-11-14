package com.Donald;

import java.sql.Array;
import java.util.Arrays;
import java.util.Stack;

public class VarArgs {
    public static void main(String[] args) {
        Arr(1,2,"china","Donald","kris Wu","Shiganshina","Nazar");
//        System.out.println(ans);
    }

     static void Arr(int a,int b, String ...noun) {

         System.out.println(Arrays.toString(noun));
//        String diff=noun[1] +" "+ noun[0];
//        return diff;
    }

}
