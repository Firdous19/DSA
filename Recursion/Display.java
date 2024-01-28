package Recursion;

public class Display {

    void recursion(int num) {
        if (num == 0)
            return;

        recursion(num - 1);
        System.out.println(num);
    }

    public static void main(String[] args) {
        int num = 3;

        Display rec = new Display();
        rec.recursion(num);
    }
}
