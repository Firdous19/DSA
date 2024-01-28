package Algorithm;

public class SieveofEratosthenes {

    int sieveOfEratosthenes(int n) {
        if (n <= 1) {
            return 0;
        }

        boolean a[] = new boolean[n];
        for (int i = 2; i < Math.sqrt(n); i++) {
            if (!a[i]) {
                for (int j = i * i; j < n; j += i) {
                    a[j] = true;
                }
            }
        }

        int count = 0;
        for (int j = 2; j < n; j++) {
            if (!a[j]) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int n = 5000000;

        SieveofEratosthenes sieve = new SieveofEratosthenes();

        int count = sieve.sieveOfEratosthenes(n);
        System.out.println(count);
    }
}
