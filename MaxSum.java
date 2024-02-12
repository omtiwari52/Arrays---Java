package Arrays;

public class MaxSum {
    public static void maxSubarryaSum(int arr[]){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                currSum = 0;
                for(int k=i;k<=j;k++){
                    //Subarry sum 
                    currSum += arr[k];
                }
                System.out.println(currSum);
                if(maxSum < currSum){
                    maxSum = currSum;
                }
            }
        }
        System.out.println("Max Sum = " + maxSum);
    }
    public static void main(String[] args) {
        // int arr[] = {2,4,6,8,10};
        int arr[] = {1,-2,6,-1,3};
        maxSubarryaSum(arr);
    }
}

///////////////
//  Time Complexity 
//  O(n^3 )