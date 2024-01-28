package Recursion;

public class Sum {

    int sumNumbers(int num) {
        if (num == 0)
            return 0;
        return num + sumNumbers(num - 1);
    }

    public static void main(String[] args) {
        int num = 10;

        Sum sumation = new Sum();
        int sum = sumation.sumNumbers(num);

        System.out.println(sum);
    }
}
