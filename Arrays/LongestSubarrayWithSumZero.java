package Arrays;

import java.util.HashMap;

public class LongestSubarrayWithSumZero {

    int longestSubarrayWithSumZero(int arr[]) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int longest = 0, preSum = 0;

        for (int i = 0; i < arr.length; i++) {
            preSum += arr[i];
            if (preSum == 0) {
                longest = Math.max(longest, i + 1);
            }

            int rem = -1 * preSum;
            if (map.containsKey(rem)) {
                int index = map.get(rem);
                longest = Math.max(longest, i - index);
            }
            if (!map.containsKey(preSum))
                map.put(preSum, i);
        }
        return longest;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 0, -1, 1 };

        LongestSubarrayWithSumZero zero = new LongestSubarrayWithSumZero();

        int longest = zero.longestSubarrayWithSumZero(arr);
        System.out.println(longest);
    }
}
