package Arrays;

// Two Sum : Check if a pair with given sum exists in Array

// Example 1:
// Input Format: N = 5, arr[] = {2,6,5,8,11}, target = 14
// Result: YES (for 1st variant)
//        [1, 3] (for 2nd variant)
// Explanation: arr[1] + arr[3] = 14. So, the answer is “YES” for the first variant and [1, 3] for 2nd variant.

// Example 2:
// Input Format: N = 5, arr[] = {2,6,5,8,11}, target = 15
// Result: NO (for 1st variant)
// 	[-1, -1] (for 2nd variant)
// Explanation: There exist no such two numbers whose sum is equal to the target.

import java.util.*;

public class TwoSum {

    List<Integer> twoSum(int arr[], int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int rem = target - arr[i];
            if (map.containsKey(rem)) {
                return Arrays.asList(rem, arr[i]);
            }
            map.put(arr[i], i);
        }

        return Arrays.asList(-1, -1);
    }

    public static void main(String[] args) {
        int arr[] = { 3, 5, 2, -4, 8, 11 };
        int target = 7;

        // Creating Instance
        TwoSum sum = new TwoSum();

        List<Integer> list = sum.twoSum(arr, target);

        System.out.println(list);
    }
}
