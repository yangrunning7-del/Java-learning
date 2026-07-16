package practise;

import java.util.Scanner;

public class ParLindromeString {
    public static void main(String[] args) {
        Scanner scnner = new Scanner(System.in);
        String str = scnner.nextLine();
        System.out.println(isParLindrome(str));
    }
    public static boolean isParLindrome(String str) {
        int start = 0;
        int end = str.length() - 1;
        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
