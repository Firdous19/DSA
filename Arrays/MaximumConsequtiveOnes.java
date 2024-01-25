package Arrays;

// Given an array that contains only 1 and 0 return the count of maximum consecutive ones in the array.
// Example 1:

// Input: prices = {1, 1, 0, 1, 1, 1}

// Output: 3

// Explanation: There are two consecutive 1’s and three consecutive 1’s in the array out of which maximum is 3.

// Input: prices = {1, 0, 1, 1, 0, 1} 

// Output: 2

// Explanation: There are two consecutive 1's in the array. 

public class MaximumConsequtiveOnes {

    int maximumConsequtiveOnes(int arr[]) {
        int count = 0, max = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1)
                count++;
            else {
                max = count > max ? count : max;
                count = 0;
            }
        }
        return count > max ? count : max;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 2, 3, 1, 1, 4, 5, 1, 1 };

        //creating instances to access the non static functions
        MaximumConsequtiveOnes max = new MaximumConsequtiveOnes();

        //getting the maximum no of consequtive ones
        int maxCount = max.maximumConsequtiveOnes(arr);

        //printing the maximum consequtive ones
        System.out.println(maxCount);
    }
}
