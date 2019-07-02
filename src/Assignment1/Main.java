package Assignment1;

import java.util.*;
import java.io.*;
import java.util.regex.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        File home = new File("/home/user/");
        while (true) {
            String p = sc.next();
            if (p.equals("exit"))
                break;
            Pattern pattern = Pattern.compile(p);
            if (home.exists()) {
                String arr[] = home.list();
                for (int i = 0; i < arr.length; i++) {
                    File f = new File(arr[i]);
                    Matcher matcher = pattern.matcher(f.getName());
                    if (matcher.find())
                        System.out.println(f.getAbsolutePath());
                }
            }
        }

    }
}
