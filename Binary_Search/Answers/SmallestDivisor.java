package Binary_Search.Answers;

// ## Find the Smallest Divisor Given a Threshold

// Problem Statement: You are given an array of integers ‘arr’ and an integer i.e. a threshold value ‘limit’. Your task is to find the smallest positive integer divisor, such that upon dividing all the elements of the given array by it, the sum of the division’s result is less than or equal to the given threshold value.

// Example 1:
// Input Format: N = 5, arr[] = {1,2,3,4,5}, limit = 8
// Result: 3
// Explanation: We can get a sum of 15(1 + 2 + 3 + 4 + 5) if we choose 1 as a divisor. 
// The sum is 9(1 + 1 + 2 + 2 + 3)  if we choose 2 as a divisor. Upon dividing all the elements of the array by 3, we get 1,1,1,2,2 respectively. Now, their sum is equal to 7 <= 8 i.e. the threshold value. So, 3 is the minimum possible answer.

// Example 2:
// Input Format: N = 4, arr[] = {8,4,2,3}, limit = 10
// Result: 2
// Explanation: If we choose 1, we get 17 as the sum. If we choose 2, we get 9(4+2+1+2) <= 10 as the answer. So, 2 is the answer.

public class SmallestDivisor {

    int isPossible(int arr[], int num, int limit) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += (int) (Math.ceil((double) arr[i] / num));
        }
        if (sum <= limit)
            return 1;
        else
            return 0;
    }

    int smallestDivisor(int arr[], int limit) {
        int low = 1;
        int high = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > high)
                high = arr[i];
        }
        
        while (low <= high) {
            int mid = (low + high) / 2;
            if (isPossible(arr, mid, limit) == 1) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }

    public static void main(String[] args) {
        int arr[] = { 44, 22, 33, 11, 1 };
        int limit = 5;

        SmallestDivisor divisor = new SmallestDivisor();
        int divi = divisor.smallestDivisor(arr, limit);

        System.out.println(divi);
    }
}
