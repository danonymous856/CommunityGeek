package com.Donald;

import java.util.Scanner;

public class Parameters {
    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);
        System.out.println("Please enter the names:");
        String name=in.next();

        System.out.println("Please enter the Surnames:");
        String Surname= in.next();

        String naam=Glenn(name,Surname);
        String Watashiwa=Glenn(name,Surname);
        String Ni=Glenn(name,Surname);
        String Haoy=Glenn(name,Surname);
//        String Isekai=Glenn(name,Surname);
        String Jiraiya=Glenn(name,Surname);
//        String Sage=Glenn(name,Surname);


        System.out.println("Plase enter the ID:");
        int num= in.nextInt();

        switch (num){
            case 1:
                System.out.println(naam);
                break;
            case 2:
                System.out.println(Watashiwa);
                break;
            case 3:
                System.out.println(Ni);
                break;
            case 4:
                System.out.println(Jiraiya);
                break;
            case 5:
                System.out.println(Haoy);
                break;
            default:
                System.out.println("invalid.");
        }
    }

    static String Glenn(String name,String Surname) {
        String sentence="my name is "+ name + Surname +"!\n";
        String kuchbhi= name + Surname +" is a Good Boy\n ";
        String hiha= name + Surname +" was on the go. \n";
        String Everything = sentence + kuchbhi + hiha;
        return Everything;
    }
//    public static void main(String[] args) {
//        String message=personalised(" Japan"," Kyoto"," Tokyo");
//        System.out.println(message);
//    }

//    static String personalised(String a,String b,String c) {
//        String greet="Hello"+a+b+c;
//        return greet;
//    }
}
