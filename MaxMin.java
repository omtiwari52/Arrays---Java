package Arrays;

public class MaxMin {
    public static void maxMinArray(int arr[]){
        int maxElem = arr[0];
        int minElem = arr[0];

        for(int i = 1 ;i<arr.length;i++){
            if(arr[i]>maxElem){
                maxElem = arr[i];
            }else if (arr[i] < minElem){
                minElem = arr[i];
            }
        }
        System.out.println("Min is : "+minElem);
        System.out.println("Max is : "+maxElem);
    }
    public static void main(String[] args) {
        int arr[] = {2,5,4,6,1,58,49,78};
        maxMinArray(arr);
    }
}
