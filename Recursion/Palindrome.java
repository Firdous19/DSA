package Recursion;

import java.security.cert.PolicyQualifierInfo;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Palindrome {

    boolean reverseString(String str, int i, int n) {
        if (i >= n / 2)
            return true;
        if (str.charAt(i) != str.charAt(n - 1 - i))
            return false;
        return reverseString(str, i + 1, n);
    }

    public static void main(String args[]) {
        String str = "Hello";
        Palindrome pal = new Palindrome();
        boolean isRev = pal.reverseString(str, 0, str.length());

        if (isRev) {
            System.out.println("Palindrome String");
        } else {
            System.out.println("Not Palindrome String");
        }
    }
}
