package Binary_Search.Arrays;

public class MinimumRotated {

    int maximumInRotatedSortedArray(int arr[]) {
        int low = 0;
        int high = arr.length - 1;
        int min = Integer.MAX_VALUE;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[low] <= arr[mid]) {
                min = Math.min(arr[low], min);
                low = mid + 1;
            } else {
                min = Math.min(arr[mid], min);
                high = mid - 1;
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int arr[] = { 4, 5, 6, 7, 0, 1, 2 };

        MinimumRotated minimum = new MinimumRotated();
        int index = minimum.maximumInRotatedSortedArray(arr);

        System.out.println(index);
    }
}
