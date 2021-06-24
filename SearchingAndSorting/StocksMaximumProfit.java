package SearchingAndSorting;

import java.util.Scanner;
/*
Assume that the first stock will be bought,then run and loop from 1 to length of array
put large = first element ,
check if the next element is larger than large
if (large < currentElement) {
    totalStocks = Math.abs(large-currentElement);
    large = currentElement;
}
 */
public class StocksMaximumProfit {
    private static int maximumProfit(int[] array) {
        int currentLarge = array[0];
        int totalProfit = 0;
        for (int i = 1 ; i < array.length ; ++i) {
            if (array[i] > currentLarge) {
                totalProfit += Math.abs(currentLarge-array[i]);
            }
            currentLarge = array[i];
        }
        return totalProfit;
    }
    public static void main(String[] pg) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size of the Array: ");
        int n = in.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the prices of the Stocks!!");
        for (int i = 0 ; i < n ; ++i) {
            arr[i] = in.nextInt();
        }
        System.out.println(maximumProfit(arr));
        in.close();
    }
}