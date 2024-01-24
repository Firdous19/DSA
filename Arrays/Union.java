package Arrays;

// Given two sorted arrays, arr1, and arr2 of size n and m. Find the union of two sorted arrays.

// The union of two arrays can be defined as the common and distinct elements in the two arrays.NOTE: Elements in the union should be in ascending order.

// Example 1:
// Input:
// n = 5,m = 5.
// arr1[] = {1,2,3,4,5}  
// arr2[] = {2,3,4,4,5}
// Output:
//  {1,2,3,4,5}

// Explanation: 
// Common Elements in arr1 and arr2  are:  2,3,4,5
// Distnict Elements in arr1 are : 1
// Distnict Elemennts in arr2 are : No distinct elements.
// Union of arr1 and arr2 is {1,2,3,4,5} 

// Example 2:
// Input:
// n = 10,m = 7.
// arr1[] = {1,2,3,4,5,6,7,8,9,10}
// arr2[] = {2,3,4,4,5,11,12}
// Output: {1,2,3,4,5,6,7,8,9,10,11,12}
// Explanation: 
// Common Elements in arr1 and arr2  are:  2,3,4,5
// Distnict Elements in arr1 are : 1,6,7,8,9,10
// Distnict Elemennts in arr2 are : 11,12
// Union of arr1 and arr2 is {1,2,3,4,5,6,7,8,9,10,11,12}

import java.util.ArrayList;

public class Union {

    ArrayList<Integer> unionArray(int arr[], int arr1[]) {
        ArrayList<Integer> unionList = new ArrayList<>();

        int i = 0, j = 0;
        int n1 = arr.length, n2 = arr1.length;

        while (i < n1 && j < n2) {
            if (arr[i] < arr1[j]) {
                if (!unionList.contains(arr[i]))
                    unionList.add(arr[i]);
                i++;

            } else if (arr1[j] < arr[i]) {
                if (!unionList.contains(arr1[j]))
                    unionList.add(arr1[j]);
                j++;
            } else {
                if (!unionList.contains(arr[i]))
                    unionList.add(arr[i]);
                i++;
                j++;
            }
        }

        while (i < n1) {
            if (!unionList.contains(arr[i]))
                unionList.add(arr[i]);
            i++;
        }

        while (j < n2) {
            if (!unionList.contains(arr1[j]))
                unionList.add(arr1[j]);
            j++;
        }

        return unionList;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int arr1[] = { 2, 3, 4, 4, 5, 11, 12 };

        Union union = new Union();

        ArrayList<Integer> unionList = union.unionArray(arr, arr1);

        // printing
        System.out.println(unionList);
    }
}
