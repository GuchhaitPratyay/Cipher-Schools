package SearchingAndSorting;

import java.util.Scanner;

public class Separated0And1 {

    private static void modifyArray(int[] array) {
        int left = 0;
        int right = array.length-1;

        while ( left < right) {
            if (array[left] == 0) {
                ++left;
            }
            if (array[right] == 1) {
                --right;
            }
            if (array[left] != 0 && array[right] != 1) {
                array[left] = 0;
                array[right] = 1;
                ++left;
                --right;
            }
        }
        printArray(array);
    }

    private static void printArray(int[] arr) {
        for (int x : arr) {
            System.out.print(x + "  ");
        }
        System.out.println();
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
        modifyArray(arr);
        in.close();
    }
}