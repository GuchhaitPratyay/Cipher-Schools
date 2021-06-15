package SearchingAndSorting;

import java.util.Scanner;

public class TrappingRainWater {
    private static int totalWater(int[] array) {
        //initialize left = 0 and right = array.length - 1
        //initialize leftMax = 0 and rightMax = 0 totalWater = 0
        //while (left < right)
        //  if (rightMax<= leftMax) then --> add maximum of 0 and rightMax-array[right],update rightMax
        //else --> add maximum of 0 and leftMax-array[left],update leftMax
        int left = 0 , right = array.length-1 , leftMax = 0 , rightMax = 0 , totalWater = 0;

        while (left <= right) {
            if (rightMax <= leftMax) {
                totalWater += Math.max(0 , rightMax-array[right]);
                rightMax = Math.max(rightMax , array[right]);
                --right;
            } else {
                totalWater += Math.max(0 , leftMax-array[left]);
                leftMax = Math.max(leftMax , array[left]);
                ++left;
            }
        }
        return totalWater;
    }
    public static void main(String[] pg) {
        Scanner in = new Scanner(System.in);
        System.out.print("Array Length: ");
        int n = in.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the Array Elements:");
        for (int i = 0 ; i < n ; ++i) {
            arr[i] = in.nextInt();
        }
        System.out.println("Total Water Trapped = " + totalWater(arr));
        in.close();
    }
}