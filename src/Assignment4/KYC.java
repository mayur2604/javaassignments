package Assignment4;

import java.time.LocalDate;
import java.util.*;

public class KYC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int noOfTestCases = sc.nextInt();
        String[][] dates = new String[noOfTestCases][2];
        for (int i = 0; i < noOfTestCases; i++) {
            for (int j = 0; j < 2; j++)
                dates[i][j] = sc.next();
        }
        for (int i = 0; i < noOfTestCases; i++) {
            String signup = dates[i][0];
            String current = dates[i][1];
            String[] signupArr = signup.split("-");
            String[] currentArr = current.split("-");
            LocalDate signupDate = LocalDate.of(Integer.parseInt(currentArr[2]), Integer.parseInt(signupArr[1]), Integer.parseInt(signupArr[0]));
            LocalDate currentDate = LocalDate.of(Integer.parseInt(currentArr[2]), Integer.parseInt(currentArr[1]), Integer.parseInt(currentArr[0]));
            LocalDate upper = signupDate.plusDays(30);
            LocalDate lower = signupDate.minusDays(30);
            if (upper.isBefore(currentDate)) {
                System.out.println(lower.toString() + " " + upper.toString());
            } else if (lower.isBefore(currentDate)) {
                System.out.println(lower.toString() + " " + currentDate.toString());
            } else
                System.out.println("No Range");

        }

    }
}
