package SearchingAndSorting;

import java.util.Scanner;

public class MajorityElement {
    /*
    *Write a function which takes an array and prints the majority element (if it exists),
    *otherwise prints “No Majority Element”.
    *A majority element in an array A[] of size n is an element that appears more than n/2 times
    */
    private static int frequentElement(int[] arr) {
        int frequentElement = arr[0];
        int count = 1;
        for (int i = 1 ; i < arr.length ; ++i) {
            if (frequentElement == arr[i]) {
                ++count;
            } else {
                --count;
            }
            if (count == 0) {
                frequentElement = arr[i];
                count = 1;
            }
        }
        if (isFrequentElement(arr , frequentElement)) {
            System.out.println("Found Majority element!!");
            return frequentElement;
        }
        return Integer.MIN_VALUE;
    }
    private static boolean isFrequentElement(int[] arr , int frequentElement) {
        int count = 0;
        for (int x : arr) {
            if (frequentElement == x) {
                ++count;
            }
        }

        return count > arr.length/2;    //returns true if the element is frequent or else return false
    }
    public static void main(String[] pg) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size of the Array :");
        int n = in.nextInt();
        int[] array = new int[n];

        System.out.println("Enter the elements of the Array!!");
        for (int i = 0 ; i < n ; ++i) {
            array[i] = in.nextInt();
        }

        int element = frequentElement(array);
        if (element < 0) {
            System.out.println("Element not Present!!");
        } else {
            System.out.println("Element is " + element);
        }

        in.close();
    }
}