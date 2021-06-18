package SearchingAndSorting;

import java.util.Scanner;

public class BinarySearch {
    private static int searchInSortedArray(int[] arr , int target) {
        int high = arr.length-1;
        int low = 0;

        while (low < high) {
            int mid = (low+high) >> 1;
            if (arr[mid] < target) {
                low = mid + 1;
            } else if (arr[mid] > target) {
                high = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    public static void main(String[] pg) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size of the Array: ");
        int n = in.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements of the Array!!");        //All the elements for the array must be sorted.(Condition for Binary Search).
        for (int i = 0; i < n; ++i) {
            arr[i] = in.nextInt();
        }
        System.out.print("Enter element to search: ");
        int target = in.nextInt();

        if (searchInSortedArray(arr , target) >= 0) {
            System.out.println("Element found at index" + searchInSortedArray(arr,target));
        } else {
            System.out.println("Element not found!!");
        }

        in.close();
    }
}