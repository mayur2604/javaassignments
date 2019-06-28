package IncAssignment2;

import java.util.*;

public class Main {

    public Main(String name) {
        System.out.println(name);
    }

    public static void main(String[] args) {
        Main[] names = new Main[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {

            names[i] = new Main(sc.next());
        }
    }
}
