package Arrays;

// Given an array, and an element num the task is to find if num is present in the given array or not. If present print the index of the element or print -1.

public class LinearSearch {

    int isPresent(int arr[], int ele) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == ele)
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6 };
        int element = 9;

        LinearSearch search = new LinearSearch();

        int index = search.isPresent(arr, element);

        if (index > -1)
            System.out.println("Present at index " + index);
        else
            System.out.println("Not Present");
    }

}
