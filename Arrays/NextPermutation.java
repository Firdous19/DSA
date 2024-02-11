package Arrays;

import java.util.Arrays;

public class NextPermutation {

    void reverse(int arr[], int left, int right) {
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }

    void nextPermutation(int arr[]) {

        int index = -1;
        int n = arr.length - 1;

        for (int i = n; i > 0; i--) {
            if (arr[i - 1] < arr[i]) {
                index = i - 1;
                break;
            }
        }

        if (index == -1) {
            reverse(arr, 0, n);
        } else {
            for (int i = n; i > index; i--) {
                if (arr[i] > arr[index]) {
                    int temp = arr[index];
                    arr[index] = arr[i];
                    arr[i] = temp;
                    break;
                }
            }
        }
        reverse(arr, index + 1, n);
    }

    public static void main(String args[]) {
        int arr[] = { 0, 1, 2, 5, 3, 3, 0 };

        NextPermutation next = new NextPermutation();
        next.nextPermutation(arr);

        System.out.println(Arrays.toString(arr));

    }

}
