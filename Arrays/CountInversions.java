package Arrays;

// Given an array of N integers, count the inversion of the array (using merge-sort).

// What is an inversion of an array? Definition: for all i & j < size of array, if i < j then you have to find pair (A[i],A[j]) such that A[j] < A[i].

// Example:
// Input Format: N = 5, array[] = {5,3,2,1,4}
// Result: 7
// Explanation: There are 7 pairs (5,1), (5,3), (5,2), (5,4),(3,2), (3,1), (2,1) and we have left 2 pairs (2,4) and (1,4) as both are not satisfy our condition. 

import java.util.*;

public class CountInversions {

    int merge(int arr[], int low, int mid, int high) {

        ArrayList<Integer> array = new ArrayList<>();
        int left = low;
        int right = mid + 1;
        int count = 0;
        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right]) {
                array.add(arr[left++]);
            } else {
                count += mid - left + 1;
                array.add(arr[right++]);
            }
        }

        while (left <= mid) {
            array.add(arr[left++]);
        }

        while (right <= high) {
            array.add(arr[right++]);
        }

        for (int i = low; i <= high; i++) {
            arr[i] = array.get(i - low);
        }

        return count;

    }

    int mergeSort(int arr[], int low, int high) {
        int count = 0;
        if (low < high) {
            int mid = (low + high) / 2;
            count += mergeSort(arr, low, mid);
            count += mergeSort(arr, mid + 1, high);
            count += merge(arr, low, mid, high);
        }
        return count;
    }

    int countInversions(int arr[]) {
        return (mergeSort(arr, 0, arr.length - 1));
    }

    public static void main(String[] args) {
        int arr[] = { 5, 3, 2, 1, 4 };

        CountInversions count = new CountInversions();

        int noOfCounts = count.countInversions(arr);

        System.out.println(noOfCounts);
    }
}
