package Recursion;

public class Name {

    void displayName(int n, String name) {

        if (n == 0)
            return;
        System.out.println(name);
        displayName(n - 1, name);
    }

    public static void main(String[] args) {
        int n = 5;
        String name = "Hello";

        Name display = new Name();
        display.displayName(n, name);
    }
}
