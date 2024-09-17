import java.util.*;

public class SearchInRotatedSortedArray {
    public static int search(int arr[], int tar, int si, int ei) {
        if (si > ei) {
            return -1;
        }
        int mid = si + (ei - si) / 2;
        if (arr[mid] == tar) {
            return mid;
        }
        // mid lies on L1
        if (arr[si] <= arr[mid]) {
            // case 1:left search
            if (arr[si] <= tar && tar <= mid) {
                return search(arr, tar, si, mid - 1);
            } else {
                // case 2: Rigth
                return search(arr, tar, mid + 1, ei);
            }
        } // mid om L2
        else {
            // case 1:right search
            if (arr[mid] <= tar && tar <= arr[ei]) {
                return search(arr, tar, mid + 1, ei);
            } else {
                return search(arr, tar, si, mid - 1);
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = { 4, 5, 6, 7, 0, 1, 2 };
        int target = 0;// output 4
        int tarIdx = search(arr, target, 0, arr.length - 1);
        System.out.println(tarIdx);
    }
}
