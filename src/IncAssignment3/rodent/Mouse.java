package IncAssignment3.rodent;

public class Mouse extends Rodent {
    public Mouse() {
        System.out.println("child class-Mouse");
    }

    @Override
    void eat() {
        System.out.println("Mouse in eating");
    }

    @Override
    void run() {
        System.out.println("Mouse is running");
    }
}
