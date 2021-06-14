package SearchingAndSorting;

import java.util.Scanner;

public class PeakElement {
    private static int findingPeak(int[] arr) {
        int high = arr.length;
        int low = 0;

        while (low < high) {
            int mid = (high+low+1)>>1;
            if (arr[mid] < arr[mid - 1]) {
                high = mid - 1;
            } else if (arr[mid] < arr[mid + 1]) {
                low = mid + 1;
            } else {
                return arr[mid];
            }
        }
        return -1;
    }

    public static void main(String[] pg) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the length of the Array: ");
        int n = in.nextInt();
        int[] arr = new int[n];
        //Assuming the array elements are non-negative
        System.out.println("Enter the Elements!!");
        for (int i = 0 ; i < n ; ++i) {
            arr[i] = in.nextInt();
        }
        int result = findingPeak(arr);
        if (result > 0 ) {
            System.out.println("The Element is " + result);
        } else {
            System.out.println("No peak element.");
        }

        in.close();
    }
}