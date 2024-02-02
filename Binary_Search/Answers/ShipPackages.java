package Binary_Search.Answers;

public class ShipPackages {

    int noOfDays(int arr[], int cap) {
        int days = 1, sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (sum > cap) {
                days++;
                sum = arr[i];
            }
        }
        return days;
    }

    int[] totalSumAndMaximum(int arr[]) {
        int sum = 0, max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max)
                max = arr[i];
            sum += arr[i];
        }
        return new int[] { sum, max };
    }

    int minimumCapacity(int arr[], int days) {
        int low = totalSumAndMaximum(arr)[1];
        int high = totalSumAndMaximum(arr)[0];

        while (low <= high) {
            int mid = (low + high) / 2;
            if (noOfDays(arr, mid) <= days) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }

    public static void main(String[] args) {
        int arr[] = { 5, 4, 5, 2, 3, 4, 5, 6 };
        int days = 5;

        ShipPackages ship = new ShipPackages();
        int capacity = ship.minimumCapacity(arr, days);

        System.out.println(capacity);
    }
}
