package com.LinearSearch;

public class SearchInString {
    public static void main(String[] args) {
        String name="Donald";
        char target='n';
        System.out.println(sarch(name,target));

    }

    private static boolean sarch(String str, char target) {
        if (str.length()==0){
            return false;
        }

        for (int i = 0; i < str.length(); i++) {
            if (target==str.charAt(i)){
                return true;
            }
        }
        return false;
    }
}
