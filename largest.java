package Arrays;
public class largest {
    public static int getLargest(int arr[]){
        int value = Integer.MIN_VALUE; // -infinity
        int smallest = Integer.MAX_VALUE; // +infinity

        for(int i = 0;i<arr.length;i++){
            if(arr[i] > value){
                value = arr[i];
            }
            if(arr[i]<smallest){
                smallest = arr[i];
            }
        }
        System.out.println("Smallest value is : " + smallest);
        return value;
    }
    public static void main(String[] args) {
        int arr[] = {1,8,4,5,7,2,85,98,100,45,12};
        System.out.println("Largest value is : " + getLargest(arr));
    }
}
