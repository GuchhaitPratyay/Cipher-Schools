package SearchingAndSorting;

import java.util.Scanner;

public class MergingArrays {
    private static void smartWayMerge(int[] first , int[] second) {
        int fillIndex = first.length-1;     //points to the end of the first array m+n
        int secondIndex = second.length-1;      //points to the end of the second array n
        int firstIndex = first.length-second.length-1;      //points to the end the first array m
        /*
         *Using the concept that extreme right of the first array should always be large values.
         */
        while (firstIndex >= 0 && secondIndex >= 0) {
            if (first[firstIndex] < second[secondIndex]) {
                first[fillIndex] = second[secondIndex];
                --secondIndex;
            } else {
                first[fillIndex] = first[firstIndex];
                --firstIndex;
            }
            --fillIndex;
        }
        while (fillIndex >= 0 && secondIndex >= 0) {
            first[fillIndex] = second[secondIndex];
            --fillIndex;
            --secondIndex;
        }

        while (fillIndex >= 0 && firstIndex >= 0) {
            first[fillIndex] = first[firstIndex];
            --fillIndex;
            --firstIndex;
        }
        printArray(first);
    }

    private static void printArray(int[] first) {
        System.out.println("Merged Array!!");
        for (int x : first) {
            System.out.print(x + " ");
        }
    }

    public static void main(String[] pg) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size of the second array : ");
        int n = in.nextInt();
        int[] second = new int[n];

        System.out.println("Enter the elements of the array!!");
        for (int i = 0 ; i < n ; ++i) {
            second[i] = in.nextInt();
        }

        System.out.print("Enter the size of the first array : ");
        int m = in.nextInt();
        int[] first = new int[m+n];

        System.out.println("Enter the elements of the array!!");
        for (int i = 0 ; i < first.length ; ++i) {
            first[i] = in.nextInt();
        }
        smartWayMerge(first,second);
        in.close();
    }
}