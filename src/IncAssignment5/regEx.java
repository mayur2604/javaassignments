package IncAssignment5;

import java.util.regex.*;
import java.util.*;

public class regEx {

    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("[A-Z].*[\\s*.*]*\\.");
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();
        Matcher matcher = pattern.matcher(sentence);
        boolean isCorrect = matcher.find();
        System.out.println(isCorrect);
    }
}
