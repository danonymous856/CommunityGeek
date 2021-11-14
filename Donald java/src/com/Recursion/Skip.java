package com.Recursion;

public class Skip {
    public static void main(String[] args) {
        skip("","baccdah");
        System.out.println(skip2("baaccdd"));
        System.out.println(skipApple("hguihuiapplegcgyfyuvj"));
        System.out.println(skipAppNotApple("nbvcxdfgapplmnbvcft"));
    }
    static void skip(String a,String b){
        if (b.isEmpty()){
            System.out.println(a);
            return;
        }//base condition

        char ch = b.charAt(0);

        if (ch == 'a'){
            skip(a,b.substring(1));
        }
        else{
            skip(a+ch,b.substring(1));
        }
    }

    //return type
    static String skip2(String b){
        if (b.isEmpty()){
            return "";
        }

        char ch = b.charAt(0);

        if (ch == 'a'){
            return skip2(b.substring(1));
        }
        else{
            return ch + skip2(b.substring(1));
        }
    }

    //how about if we want to skip awhole string
    static String skipApple(String b){
        if (b.isEmpty()){
            return "";
        }


        if (b.startsWith("apple")){
            return skipApple(b.substring(5));
        }
        else{
            return b.charAt(0) + skipApple(b.substring(1));
        }
    }
    static String skipAppNotApple(String b){
        if (b.isEmpty()){
            return "";
        }

        char ch = b.charAt(0);

        if (ch == 'a'){
            return skipAppNotApple(b.substring(3));
        }
        else{
            return ch + skipAppNotApple(b.substring(1));
        }
    }
}
