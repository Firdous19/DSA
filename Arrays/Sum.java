import java.util.Arrays;

class Sum {
    public int[] plusOne(int[] arr) {
        int n = arr.length - 1;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i] * (int) Math.pow(10, n);
            n--;
        }
        sum = sum + 1;

        String temp = Integer.toString(sum);
        int newArray[] = new int[temp.length()];

        System.out.println("The sum is: " + sum);

        for (int i = 0; i < temp.length(); i++) {
            newArray[i] = temp.charAt(i) - '0';
        }

        return newArray;
    }

    public static void main(String args[]) {
        int arr[] = { 9 };
        Sum plus = new Sum();

        arr = plus.plusOne(arr);

        System.out.println("The array after adding 1 is: " + Arrays.toString(arr));

    }
}