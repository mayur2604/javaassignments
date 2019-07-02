package IncAssignment6;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SList<Integer> list = new SList<>();
        SListIterator<Integer> iterator = list.iterator();
        do {
            System.out.println("1.Insert\n2.Remove\n3.Print\n4.Exit");
            int option = sc.nextInt();
            int data;
            int flag = 0;
            switch (option) {
                case 1:
                    System.out.println("Enter data ");
                    data = sc.nextInt();
                    iterator.insert(data);
                    break;
                case 2:
                    System.out.println("Enter data ");
                    data = sc.nextInt();
                    iterator.remove(data);
                    break;
                case 3:
                    System.out.println(list.toString());
                    break;
                case 4:
                    flag = 1;
                    break;

            }
            if (flag == 1) break;
        } while (true);
    }
}
