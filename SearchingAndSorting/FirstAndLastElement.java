package SearchingAndSorting;

import java.util.Scanner;

public class FirstAndLastElement {
    private static int firstIndexOfElement(int[] arr , int target) {
        int low = 0;
        int high = arr.length-1;
        int firstIndex = -1;

        while (low <= high) {
            int mid = (low+high) >> 1;
            if (arr[mid] > target) {
                high = mid - 1;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                firstIndex = mid;
                high = mid - 1;
            }
        }
        return firstIndex;
    }
    private static int lastIndexOfElement(int[] arr , int target) {
        int low = 0;
        int high = arr.length-1;
        int lastIndex = -1;

        while (low <= high) {
            int mid = (low+high) >> 1;
            if (arr[mid] > target) {
                high = mid - 1;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                lastIndex = mid;
                low = mid + 1;
            }
        }
        return lastIndex;
    }

    public static void main(String[] pg) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size of the Array: ");
        int n = in.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the Array elements!!");
        for (int i = 0 ; i < n ; ++i) {
            arr[i] = in.nextInt();
        }

        System.out.print("Enter the element you want to search: ");
        int target = in.nextInt();

        System.out.println("First occurrence of the element : " + firstIndexOfElement(arr,target));
        System.out.println("Last occurrence of the element : " + lastIndexOfElement(arr,target));
        in.close();
    }
}