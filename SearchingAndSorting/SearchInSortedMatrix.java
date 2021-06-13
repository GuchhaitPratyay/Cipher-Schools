package SearchingAndSorting;

import java.util.Scanner;

public class SearchInSortedMatrix {

    private static boolean findElement(int[][] matrix,int target) {
        int row = 0;
        int column = matrix[0].length-1;

        while (row < matrix.length && column >= 0) {
            if (matrix[row][column] == target) {
                System.out.println("Element found at " + row + "," + column);
                return true;
            } else if (matrix[row][column] < target) {
                ++row;
            } else {
                --column;
            }
        }
        return false;
    }

    public static void main(String[] pg) {
        Scanner in = new Scanner(System.in);
        System.out.print("Number of Rows: ");
        int row = in.nextInt();
        System.out.print("Number of Columns: ");
        int column = in.nextInt();
        int[][] matrix = new int[row][column];

        for (int i = 0 ; i < row ; ++i) {
            System.out.println("Elements of Row " + i);
            for (int j = 0 ; j < column ; ++j) {
                matrix[i][j] = in.nextInt();
            }
        }
        System.out.print("Element to search: ");
        int target = in.nextInt();

        if(!findElement(matrix,target)) {
            System.out.println("Element not found!!");
        }
        in.close();
    }
}