import java.util.*;

public class recursion {
    public static void printDec(int n) {
        if (n == 1) {
            System.out.println(n);
            return;
            // base case
        }
        System.out.print(n + " ");
        // for increasing order reverse the statement
        printDec(n - 1);
        // recursion
    }

    public static int fact(int n) {
        if (n == 0) {
            return 1;
        }
        int fnm1 = fact(n - 1);
        int fn = n * fact(n - 1);
        return fn;
    }

    public static int sum(int n) {
        if (n == 1) {
            return 1;
        }
        int snm1 = sum(n - 1);
        int sn = n + snm1;
        return sn;
    }

    public static int fibNum(int n) {
        if (n == 1 || n == 0) {
            return n;
        }
        int fbnm1 = fibNum(n - 1);
        int fbnm2 = fibNum(n - 2);
        int fbn = fbnm2 + fbnm1;
        return fbn;

    }

    // check if given array is sorted or not
    public static boolean isSorted(int arr[], int i) {
        if (i == arr.length - 1) {
            return true;
        }
        if (arr[i] > arr[i + 1]) {
            return false;
        }
        return isSorted(arr, i + 1);
    }

    // to check the first occurrence of a number
    public static int firstOccur(int ar[], int key, int i) {
        if (ar[i] == key) {
            return i;
        }
        if (i == ar.length) {
            return -1;
        }
        return firstOccur(ar, key, i + 1);
    }

    public static int lastOccur(int ar[], int key, int i) {
        if (i == ar.length) {
            return -1;
        }
        int isFound = lastOccur(ar, key, i + 1);
        if (isFound != -1 && ar[i] == key) {
            return i;
        }
        return isFound;
    }

    // x power of n
    public static int power(int x, int n) {
        if (n == 0) {
            return 1;
        }
        int xnm1 = power(x, n - 1);
        int xn = x * xnm1;
        return xn;
    }

    public static int optimizedPower(int a, int n) {
        if (n == 1) {
            return 1;
        }
        int halfPowerSq = optimizedPower(a, n / 2) * optimizedPower(a, n / 2);
        if (n % 2 != 0) {
            halfPowerSq = a * halfPowerSq;
        }
        return halfPowerSq;
    }

    public static void main(String args[]) {
        int n = 10;
        int arr[] = { 1, 2, 3, 4 };
        int ar[] = { 1, 5, 6, 5, 6, 5, 7 };
        int a = 2;
        printDec(n);
        System.out.println(fact(n));
        System.out.println(sum(n));
        System.out.println(fibNum(n));
        System.out.println(isSorted(arr, 0));
        System.out.println(firstOccur(ar, 5, 0));
        System.out.println(lastOccur(ar, 5, 0));
        System.out.println(power(2, 5));
        System.out.println(optimizedPower(a, n));
    }
}
