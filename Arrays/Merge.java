package Arrays;

// Given two sorted arrays arr1[] and arr2[] of sizes n and m in non-decreasing order. Merge them in sorted order. Modify arr1 so that it contains the first N elements and modify arr2 so that it contains the last M elements.

//merging without extra space using gap method

import java.util.Arrays;

public class Merge {

    void swap(int arr[], int i, int arr1[], int j) {
        if (arr[i] > arr1[j]) {
            int temp = arr[i];
            arr[i] = arr1[j];
            arr1[j] = temp;
        }
    }

    void mergeSortedArray(int arr[], int arr1[]) {
        int n = arr.length;
        int m = arr1.length;
        int len = n + m;

        int gap = (len / 2) + (len % 2);

        while (gap > 0) {
            int left = 0;
            int right = left + gap;

            while (right < len) {
                if (left >= n) {
                    swap(arr1, left - n, arr1, right - n);
                } else if (left < n && right >= n) {
                    swap(arr, left, arr1, right - n);
                } else {
                    swap(arr, left, arr, right);
                }
                left++;
                right++;
            }
            if (gap == 1)
                break;
            gap = (gap / 2) + (gap % 2);
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 3, 5, 7 };
        int arr1[] = { 0, 2, 6, 8, 9 };

        Merge merge = new Merge();

        merge.mergeSortedArray(arr, arr1);

        System.out.println(Arrays.toString(arr).concat(Arrays.toString(arr1)));
    }
}
