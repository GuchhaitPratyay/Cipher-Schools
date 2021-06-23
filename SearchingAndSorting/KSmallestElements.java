package SearchingAndSorting;

import java.util.Scanner;

public class KSmallestElements {
    private static void printKSmallestElement(int[] arr , int window) {
        for (int i = window ; i < arr.length ; ++i) {
            int maxElement = arr[window-1];        //Assuming that starting element is maximum
            int maxPosition = window-1;            //Index of the maximum element
            for (int j = window-2 ; j >= 0 ; --j) {
                if (arr[j] > maxElement) {
                    maxElement = arr[j];
                    maxPosition = j;
                }
            }

            if (maxElement > arr[i]) {
                int m = maxPosition;
                while (m < window-1) {
                    arr[m] = arr[m+1];
                    ++m;
                }
                arr[window-1] = arr[i];
            }
        }
        System.out.println("Minimum Elements!!");
        for (int k = 0 ; k < window ; ++k) {
            System.out.print(arr[k] + "  ");
        }
    }
    public static void main(String[] pg) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size of the Array: ");
        int n = in.nextInt();
        int[] array = new int[n];

        System.out.println("Enter the elements!!");
        for (int i = 0 ; i < n ; ++i) {
            array[i] = in.nextInt();
        }
        System.out.print("Enter the window length: ");
        int k = in.nextInt();
        printKSmallestElement(array,k);
        in.close();
    }
}