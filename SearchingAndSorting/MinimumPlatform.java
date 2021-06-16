package SearchingAndSorting;

import java.util.Arrays;
import java.util.Scanner;

public class MinimumPlatform {
    private static int countingPlatforms(int[] arrival , int[] departure) {
        int platform = 1;
        Arrays.sort(arrival);
        Arrays.sort(departure);

        int arrivalIndex = 1;
        int departureIndex = 0;
        while (arrivalIndex < arrival.length && departureIndex < departure.length) {
            if (arrival[arrivalIndex] <= departure[departureIndex]) {
                ++platform;
            } else {
                --platform;
            }
            if (platform < 1) {
                platform = 1;
            }
            ++arrivalIndex;
            ++departureIndex;
        }

        return platform;
    }
    public static void main(String[] pg) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of Trains: ");
        int n = in.nextInt();
        int[] arrival = new int[n];
        int[] departure = new int[n];

        System.out.println("Enter the arrival times in Hours!!");
        for (int i = 0 ; i < n ; ++i) {
            arrival[i] = in.nextInt();
        }
        System.out.println("Enter the departure times in Hours!!");
        for (int i = 0 ; i < n ; ++i) {
            departure[i] = in.nextInt();
        }

        int platform = countingPlatforms(arrival,departure);
        System.out.println("Minimum number of platforms required : " + platform);

        in.close();
    }
}