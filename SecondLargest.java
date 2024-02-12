package Arrays;

public class SecondLargest {
    public static void main(String[] args) {
        int[] arr = {12, 13, 1, 10, 34, 1};
        findLargestAndSecondLargest(arr);
    }
    public static void findLargestAndSecondLargest(int[] arr) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];
            }
        }
        System.out.println("The largest element is: " + largest);
        System.out.println("The second largest element is: " + secondLargest);
    }
}
// public class Main {
//     public static void main(String[] args) {
//         int[] arr = {12, 13, 1, 10, 34, 1};
//         findLargestAndSecondLargest(arr);
//     }
//     public static void findLargestAndSecondLargest(int[] arr) {
//         int largest = Integer.MIN_VALUE;
//         int secondLargest = Integer.MIN_VALUE;
//         for (int i = 0; i < arr.length; i++) {
//             if (arr[i] > largest) {
//                 secondLargest = largest;
//                 largest = arr[i];
//             } else if (arr[i] > secondLargest && arr[i] != largest) {
//                 secondLargest = arr[i];
//             }
//         }
//         if (secondLargest == Integer.MIN_VALUE) {
//             System.out.println("There is no second largest element.");
//         } else {
//             System.out.println("The largest element is: " + largest);
//             System.out.println("The second largest element is: " + secondLargest);
//         }
//     }
// }