package Arrays;
import java.util.*;

public class linearSearchh {
    public static int linearSearch(int arr[],int key){
        for(int i = 0; i<arr.length;i++){
            if(arr[i]==key){
                return i;
            }
        }return -1;
    }
    public static void main(String[] args) {
        int arr[] = {2,3,6,4,8,9,5,1,12,14};
        Scanner sc = new Scanner(System.in);
        int key = sc.nextInt();
        int idx = linearSearch(arr, key);
        if(idx==-1){
            System.out.println(("Element Not Found"));
        }else{
            System.out.println("key at index : "+ idx);
        }
    }
}
