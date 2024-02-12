package Arrays;

public class Arrayssss {
    public static void printmaxsum_prefiarray(int arr[]){
        int current_sum = 0;
        int max_sum =Integer.MIN_VALUE;
        int prefix_array[] = new int[arr.length];
        prefix_array[0] = arr[0];
        for(int i = 1;i<prefix_array.length;i++){
            prefix_array[i] = prefix_array[i-1]+arr[i];
        }
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                current_sum = i == 0 ? prefix_array[j] :prefix_array[j]-prefix_array[i-1];

                if(current_sum>max_sum){
                    max_sum=current_sum;
                }
            }
        }
        System.out.println(max_sum);
    }
    public static void main(String[] args) {
        int arr[] = {1,-2,6,-1,3};
        printmaxsum_prefiarray(arr);
    }
}
