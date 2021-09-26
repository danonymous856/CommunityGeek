package com.Donald;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
      int ans= Sum();
        System.out.println(ans);
    }

//    static void Sum(){
//        Scanner input=new Scanner(System.in);
//        System.out.println("Please enter the value of the numbers:");
//        int num1=input.nextInt();
//        int num2=input.nextInt();
//
//        int sum=num1+num2;
//
//        System.out.println(sum);
      static int Sum(){
        Scanner INPUT =new Scanner(System.in);

        int num1=INPUT.nextInt();
//        int num2=INPUT.nextInt();

          for (int i = 1; i <1000 ; i++) {
              while (num1%2==0){
                  int sum=num1++;
                  System.out.println(sum);
              }
          }
//        int sum=num1+num2;
//          int sum=;
//          return sum;
          return num1;
      }
}
