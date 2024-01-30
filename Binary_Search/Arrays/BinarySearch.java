package Binary_Search.Arrays;

public class BinarySearch {

    int binarySearch(int arr[], int target) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (target > arr[mid]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return -1;
    }

    public static void main(String args[]) {
        int arr[] = { 2, 4, 6, 8, 10, 12 };
        int target = 1;

        BinarySearch search = new BinarySearch();
        int index = search.binarySearch(arr, target);

        System.out.println(index);
    }
}
