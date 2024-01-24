package Arrays;

// Given an integer N and an array of size N-1 containing N-1 numbers between 1 to N. Find the number(between 1 to N), that is not present in the given array.

// Example 1:
// Input Format: N = 5, array[] = {1,2,4,5}
// Result: 3
// Explanation: In the given array, number 3 is missing. So, 3 is the answer.

// Example 2:
// Input Format: N = 3, array[] = {1,3}
// Result: 2
// Explanation: In the given array, number 2 is missing. So, 2 is the answer.

import java.util.Arrays;

public class MissingNumber {
    int missingNumber(int arr[], int n) {

        int xor1 = 0, xor2 = 0;
        int j = arr[0];

        for (int i = 0; i < n - 1; i++) {
            xor2 = xor2 ^ arr[i];
            xor1 = xor1 ^ j;
            j++;
        }
        xor1 = xor1 ^ j;

        return xor1 ^ xor2;

    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 5 };
        int N = 5;

        MissingNumber missNum = new MissingNumber();

        int number = missNum.missingNumber(arr, N);
        System.out.println(number);
    }
}
