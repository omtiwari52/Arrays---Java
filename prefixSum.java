package Arrays;

public class prefixSum {
    public static void maxSubarryaSum(int arr[]){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int prefix[] = new int[arr.length];
        prefix[0] = arr[0];
        // calculate prefix sum
        for(int i = 1;i<prefix.length;i++){
            prefix[i] = prefix[i-1] + arr[i];
        }

        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                currSum = i == 0 ? prefix[j] :prefix[j]-prefix[i-1];

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

/////////////////////
// Time Complexity
//  O(n^2)
