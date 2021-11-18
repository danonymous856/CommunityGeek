package com.Recursion;

public class Permutation {
    public static void main(String[] args) {
        permutation("","asd");

    }
    static void permutation(String a,String b){
        if (b.isEmpty()){
            System.out.println(a);
            return;
        }

        char ch=b.charAt(0);

        for (int i = 0; i < a.length() ; i++) {
            String f=a.substring(0,i);
            String s=a.substring(i,a.length());
            permutation(f+ch+s,b.substring(1));
        }
    }
}
