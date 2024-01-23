package Arrays;

// Remove Duplicates in-place from Sorted Array Problem Statement:Given an integer array sorted in non-decreasing order,remove the duplicates in place such that each unique element appears only once.The relative order of the elements should be kept the same.

// If there are k elements after removing the duplicates,then the first k elements of the array should hold the final result.It does not matter what you leave beyond the first k elements.

// Note:Return k after placing the final result in the first k slots of the array.

// Input: arr[1,1,2,2,2,3,3]

// Output: arr[1,2,3,_,_,_,_]

// Explanation: Total number of unique elements are 3, i.e[1,2,3] and Therefore return 3 after assigning [1,2,3] in the beginning of the array.

public class Duplicates {

    int removeDuplicated(int arr[]) {
        int index = 0;

        for (int i = 1; i < arr.length; i++) {
            if (arr[index] != arr[i]) {
                arr[++index] = arr[i];
            }
        }

        return index + 1;
    }

    public static void main(String[] args) {

        int arr[] = { 1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3, 4 };

        //creating instance to access the non static functions
        Duplicates dip = new Duplicates();
        
        int index = dip.removeDuplicated(arr);
        System.out.println(index);

        // if you wish to print the array
        for (int i = 0; i < index; i++)
            System.out.print(arr[i] + " ");
    }

}
