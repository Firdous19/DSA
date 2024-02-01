package Binary_Search.Answers;

public class MissingNumber {

    int findKthPositive(int arr[], int k) {

        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            int noOfMissingNum = arr[mid] - (mid + 1);
            if (k > noOfMissingNum) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return low + k;
    }

    public static void main(String[] args) {
        int arr[] = { 4, 7, 9, 10 };
        int k = 4;

        MissingNumber missing = new MissingNumber();
        int num = missing.findKthPositive(arr, k);

        System.out.println(num);
    }
}
