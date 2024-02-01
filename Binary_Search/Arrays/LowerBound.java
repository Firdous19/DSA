package Binary_Search.Arrays;

// Example 1:
// Input Format: N = 4, arr[] = {1,2,2,3}, x = 2
// Result: 1
// Explanation: Index 1 is the smallest index such that arr[1] >= x.

// Example 2:
// Input Format: N = 5, arr[] = {3,5,8,15,19}, x = 9
// Result: 3
// Explanation: Index 3 is the smallest index such that arr[3] >= x.

public class LowerBound {

    int lowerBound(int arr[], int target) {
        int low = 0;
        int high = arr.length - 1;
        int index = arr.length;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] >= target) {
                index = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return index;
    }

    public static void main(String args[]) {
        int arr[] = { 3, 5, 8, 15, 19, 19, 19 };
        int target = 19;

        LowerBound lower = new LowerBound();
        int index = lower.lowerBound(arr, target);

        System.out.println(index);
    }
}
