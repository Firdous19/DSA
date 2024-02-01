package Binary_Search.Answers;

public class Bouquet {

    int isPossible(int arr[], int day, int m, int k) {
        int count = 0;
        int bouquet = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= day) {
                count++;
            } else {
                bouquet += count / k;
                count = 0;
            }
        }
        bouquet += count / k;

        if (bouquet >= m)
            return 1;
        else
            return 0;
    }

    int minimum(int arr[], int m, int k) {
        int low = Integer.MAX_VALUE;
        int high = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > high)
                high = arr[i];
            if (arr[i] < low)
                low = arr[i];
        }
        int ans = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (isPossible(arr, mid, m, k) == 1) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int arr[] = { 7, 7, 7, 7, 13, 11, 12, 7 };
        int m = 2;
        int k = 3;

        Bouquet bouquet = new Bouquet();
        int minimum = bouquet.minimum(arr, m, k);

        System.out.println(minimum);
    }
}