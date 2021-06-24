package RecursionAndBacktracking;

import java.util.Scanner;

public class FibonacciNumber {
    private static int printSeries(int n) {
        if (n <= 1) {
            return n;
        }
        return printSeries(n-1) + printSeries(n-2);
    }
    public static void main(String[] pg) {
        Scanner in = new Scanner(System.in);
        System.out.print("Which number of Fibonacci Series: ");
        int n = in.nextInt();

        System.out.println(printSeries(n));
        in.close();
    }
}