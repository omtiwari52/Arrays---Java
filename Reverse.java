package Arrays;

import java.util.Arrays;
import java.util.Collections;

public class Reverse {
    public static void printArray(int arr[]){
        for(int i = arr.length-1; i>=0;i--){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9};
        printArray(arr);
    }

/////////////// USING ARRAYLIST ///////////

    // public static void reverseArray(int arr[]){
    //     Collections.reverse(Arrays.asList(arr));
    //     System.out.println(Arrays.asList(arr));
    // }
    // public static void main(String[] args) {
    //     int arr[] = {1,2,3,4,5,6,7,8};
    //     reverseArray(arr);
    // }
}