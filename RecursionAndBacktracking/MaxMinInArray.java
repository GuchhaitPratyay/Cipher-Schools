package RecursionAndBacktracking;

import java.util.Scanner;

public class MaxMinInArray {

    private static int minimumElement(int[] arr , int index) {
        if (index == arr.length-1) {
            return arr[index];
        }
        int smallProblemMin = minimumElement(arr,index+1);
        return Math.min(arr[index] , smallProblemMin);
    }

    private static int maximumElement(int[] arr , int index) {
        if (index == arr.length-1) {
            return arr[index];
        }
        int smallProblemMax = maximumElement(arr,index+1);
        return Math.max(arr[index] , smallProblemMax);
    }

    public static void main(String[] pg) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Array Length: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter Array Elements:");
        for (int i = 0 ; i < n ; ++i) {
            arr[i] = scanner.nextInt();
        }
        System.out.println("Maximum element: " + maximumElement(arr,0));
        System.out.println("Minimum element: " + minimumElement(arr,0));
        scanner.close();
    }
}