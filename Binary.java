package Arrays;
import java.util.*;

public class Binary {
    public static int binarySearch(int arr[],int key){
        int start = 0 , end = arr.length-1;

        while(start <= end){
            int mid = (start+end)/2;

            // comparision 
            if(arr[mid]==key){
                return mid;
            }
            if(arr[mid]<key){   //right
                start = mid+1;
            }
            else{  //left
                end = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {1,5,6,8,45,52,69,72,77,85,89,94,99};
        Scanner sc = new Scanner(System.in);
        int key = sc.nextInt();
        System.out.println("Index for the Key is : " +binarySearch(arr,key));
    }
}
