package Arrays;

import java.util.Arrays;

// Problem Statement: Given an array of integers, rotating array of elements by k elements either left or right.
// Example 1:
// Input: N = 7, array[] = {1,2,3,4,5,6,7} , k=2 , right
// Output: 6 7 1 2 3 4 5
// Explanation: array is rotated to right by 2 position .

// Example 2:
// Input: N = 6, array[] = {3,7,8,9,10,11} , k=3 , left 
// Output: 9 10 11 3 7 8
// Explanation: Array is rotated to right by 3 position.

public class LeftRotate {

    void reverse(int arr[], int left, int right) {
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }

    void leftRotate(int arr[], int k) {
        reverse(arr, 0, k - 1);
        reverse(arr, k, arr.length - 1);
        reverse(arr, 0, arr.length - 1);
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6 };
        int k = 4;// to Rotate the array by 4 places

        // creating instatnce to access non staatic functions
        LeftRotate lfrot = new LeftRotate();
        lfrot.leftRotate(arr, k);

        // printing the array
        System.out.println(Arrays.toString(arr));
    }

}
