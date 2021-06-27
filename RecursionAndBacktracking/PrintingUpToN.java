package RecursionAndBacktracking;

import java.util.Scanner;

public class PrintingUpToN {

    private static void printingNumbers(int number) {
        //base case
        if (number == 0) {
            return;
        }
        //recursive assumption
        printingNumbers(number-1);
        //self work
        System.out.println(number);
    }

    public static void main(String[] pg) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the up to which number you want to print: ");
        int n = scanner.nextInt();
        printingNumbers(n);
        scanner.close();
    }
}
