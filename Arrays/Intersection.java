package Arrays;

// Given two sorted arrays, arr1, and arr2 of size n and m. Find the intersection of two sorted arrays.

// The intersection of two arrays can be defined as the common elements in the two arrays.NOTE: Elements in the intersection array should be in ascending order.

// Example:
// Input:
// n = 5,m = 5.
// arr1[] = {1,2,3,4,5}  
// arr2[] = {2,3,4,4,5}
// Output:
//  {2,3,4,5}

// Explanation: 
// Common Elements in arr1 and arr2  are:  2,3,4,5
// Intersection of arr1 and arr2 is {2,3,4,5} 

import java.util.ArrayList;

public class Intersection {
    ArrayList<Integer> intersectionArray(int arr[], int arr1[]) {
        ArrayList<Integer> intersectionList = new ArrayList<>();

        int i = 0, j = 0;
        int n1 = arr.length, n2 = arr1.length;

        while (i < n1 && j < n2) {
            if (arr[i] < arr1[j]) {
                i++;

            } else if (arr1[j] < arr[i]) {
                j++;
            } else {
                if (!intersectionList.contains(arr[i]))
                    intersectionList.add(arr[i]);
                i++;
                j++;
            }
        }

        return intersectionList;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 2, 3, 3, 4, 5, 6 };
        int arr1[] = { 2, 3, 3, 5, 6, 6, 7 };

        Intersection intersect = new Intersection();

        ArrayList<Integer> intersectionArray = intersect.intersectionArray(arr, arr1);

        // printing
        System.out.println(intersectionArray);
    }
}
