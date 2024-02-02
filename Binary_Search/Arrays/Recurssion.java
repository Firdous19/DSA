package Binary_Search.Arrays;

public class Recurssion {

    int recursiveBinarySearch(int arr[], int low, int high, int target) {
        if (low > high)
            return -1;
        int mid = (low + high) / 2;
        if (arr[mid] == target)
            return mid;
        else if (target > arr[mid])
            return recursiveBinarySearch(arr, mid + 1, high, target);
        else
            return recursiveBinarySearch(arr, low, mid - 1, target);

    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6 };
        int targer = 4;

        Recurssion rec = new Recurssion();
        int found = rec.recursiveBinarySearch(arr, 0, arr.length - 1, targer);

        System.out.println(found);
    }
}
