package com.Donald;

public class Greeting {
    public static void main(String[] args) {
        String greeting=Greet();
//        System.out.println(greeting);


        int i=0;
        while (i<5){
            System.out.println(greeting);
            i++;
        }
    }

    static String Greet(){
        String greet="Hello World";
        return greet;
    }
}
