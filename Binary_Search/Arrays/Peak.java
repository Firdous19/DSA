package Binary_Search.Arrays;

// Problem Statement: Given an array of length N. Peak element is defined as the element greater than both of its neighbors. Formally, if ‘arr[i]’ is the peak element, ‘arr[i – 1]’ < ‘arr[i]’ and ‘arr[i + 1]’ < ‘arr[i]’. Find the index(0-based) of a peak element in the array. If there are multiple peak numbers, return the index of any peak number.

// Example 1:
// Input Format: arr[] = {1,2,3,4,5,6,7,8,5,1}
// Result: 7
// Explanation: In this example, there is only 1 peak that is at index 7.

// Example 2:
// Input Format: arr[] = {1,2,1,3,5,6,4}
// Result: 1
// Explanation: In this example, there are 2 peak numbers that are at indices 1 and 5. We can consider any of them.

// Example 3:
// Input Format: arr[] = {1, 2, 3, 4, 5}
// Result: 4
// Explanation: In this example, there is only 1 peak that is at the index 4.

// Example 4:
// Input Format: arr[] = {5, 4, 3, 2, 1}
// Result: 0
// Explanation: In this example, there is only 1 peak that is at the index 0.

public class Peak {

    int peakElement(int arr[]) {
        int n = arr.length;
        if (n == 1)
            return 0;

        if (arr[0] > arr[1])
            return 0;

        if (arr[n - 2] < arr[n - 1])
            return arr.length - 1;

        int low = 1;
        int high = arr.length - 2;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid - 1] < arr[mid] && arr[mid] > arr[mid + 1])
                return mid;

            else if (arr[mid - 1] <= arr[mid])
                low = mid + 1;
            else
                high = mid - 1;
        }

        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 5, 4, 3, 2, 1 };

        Peak peak = new Peak();
        int index = peak.peakElement(arr);

        System.out.println(index);
    }
}
