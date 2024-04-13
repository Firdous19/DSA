package Recursion;

public class Factorial {

    // Parameterized
    // void fact(int i, int fac) {
    // if (i == 1) {
    // System.out.println(fac);
    // return;
    // }
    // fact(i - 1, fac * i);
    // }

    // Functional Recursion
    int fact(int n) {
        if (n == 1) {
            return 1;
        }
        return n * fact(n - 1);
    }

    public static void main(String args[]) {
        Factorial factorial = new Factorial();
        int fact = factorial.fact(5);

        System.out.println("Factorial: " + fact);
    }
}
