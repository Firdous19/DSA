package Binary_Search.Answers;

public class NthRoot {

    int nthRoot(int n, int m) {
        int low = 1;
        int high = m;

        while (low <= high) {
            int mid = (low + high) / 2;
            long mul = (long) Math.pow(mid, n);
            if (mul == m)
                return mid;
            else if (mul < m) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int M = 69;
        int N = 4;

        NthRoot root = new NthRoot();
        int ans = root.nthRoot(N, M);

        System.out.println(ans);
    }
}
