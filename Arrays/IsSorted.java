package Arrays;

// Check if an Array is Sorted
// Problem Statement: Given an array of size n, write a program to check if the given array is sorted in (ascending / Increasing / Non-decreasing) order or not. If the array is sorted then return True, Else return False.

public class IsSorted {
    boolean isSorted(int arr[]) {

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] < arr[i + 1])
                continue;
            return false;
        }

        return true;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 99, 5, 6 };
        IsSorted sort = new IsSorted();
        boolean isSort = sort.isSorted(arr);
        System.out.println(isSort);
    }
}
