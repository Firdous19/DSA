package Binary_Search.Answers;

import java.util.Arrays;

public class AggressiveCows {

    boolean canBePlaced(int arr[], int cows) {
        int lastCow = arr[0];
        int min = 1;
        int noOfCows = 1;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] - lastCow >= min) {
                noOfCows++;
                lastCow = arr[i];
            }
            if (noOfCows >= cows)
                return true;
        }
        return false;
    }

    int maxCows(int arr[], int cows) {
        Arrays.sort(arr);
        int max = arr[arr.length - 1];
        int min = arr[0];
        for (int i = 1; i < max - min; i++) {
            
        }
    }

}
