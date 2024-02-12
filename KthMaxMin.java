package Arrays;
import java.util.*;

// Find the “Kth” max and min element of an array

public class KthMaxMin {
    public static int kthSmallest(int arr[]){
        Arrays.sort(arr);
        return arr[0];
    }
    public static int kthLargest(int arr[]){
        Arrays.sort(arr);
        return arr[arr.length-1];
    }
    public static void main(String[] args) {
        int arr[] = {100,21,38,40,52,63,67,88,19};
        System.out.println("Smallest element is : "+kthSmallest(arr));
        System.out.println("Largest element is : "+kthLargest(arr));
    }
}