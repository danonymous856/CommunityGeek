/*

package com.BinarySearch;

import java.text.StringCharacterIterator;
import java.util.Arrays;
import java.util.Scanner;

public class LeetCodeStuff {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String[] letters=new String[14];

        for (int index = 0; index < letters.length; index++) {
            letters[index]=in.next();
        }
        System.out.println(Arrays.toString(letters));

        System.out.println("Enter the values:");
        String target= in.next();
        
        String ans=lett(letters,target);
        System.out.println(ans);
    }

    private static String lett(String[] letters, String target) {
        
    }

    private static char leet(String[] letters, String target) {
        int  start=0;
        int end = letters.length-1;

        while (start<=end){
            int mid=start+(end-start)/2;
            if (target<letters[mid]){
                end=mid-1;
            }
            else if (target>letters[mid]) {
                 start=mid+1;
            }
            else{
                return 'v';
            }
        }
        return 'i';
    }
}
*/
