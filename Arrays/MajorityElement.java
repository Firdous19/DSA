package Arrays;

// Given an array of N integers,write a program to return an element that occurs more than N/2 times in the given array.You may consider that such an element always exists in the array.

// Example:
// Input Format:N=3,nums[]={3,2,3}
// Result:3 Explanation:When we just count the occurrences of each number and compare with half of the size of the array,you will get 3 for the above solution.

import java.util.*;

public class MajorityElement {

    int majorityElement(int arr[]) {

        // Using HashMap
        // HashMap<Integer, Integer> map = new HashMap<>();
        // int max = 0;

        // for (int i = 0; i < arr.length; i++) {
        // map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        // if (map.get(arr[i]) > (arr.length / 2))
        // max = arr[i];
        // }
        // return max;

        // using Moore's voting algorithm
        int count = 1, ele = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == ele) {
                count++;
            } else if (arr[i] != ele) {
                count--;
            }

            if (count == 0) {
                ele = arr[i];
                count = 1;
            }
        }

        count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (ele == arr[i]) {
                count++;
            }
        }

        return count > (arr.length / 2) ? ele : -1;
    }

    public static void main(String[] args) {
        int arr[] = { 3, 1, 2, 3, 3, 1, 3 };

        MajorityElement maj = new MajorityElement();

        int majority = maj.majorityElement(arr);
        System.out.println(majority);

    }
}
