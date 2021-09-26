package com.Donald;

import java.util.Arrays;

public class ChangeValue {
    public static void main(String[] args) {
        int[] array={1,2,3,7,8,65,32,54,45};
        change(array);
        System.out.println(Arrays.toString(array));
    }
    static void change(int[] nums){
        nums[0]=89;
        nums[3]=58;
    }
}
