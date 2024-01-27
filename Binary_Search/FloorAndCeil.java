package Binary_Search;

// You’re given an sorted array arr of n integers and an integer x. Find the floor and ceiling of x in arr[0..n-1].
// The floor of x is the largest element in the array which is smaller than or equal to x.
// The ceiling of x is the smallest element in the array greater than or equal to x.

// Example 1:
// Input Format: n = 6, arr[] ={3, 4, 4, 7, 8, 10}, x= 5
// Result: 4 7
// Explanation: The floor of 5 in the array is 4, and the ceiling of 5 in the array is 7.

// Example 2:
// Input Format: n = 6, arr[] ={3, 4, 4, 7, 8, 10}, x= 8
// Result: 8 8
// Explanation: The floor of 8 in the array is 8, and the ceiling of 8 in the array is also 8.

import java.util.Arrays;

public class FloorAndCeil {

    int[] floorAndCeil(int arr[], int target) {
        int low = 0;
        int high = arr.length - 1;
        int floor = -1, ceil = -1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] >= target) {
                ceil = mid;
                high = mid - 1;
            } else {
                floor = mid;
                low = mid + 1;
            }
        }

        return new int[] { floor, ceil };
    }

    public static void main(String[] args) {
        int arr[] = { 10, 20, 30, 40, 50 };
        int target = 25;

        FloorAndCeil items = new FloorAndCeil();
        int index[] = items.floorAndCeil(arr, target);

        System.out.println(Arrays.toString(index));
    }
}
