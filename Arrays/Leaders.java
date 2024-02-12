package Arrays;

// Leaders in an Array

// Problem Statement: Given an array, print all the elements which are leaders. A Leader is an element that is greater than all of the elements on its right side in the array.

// Example 1:
// Input:
//  arr = [4, 7, 1, 0]
// Output:
//  7 1 0
// Explanation:
//  Rightmost element is always a leader. 7 and 1 are greater than the elements in their right side.

// Example 2:
// Input:
//  arr = [10, 22, 12, 3, 0, 6]
// Output:
//  22 12 6
// Explanation:
//  6 is a leader. In addition to that, 12 is greater than all the elements in its right side (3, 0, 6), also 22 is greater than 12, 3, 0, 6.

import java.util.ArrayList;

public class Leaders {

    ArrayList<Integer> leaderArray(int arr[]) {
        ArrayList<Integer> list = new ArrayList<>();
        int n = arr.length - 1;
        int max = Integer.MIN_VALUE;

        for (int i = n; i >= 0; i--) {
            if (arr[i] > max) {
                list.addFirst(arr[i]);
                max = arr[i];
            }
        }

        return list;
    }

    public static void main(String[] args) {
        int arr[] = { 4, 7, 1, 0 };

        Leaders leader = new Leaders();
        ArrayList<Integer> leaders = leader.leaderArray(arr);

        System.out.println(leaders);
    }
}
