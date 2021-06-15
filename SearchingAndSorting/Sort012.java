package SearchingAndSorting;

import java.util.Scanner;

public class Sort012 {
    private static void elementSegregate(int[] arr) {
        //Using a three pointer approach
        int left = 0 , mid = 0 , right = arr.length-1;
        //if arr[mid] == 0
        //swap(arr[mid],arr[left]) --> ++left, ++mid
        //else if arr[mid] == 2
        //swap(arr[mid],arr[right]) --> --right
        //else --> ++mid
        while (mid <= right) {
            if (arr[mid] == 0) {
                swap(arr[mid],arr[left]);
                ++left;
                ++mid;
            } else if (arr[mid] == 2) {
                swap(arr[mid],arr[right]);
                --right;
            } else {
                ++mid;
            }
        }
        printArray(arr);
    }
    private static void swap(int a,int b) {
        int temp = a;
        a = b;
        b = temp;
    }
    private static void printArray(int[] array) {
        for (int x : array) {
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

        elementSegregate(arr);
        in.close();
    }
}