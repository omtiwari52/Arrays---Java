package Arrays;


public class Searchsorted {
    public static boolean searchKeyInSorted(int arr[][],int k){  // O(n+m)
        int row = 0, col = arr.length-1;

        while(row<arr.length && col >=0){
            if(arr[row][col]==k){
                System.out.println("found at (" + row + "," + col + ")");
                return true;
            }
            else if(k < arr[row][col]){
                col--;
            }
            else{
                row++;
            }
        }
        System.out.println("key not found");
        return false;
    }
    public static void main(String[] args) {
        int arr[][] = {{10,20,30,40},
                       {15,25,35,45},
                       {27,29,37,48},
                       {32,33,39,50 }};
        int k = 33;
        searchKeyInSorted(arr, k);
    }
}
