package com.company;

public class PreetyPrinting {
    public static void main(String[] args) {
        System.out.println('a'+'b');//char and char giving ASCII value
        System.out.println("a"+"b");//String and String getting concatenated
        System.out.println('a'+3);//char and integer giving (Ascii value +3)
        System.out.println((char) ('a'+3));//type casting to char instead.
    }
}


