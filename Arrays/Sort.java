package Arrays;

import java.util.*;

public class Sort {

    void swap(int arr[], int ind1, int ind2) {
        int temp = arr[ind1];
        arr[ind1] = arr[ind2];
        arr[ind2] = temp;
    }

    void dutchNationalFlag(int arr[]) {

        int low = 0;
        int mid = 0;
        int high = arr.length - 1;

        while (mid < high) {
            if (arr[mid] == 0) {
                swap(arr, mid, low);
                mid++;
                low++;
            } else if (arr[mid] == 1)
                mid++;

            else {
                swap(arr, mid, high);
                high--;
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 1, 2, 2, 0, 1, 0, 0 };

        Sort sorting = new Sort();
        sorting.dutchNationalFlag(arr);

        System.out.println(Arrays.toString(arr));
    }
}
