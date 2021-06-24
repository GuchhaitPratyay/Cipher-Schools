package SearchingAndSorting;

import java.util.Scanner;

public class SpiralOrderTraversal {
    private static void printingMatrixSpiral(int[][] matrix) {
        int row = matrix.length;
        int column = matrix[0].length;
        int r = 0 , c = 0;

        while (r < row && c < column) {
            for (int i = c ; i < column ; ++i) {
                System.out.print(matrix[r][i] + " ");
            }
            ++r;
            for (int i = r ; i < row ; ++i) {
                System.out.print(matrix[i][column-1] + " ");
            }
            --column;

            if (r < row) {
                for (int i = column-1 ; i >= c ; --i) {
                    System.out.print(matrix[row-1][i] + " ");
                }
                --row;
            }

            if (c < column) {
                for (int i = row-1 ; i >= r ; --i) {
                    System.out.print(matrix[i][c] + " ");
                }
                ++c;
            }
        }
    }

    public static void main(String[] pg) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the row size: ");
        int r = in.nextInt();
        System.out.print("Enter column size: ");
        int c = in.nextInt();
        int[][] matrix = new int[r][c];

        System.out.println("Enter the elements of the matrix!!");
        for (int i = 0 ; i < r ; ++i) {
            System.out.println("Enter row " + i + " elements!");
            for (int j = 0 ; j < c ; ++j) {
                matrix[i][j] = in.nextInt();
            }
        }
        printingMatrixSpiral(matrix);
        in.close();
    }
}