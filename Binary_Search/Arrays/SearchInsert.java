package Binary_Search.Arrays;

// You are given a sorted array arr of distinct values and a target value x. You need to search for the index of the target value in the array.

// If the value is present in the array, then return its index. Otherwise, determine the index where it would be inserted in the array while maintaining the sorted order.

// Example 1:
// Input Format: arr[] = {1,2,4,7}, x = 6
// Result: 3
// Explanation: 6 is not present in the array. So, if we will insert 6 in the 3rd index(0-based indexing), the array will still be sorted. {1,2,4,6,7}.

// Example 2:
// Input Format: arr[] = {1,2,4,7}, x = 2
// Result: 1
// Explanation: 2 is present in the array and so we will return its index i.e. 1.

public class SearchInsert {

    int searchInsert(int[] arr, int target) {
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

    public static void main(String rags[]) {
        int arr[] = { 1, 2, 4, 7 };
        int target = 2;

        SearchInsert search = new SearchInsert();
        int index = search.searchInsert(arr, target);

        System.out.println(index);
    }
}
