package Binary_Search.Answers;

public class SquareRoot {

    int squareRoot(int num) {
        int low = 1;
        int high = num;
        // int ans = 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (mid * mid <= num) {
                // ans = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return high;
    }

    public static void main(String[] args) {
        int number = 487;

        SquareRoot sqrt = new SquareRoot();
        int root = sqrt.squareRoot(number);

        System.out.println(root);
    }
}
