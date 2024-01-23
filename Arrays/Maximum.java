package Arrays;

class Maximum {
    int largestElement(int arr[]) {
        // Initially declaring maximum as the least possible element
        int max = Integer.MIN_VALUE;

        // Traversing through the array to find the maximun value
        for (int i = 0; i < arr.length; i++) {
            max = arr[i] > max ? arr[i] : max;
        }
        return max;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 10, 4, 8 };
        // Creating instance to access the largestElement funtion
        Maximum max = new Maximum();

        int maxi = max.largestElement(arr);
        System.out.println(maxi);
    }
}