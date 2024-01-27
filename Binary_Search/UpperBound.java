package Binary_Search;

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
