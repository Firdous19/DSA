package Binary_Search.Arrays;

// Given a sorted array arr of n integers and a target value k. Write a program to find the indices of the first and the last occurrences of the target value. If the target is not found then return -1 as indices.

// Example 1:
// Input Format: n = 8, arr[] = {2, 4, 6, 8, 8, 8, 11, 13}, k = 8
// Result: 3 5
// Explanation: The first occurrence of 8 is at index 3 and the last occurrence is at index 5.

// Example 2:
// Input Format: n = 8, arr[] = {2, 4, 6, 8, 8, 8, 11, 13}, k = 10
// Result: -1 -1
// Explanation: The target value is not present in the array. So, we have returned -1 as the indices of the first and the last occurrence.

public class FirstOccurance {

    int firstOccurance(int arr[], int target) {
        int low = 0;
        int high = arr.length - 1;
        int firstIndex = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == target) {
                firstIndex = mid;
                high = mid - 1;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return firstIndex;
    }

    int lastOccurance(int arr[], int target) {
        int low = 0;
        int high = arr.length - 1;
        int lastIndex = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == target) {
                lastIndex = mid;
                low = mid + 1;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return lastIndex;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 4, 6, 8, 8, 8, 11, 13 };
        int target = 8;

        FirstOccurance occur = new FirstOccurance();
        int firstIndex = occur.firstOccurance(arr, target);
        int lastIndex = occur.lastOccurance(arr, target);

        System.out.println(firstIndex + " " + lastIndex);
    }
}
