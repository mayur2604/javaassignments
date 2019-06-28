package mayur.assignment.singleton;

public class Singleton {
    private String name;

    public static Singleton getInstance(String Name) {
        // name = Name;  non-static memebers cannot bre referenced from static context
        return new Singleton();
    }

    public void printName() {
        System.out.println(name);
    }
}
