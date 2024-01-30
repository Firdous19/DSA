package Binary_Search;

public class RotatedSearchII {

    int searchInRotatedArray(int arr[], int target) {
        int n = arr.length;

        int low = 0;
        int high = n - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == target)
                return mid;
            else if (arr[low] == arr[mid] && arr[mid] == arr[high]) {
                low++;
                high--;
            } else if (arr[mid] <= arr[high]) {
                if (arr[mid] <= target && target <= arr[high]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            } else {
                if (arr[low] <= arr[mid]) {
                    if (arr[low] <= target && target <= arr[mid]) {
                        high = mid - 1;
                    } else {
                        low = mid + 1;
                    }
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 1, 1, 1, 1, 0, 1, 1, 1 };
        int target = 0;

        RotatedSearchII search = new RotatedSearchII();
        int index = search.searchInRotatedArray(arr, target);

        System.out.println(index);
    }
}
