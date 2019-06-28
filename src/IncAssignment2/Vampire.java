package IncAssignment2;

import java.util.*;

public class Vampire {


    static String sort(String number) {
        char arr[] = number.toCharArray();
        Arrays.sort(arr);
        return new String(arr);
    }

    static boolean findFactors(int number) {

        String no = String.valueOf(number);
        int len = no.length() / 2;
        String temp = "1";
        for (int k = 1; k <= len - 1; k++)
            temp += "0";
        for (int i = Integer.parseInt(temp); String.valueOf(i).length() == no.length() / 2; i++) {
            int[] factor = new int[2];
            if (number % i == 0) {
                factor[0] = i;
                factor[1] = number / i;
                String x = String.valueOf(factor[0]);
                String y = String.valueOf(factor[1]);
                if ((x.endsWith("0") && !y.endsWith("0")) || (!x.endsWith("0") && y.endsWith("0")) || (!x.endsWith("0") && !y.endsWith("0"))) {
                    if (x.length() == y.length() && x.length() == no.length() / 2 && sort(x + y).equals(sort(no))) {
                        //  System.out.println(x + " " + y);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    static boolean isVampire(int number) {
        String temp = String.valueOf(number);
        if (temp.length() % 2 != 0)
            return false;
        boolean isVampire = findFactors(number);
        if (isVampire) {
            System.out.println(number);
            return true;
        }
        return false;

    }

    public static void main(String[] args) {
        int count = 0, number = 10;
        while (count != 100) {
            if (isVampire(number))
                count++;
            number++;
            if (String.valueOf(number).length() % 2 != 0) {
                String no = String.valueOf(number) + "0";
                number = Integer.parseInt(no);
            }
        }
    }
}
