package mayur.assignment.main;

import mayur.assignment.data.Data;
import mayur.assignment.singleton.Singleton;

public class main {
    public static void main(String[] args) {
        Data data = new Data();
        data.printData();
        data.printLocalData();
        Singleton singleton = Singleton.getInstance("mayur");
        singleton.printName();
    }
}
