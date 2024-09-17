import java.util.*;

public class TowerOfHanoi {
    // using recursion we're going to solve
    // three disc problem
    public static void HanoiTower(int n, String src, String hel, String dest) {
        if (n == 1) {
            System.out.println("transfer disk " + n + "from" + src + "to" + dest);
            return;
        }
        HanoiTower(n - 1, src, dest, hel);
        System.out.println("transfer disk " + n + "from" + src + "to" + dest);
        HanoiTower(n - 1, hel, src, dest);
    }

    public static void main(String[] args) {
        int n = 3;
        HanoiTower(n, "src", "hel", "dest");
    }
}
