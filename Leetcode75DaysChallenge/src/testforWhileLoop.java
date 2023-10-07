import java.util.Arrays;

public class testforWhileLoop {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        System.out.println(Arrays.toString(arr));
        jinx(arr);
        System.out.println(Arrays.toString(arr));
    }
    static int[] jinx(int[] nums){
        int i = 1;
        while (i < nums.length){
            nums[i]+=nums[i-1];
            i++;
        }
        return nums;
    }
}
