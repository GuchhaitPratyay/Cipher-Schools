package SearchingAndSorting;

import java.util.Scanner;

public class LargestSumSubarray {
    private static int maximumSubarraySum(int[] arr) {
        int maxSum = 0;
        int currentMax = arr[0];
        //traverse the complete array from 0 to arr.length
        for (int j : arr) {
            //add the arr[i] to currentMax
            currentMax += j;
            //check if the currentMax if less than 0
            if (currentMax < 0) {
                currentMax = 0;
            } else if (currentMax > maxSum) {       //if the currentMax if greater than maxSum, then make maxSum = currentSum
                maxSum = currentMax;
            }
        }
        return maxSum;
    }

    public static void main(String[] pg) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements!!");
        for (int i = 0 ; i < n ; ++i) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Maximum Sum of Array is " + maximumSubarraySum(arr));
        sc.close();
    }
}