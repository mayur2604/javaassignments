package Assignment2;

import java.util.*;

public class Main {
    static boolean checkInputString(String input) {
        boolean flag[] = new boolean[26];
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (c >= 'a' && c <= 'z') {
                flag[c - 'a'] = true;
            }
        }
        for (int i = 0; i < 26; i++) {
            if (flag[i] == false)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        boolean isCorrect = checkInputString(input);
        if (isCorrect)
            System.out.println("string contains all alphabets from a-z");
        else
            System.out.println("string doesn't contain all alphabets");
    }
}
// Time Complexity--- O(n)  n-length of string
//Space Complexity-- O(1)