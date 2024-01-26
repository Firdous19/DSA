package Arrays;

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
