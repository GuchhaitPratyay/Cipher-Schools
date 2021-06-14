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
        int indexOfElement = 0;
        int count = 1;
        for (int i = 1 ; i < arr.length ; ++i) {
            if (count < 0) {
                frequentElement = arr[i];
                indexOfElement = i;
                continue;
            }
            if (frequentElement == arr[i]) {
                ++count;
            } else {
                --count;
            }
        }
        return frequentElement;
    }
    public static void main(String[] pg) {
        Scanner in = new Scanner(System.in);
    }
}
