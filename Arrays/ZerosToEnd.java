package Arrays;

import java.util.Arrays;

// You are given an array of integers, your task is to move all the zeros in the array to the end of the array and move non-negative integers to the front by maintaining their order.

// Example:
// Input: 1 ,0 ,2 ,3 ,0 ,4 ,0 ,1
// Output: 1 ,2 ,3 ,4 ,1 ,0 ,0 ,0
// Explanation: All the zeros are moved to the end and non-negative integers are moved to front by maintaining order

public class ZerosToEnd {

    void moveZerosToEnd(int arr[]) {
        int j = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                j = i;
                break;
            }
        }

        for (int i = j + 1; i < arr.length; i++) {
            if (arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j++] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 0, 2, 3, 0, 4, 0, 1 };

        // Creating instance to access non static functions
        ZerosToEnd move = new ZerosToEnd();

        // movin zeros to end
        move.moveZerosToEnd(arr);

        // printing the arrays using Arrays class
        System.out.println(Arrays.toString(arr));

    }

}