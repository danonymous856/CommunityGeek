import java.util.Arrays;

public class reverseArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        System.out.println(Arrays.toString(reverse(arr)));
    }

    static int[] reverse(int[] arr){
        int start = 0;
        int end = arr.length-1;

        while (start<end){
            swap(arr,start,end);
            start+=1;
            end-=1;
        }
        return arr;
    }

    static void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
