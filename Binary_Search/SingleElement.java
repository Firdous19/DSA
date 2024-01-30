package Binary_Search;

import java.util.HashMap;

public class SingleElement {
    int singleElement(int arr[]) {
        if (arr[0] != arr[1]) {
            return arr[0];
        }
        if (arr[arr.length - 1] != arr[arr.length - 2]) {
            return arr[arr.length - 1];
        }

        int low = 1;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] != arr[mid - 1] && arr[mid] != arr[mid + 1]) {
                return arr[mid];
            }

            else if (mid % 2 == 1 && arr[mid - 1] == arr[mid] || mid % 2 == 0 && arr[mid] == arr[mid + 1]) {
                low = mid + 1;
            }

            else {
                high = mid - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 1, 2, 3, 3 };

        SingleElement single = new SingleElement();
        int element = single.singleElement(arr);

        System.out.println(element);
    }
}
