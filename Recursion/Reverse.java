package Recursion;

import java.util.Arrays;
import java.util.Collections;

public class Reverse {

    void reverseArray(Integer arr[], int i, int n) {
        if (i >= n / 2) {
            return;
        }
        Collections.swap(Arrays.asList(arr), i, n - 1 - i);
        reverseArray(arr, i + 1, n);
    }

    public static void main(String args[]) {
        Integer arr[] = { 1, 2, 3, 4, 5, 6 };
        Reverse rev = new Reverse();
        rev.reverseArray(arr, 0, arr.length);
        System.out.println(Arrays.toString(arr));

        // Integer arr1[] = { 5, 4, 3, 2, 1 };
        // Collections.reverse(Arrays.asList(arr1));
        // System.out.println(Arrays.toString(arr1));
    }
}
