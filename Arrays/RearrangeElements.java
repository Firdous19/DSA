package Arrays;

// Rearrange Array Elements by Sign

// There’s an array ‘A’ of size ‘N’ with an equal number of positive and negative elements. Without altering the relative order of positive and negative elements, you must return an array of alternately positive and negative values.

// Note: Start the array with positive elements.

// Example 1:

// Input:
// arr[] = {1,2,-4,-5}, N = 4
// Output:
// 1 -4 2 -5

// Explanation: 

// Positive elements = 1,2
// Negative elements = -4,-5
// To maintain relative ordering, 1 must occur before 2, and -4 must occur before -5.

// Example 2:
// Input:
// arr[] = {1,2,-3,-1,-2,-3}, N = 6
// Output:
// 1 -3 2 -1 3 -2
// Explanation: 

// Positive elements = 1,2,3
// Negative elements = -3,-1,-2
// To maintain relative ordering, 1 must occur before 2, and 2 must occur before 3.
// Also, -3 should come before -1, and -1 should come before -2.


import java.util.*;

public class RearrangeElements {

    void rearrangeElememts(int arr[]) {
        ArrayList<Integer> positive = new ArrayList<>();
        ArrayList<Integer> negetive = new ArrayList<>();

        for (int ele : arr) {
            if (ele >= 0) {
                positive.add(ele);
            } else {
                negetive.add(ele);
            }
        }

        int posIndex = 0, negIndex = 0;

        while (posIndex < positive.size() && negIndex < negetive.size()) {
            arr[2 * posIndex] = positive.get(posIndex);
            arr[2 * negIndex + 1] = negetive.get(negIndex);
            posIndex++;
            negIndex++;
        }

        while (posIndex < positive.size()) {
            arr[posIndex + negIndex] = positive.get(posIndex);
            posIndex++;
        }

        while (negIndex < negetive.size()) {
            arr[negIndex + posIndex] = negetive.get(negIndex);
            negIndex++;
        }

    }

    public static void main(String[] args) {
        int arr[] = { 3, 1, -2, -5, -9, 3, -5, 2 };
        RearrangeElements rearrange = new RearrangeElements();
        rearrange.rearrangeElememts(arr);

        System.out.println(Arrays.toString(arr));

    }
}
