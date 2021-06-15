package SearchingAndSorting;

import java.util.Arrays;
import java.util.Scanner;

public class AlternateSorting {
    private static void sortTheArray(int[] arr) {
        Arrays.sort(arr);

        int high = arr.length-1;
        int low = 0;

        while (low < high) {
            System.out.print(arr[high] + "  ");
            System.out.print(arr[low] + "  ");
            --high;
            ++low;
        }
    }

    public static void main(String[] pg) {
        Scanner in = new Scanner(System.in);
        System.out.print("Array Length: ");
        int n = in.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter Array Elements:");
        for (int i = 0 ; i < n ; ++i) {
            arr[i] = in.nextInt();
        }

        sortTheArray(arr);
        in.close();
    }
}