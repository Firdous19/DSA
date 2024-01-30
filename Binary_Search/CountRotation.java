package Binary_Search;

public class CountRotation {

    int countRotation(int arr[]) {
        int low = 0;
        int high = arr.length - 1;
        int min = Integer.MAX_VALUE;
        int index = -1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[low] <= arr[mid]) {
                if (arr[low] < min) {
                    index = low;
                    min = arr[low];
                }
                low = mid + 1;
            } else if (arr[mid] <= arr[high]) {
                if (arr[mid] < min) {
                    index = mid;
                    min = arr[mid];
                }
                high = mid - 1;
            }
        }

        return index;
    }

    public static void main(String[] args) {
        int arr[] = { 3, 3, 1, 2, 2 };

        CountRotation rotation = new CountRotation();
        int count = rotation.countRotation(arr);

        System.out.println(count);
    }
}
