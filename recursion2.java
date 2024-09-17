import java.util.*;

public class recursion2 {
    // for placing 2 cross 3 tile there are 3 possibilities
    // for 2 cross n tile there will be n ways to place
    public static int tilingProblem(int n) {
        // base case
        if (n == 0 || n == 1) {
            return 1;
        }
        // 2 x n (floor size)
        // vertical choice
        int fnm1 = tilingProblem(n - 1);
        // horizontal choice
        int fnm2 = tilingProblem(n - 2);
        int totalWays = fnm1 + fnm2;
        return totalWays;
        // same logic can be used in 4 x n tiles
    }

    public static void removeDuplicates(String str, int idx, StringBuilder newStr, boolean map[]) {
        if (idx == str.length()) {
            System.out.println(newStr);
            return;
        }
        char currChar = str.charAt(idx);
        if (map[currChar - 'a'] == true) {
            // duplicate
            removeDuplicates(str, idx + 1, newStr, map);
        } else {
            map[currChar - 'a'] = true;
            removeDuplicates(str, idx + 1, newStr.append(currChar), map);

        }
    }

    // friends pairing problem
    public static int friendsPairing(int n) {
        if (n == 1 || n == 2) {
            return n;
        }
        // choices
        // single
        int fnm1 = friendsPairing(n - 1);
        // pair
        int fnm2 = friendsPairing(n - 2);
        int pairWays = (n - 1) * fnm2;
        // totalways
        int totWays = fnm1 + pairWays;
        return totWays;
    }

    // print binary string without consecutive ones.
    public static void printBinaryStrings(int n, int lastPlace, String str) {
        if (n == 0) {
            System.out.println(str);
            return;
        }
        // str.append("0");
        // sit o on chain n
        printBinaryStrings(n - 1, 0, str + "0");
        if (lastPlace == 0) {
            printBinaryStrings(n - 1, 1, str + "1");
        }

    }

    public static void main(String args[]) {
        System.out.println(tilingProblem(3));
        String str = "appnnacollege";
        removeDuplicates(str, 0, new StringBuilder(""), new boolean[26]);
        friendsPairing(3);
        printBinaryStrings(3, 0, "");
    }
}
