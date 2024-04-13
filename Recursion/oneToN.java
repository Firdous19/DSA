package Recursion;

/**
 * oneToN
 */
public class oneToN {

    void display(int i, int n) {
        if (i > n) {
            return;
        }
        display(i + 1, n);
        System.out.println(i);
    }

    public static void main(String args[]) {
        oneToN number = new oneToN();
        number.display(1, 4);
    }
}