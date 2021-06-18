package SearchingAndSorting;

import java.util.Scanner;

public class InversionCount {
    private static int countingInversion(int[] arr) {
        int count = 0;
        for (int j : arr) {
            for (int k : arr) {
                if (j > k) {
                    ++count;
                }
            }
        }
        return count;
    }

    public static void main(String[] pg) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the length of the array: ");
        int n = in.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements!!");
        for (int i = 0 ; i < n ; ++i) {
            arr[i] = in.nextInt();
        }
        System.out.println("Total number of inversions : " + countingInversion(arr));

        in.close();
    }
}