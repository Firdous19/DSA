package Binary_Search.Arrays;

public class SquareRoot {

    int squareRoot(int num) {
        int low = 0;
        int high = num;
        int index = -1;

        while (low <= high) {
            int mid = (low + high) / 2;
            int square = mid * mid;

            if (square == num) {
                return mid;
            } else if (square > num) {
                high = mid - 1;
            } else {
                index = mid;
                low = mid + 1;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        int num = 8;

        SquareRoot root = new SquareRoot();
        int sqrRoot = root.squareRoot(num);

        System.out.println(sqrRoot);
    }
}
