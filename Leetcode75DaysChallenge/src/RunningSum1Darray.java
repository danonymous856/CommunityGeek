import java.util.Arrays;
import java.util.Scanner;

public class RunningSum1Darray {
    public static void main(String[] args) {
        int[] num = {1,2,3,4};
        System.out.println(Arrays.toString(runningSum(num)));
    }

    static int[] runningSum(int[] n){
        for (int i = 1; i < n.length; i++) {
            n[i] += n[i-1];
        }
        return n;
    }
}
