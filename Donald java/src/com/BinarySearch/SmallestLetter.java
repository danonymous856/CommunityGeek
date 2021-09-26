package com.BinarySearch;

public class SmallestLetter {
    public static void main(String[] args) {

        char[] letters={'c','f','v','y','x','z'};
        char target='e';

        char ans=nextGreatestLetter(letters, target);
        System.out.println(ans);

    }

    public static char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length - 1;

        while (start <= end) {
            int mid_element = start + (end - start) / 2; //coz integer has a limited amt of value to be assigned

            if (target < letters[mid_element]) {
                end = mid_element - 1;
            } else  {
                start = mid_element + 1;
            }
        }
        return letters[start%letters.length];
    }
}
