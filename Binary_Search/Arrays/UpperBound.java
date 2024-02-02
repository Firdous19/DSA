package Binary_Search.Arrays;

// Example 1:
// Input Format: N = 4, arr[] = {1,2,2,3}, x = 2
// Result: 3
// Explanation: Index 3 is the smallest index such that arr[3] > x.

// Example 2:
// Input Format: N = 6, arr[] = {3,5,8,9,15,19}, x = 9
// Result: 4
// Explanation: Index 4 is the smallest index such that arr[4] > x.

public class UpperBound {

    int upperBound(int arr[], int target) {
        int low = 0;
        int high = arr.length - 1;
        int index = arr.length;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] > target) {
                index = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return index;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 2, 3 };
        int target = 2;

        UpperBound upper = new UpperBound();
        int index = upper.upperBound(arr, target);

        System.out.println(index);
    }
}
