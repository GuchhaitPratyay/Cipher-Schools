package SearchingAndSorting;

import java.util.Scanner;

public class TwoPeopleMeet {

    private static boolean isMeet(int distance1 , int velocity1 , int distance2 , int velocity2) {
        if ((distance1  > distance2 && velocity1 > velocity2) || (distance2 > distance1 && velocity2 >velocity1)) {
            return false;
        }

        int relativeDistance = Math.abs(distance1 - distance2);
        int relativeVelocity = Math.abs(velocity1 - velocity2);

        return relativeDistance % relativeVelocity == 0;
    }

    public static void main(String[] pg) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Position of A: ");
        int distance1 = in.nextInt();
        System.out.print("Enter the Speed of A: ");
        int velocity1 = in.nextInt();

        System.out.print("Enter the Position of B: ");
        int distance2 = in.nextInt();
        System.out.print("Enter the Speed of B: ");
        int velocity2 = in.nextInt();

        if (isMeet(distance1,velocity1,distance2,velocity2)) {
            System.out.println("They will Meet!!");
        } else {
            System.out.println("They will Not Meet!!");
        }
        in.close();
    }
}