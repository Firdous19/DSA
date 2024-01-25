package Arrays;

import java.util.HashMap;

public class LongestSubarray {

    int longestSubarrayWithSumK(int arr[], int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int longest = 0;
        int preSum = 0;

        for (int i = 0; i < arr.length; i++) {
            preSum = preSum + arr[i];
            int rem = preSum - k;
            if (map.containsKey(rem)) {
                int index = map.get(rem);
                longest = Math.max(longest, i - index);
            }

            if (preSum == k) {
                longest = Math.max(longest, i + 1);
            }
            if (!map.containsKey(preSum))
                map.put(preSum, i);
        }

        return longest;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 1, 1, 1, 1, 4, 2, 3 };

        LongestSubarray longest = new LongestSubarray();

        int length = longest.longestSubarrayWithSumK(arr, 3);
        System.out.println(length);

    }
}
