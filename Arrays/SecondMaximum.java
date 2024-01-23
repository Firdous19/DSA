package Arrays;

public class SecondMaximum {
    int secondLargestElement(int arr[]) {
        // Initially declaring maximum as the least possible element
        int max = Integer.MIN_VALUE;
        int secMax = 0;

        // Traversing through the array to find the second maximun value
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                secMax = max;
                max = arr[i];
            }

            else if (arr[i] > secMax && arr[i] != max) {
                secMax = arr[i];
            }
        }

        return secMax;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 10, 77, 4, 8, 99 };
        // Creating instance to access the secondLargestElement funtion
        SecondMaximum secMax = new SecondMaximum();

        int secmaxi = secMax.secondLargestElement(arr);
        System.out.println(secmaxi);
    }
}
