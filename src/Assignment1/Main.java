package Assignment1;

import java.util.*;
import java.io.*;
import java.util.regex.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        File home = new File("/home/user/");    //creating an instance for home directory
        while (true) {
            String patt = sc.next();    //scanning the pattern from user
            if (patt.equals("exit"))
                break;
            Pattern pattern = Pattern.compile(patt);
            if (home.exists()) {          //checking if home dir exists
                String arr[] = home.list();     //creating an arr to hold all the sub directories n files of home
                for (int i = 0; i < arr.length; i++) {  //iterating through the arr
                    File f = new File(arr[i]);
                    Matcher matcher = pattern.matcher(f.getName());  //matching the pattern with file name
                    if (matcher.find())
                        System.out.println(f.getAbsolutePath());
                }
            }
        }

    }
}
