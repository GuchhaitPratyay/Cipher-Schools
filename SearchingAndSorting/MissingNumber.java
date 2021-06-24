package SearchingAndSorting;

import java.util.Scanner;

public class MissingNumber {
    private static int missingElement(int[] array) {
        int n = array.length;
        int totalSum = (n+1)*(n+2)/2;
        for (int x : array) {
            totalSum -= x;
        }
        return totalSum;
    }

    public static void main(String[] pg) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the length of the array: ");
        int n = in.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the element from 1 to....!!");
        for (int i = 0 ; i < n ; ++i) {
            arr[i] = in.nextInt();
        }

        System.out.println("Missing number : " + missingElement(arr));
        in.close();
    }
}