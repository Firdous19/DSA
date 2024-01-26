package Arrays;

import java.util.*;

public class RepeatingAndMissing {

    int[] repeatingAndMissing(int arr[]) {
        // HashMap<Integer, Integer> map = new HashMap<>();
        // int repeating = -1;

        // int num = 0, xor = 0;
        // for (int i = 0; i < n; i++) {
        // map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);

        // num = num ^ (i + 1);

        // if (map.get(arr[i]) == 2) {
        // repeating = arr[i];
        // continue;
        // }
        // xor = xor ^ arr[i];
        // }
        // return new int[] { xor ^ num, repeating };

        int n = arr.length;
        int sn = (n * (n + 1)) / 2;
        int s2n = (n * (n + 1) * (2 * n + 1)) / 6;

        int s = 0, s2 = 0;

        for (int i = 0; i < n; i++) {
            s += arr[i];
            s2 += arr[i] * arr[i];
        }

        int val1 = s - sn;
        int val2 = s2 - s2n;
        val2 = val2 / val1;

        int x = (val1 + val2) / 2;
        int y = x - val1;

        return new int[] { x, y };
    }

    public static void main(String[] args) {
        int arr[] = { 3, 1, 2, 5, 4, 6, 7, 5 };
        int num[] = new RepeatingAndMissing().repeatingAndMissing(arr);
        System.out.println(Arrays.toString(num));
    }
}
