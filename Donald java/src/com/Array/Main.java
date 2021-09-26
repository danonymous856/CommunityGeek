package com.Array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        just texting !
//        int[] rollno= {4,8,7,89,78};
//        System.out.println(Arrays.toString(rollno));
        man();
//        System.out.println(man());
    }
    static void man(){
        int[] m={4,5,6,7,8,5};
        int rum=m[1]-m[0];
//        System.out.println(rum);
        System.out.println(Arrays.toString(new int[]{rum}));

    }

}
