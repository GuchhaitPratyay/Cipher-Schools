package RecursionAndBacktracking;

import java.util.ArrayList;
import java.util.Scanner;

public class KeyPadCombination {

    private static String getPattern(char ch) {
        return switch (ch) {
            case '1' -> "abc";
            case '2' -> "def";
            case '3' -> "ghi";
            case '4' -> "jkl";
            case '5' -> "mno";
            case '6' -> "pqr";
            case '7' -> "stu";
            case '8' -> "vwx";
            case '9' -> "yz";
            default -> "";
        };
    }

    private static ArrayList<String> getAllCombination(String input) {
        if (input.length() == 0) {
            ArrayList<String> empty = new ArrayList<>();
            empty.add("");
            return empty;
        }

        String firstCharValue = getPattern(input.charAt(0));        //picks up the first character of the input string

        ArrayList<String> smallProblemCombination = getAllCombination(input.substring(1));

        ArrayList<String> answer = new ArrayList<>();
        for (int i = 0 ; i < firstCharValue.length() ; ++i) {
            for (String s : smallProblemCombination) {
                String output = firstCharValue.charAt(i) + s;
                answer.add(output);
            }
        }
        return answer;
    }

    public static void main(String[] pg) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the keypad pattern: ");
        String pattern = s.nextLine();

        ArrayList<String> answer;
        answer = getAllCombination(pattern);

        for (String str : answer) {
            System.out.println(str);
        }
        s.close();
    }
}