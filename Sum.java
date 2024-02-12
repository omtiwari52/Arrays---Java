package Arrays;

public class Sum {
    public static int printSum(int arr[]){
        int sum = 0;
        for(int i = 0;i<arr.length;i++){
            sum = sum+arr[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        int arr[] = {4,6,8};
        System.out.println(printSum(arr));
    }
}
