package SearchingAndSorting;

public class InversionCount {
    private static int countingInversion(int[] arr) {
        int count = 0;
        for (int i = 0 ; i < arr.length ; ++i) {
            for (int j = 0 ; j < arr.length ; ++j) {
                if (arr[i] > arr[j]) {
                    ++count;
                }
            }
        }
        return count;
    }

    public static void main(String[] pg) {

    }
}
