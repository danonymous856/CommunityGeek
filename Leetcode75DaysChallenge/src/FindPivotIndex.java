public class FindPivotIndex {
    public static void main(String[] args) {
        int[] arr = {1,7,3,6,5,6};
        int total = totalsum(arr);
        System.out.println(total);
        System.out.println(pivotFind(arr,total));
    }

    static int totalsum(int[] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        return sum;
    }
    static int pivotFind(int[] arr,int total){
        int leftsum = 0;
        for (int i = 0; i < arr.length; i++) {
            int rightsum = total - arr[i] - leftsum;
            if (rightsum==leftsum){
                return i;
            }
            leftsum+=arr[i];
        }
        return -1;
    }
}
