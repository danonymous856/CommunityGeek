package com.company;

import java.util.Scanner;

public class Temperaturre {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Please enter the vslue of the temperature in celcius and we will give the temperatuure in fahrenheight: ");
        float temperature_in_cedlcius= input.nextFloat();
        float temperagturre_in_fahrenheight=input.nextFloat();

        float result=(temperature_in_cedlcius*9/5)+32;

        System.out.println("so the result is: " + result + " fahrenheight");
    }
}
