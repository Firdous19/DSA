package Arrays;

//Given a non-empty array of integers arr, every element appears twice except for one. Find that single one.

// Example 1:
// Input Format: arr[] = {2,2,1}
// Result: 1
// Explanation: In this array, only the element 1 appear once and so it is the answer.

// Example 2:
// Input Format: arr[] = {4,1,2,1,2}
// Result: 4
// Explanation: In this array, only element 4 appear once and the other elements appear twice. So, 4 is the answer.

import java.util.HashMap;

public class AppearOnes {

    // Using XOR
    int appearOnes(int arr[]) {
        int XOR = 0;
        for (int ele : arr) {
            XOR = XOR ^ ele;
        }
        return XOR == 0 ? -1 : XOR;
    }

    // Using Hashmap
    // int appearOnes(int arr[]) {
    // HashMap<Integer, Integer> map = new HashMap<>();

    // for (int i = 0; i < arr.length; i++) {
    // map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
    // }

    // for (int key : map.keySet()) {
    // if (map.get(key) == 1)
    // return key;
    // }

    // return -1;
    // }

    public static void main(String[] args) {
        int arr[] = { 1, 1, 2, 3, 3, 4, 4 };

        AppearOnes ones = new AppearOnes();
        int ele = ones.appearOnes(arr);

        if (ele != -1) {
            System.out.println(ele);
        } else {
            System.out.println("Not present");
        }
    }
}
