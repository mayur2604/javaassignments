package IncAssignment3.rodent;

public class Hamster extends Rodent {
    public Hamster() {
        System.out.println("child class-Hamster");
    }

    @Override
    void run() {
        System.out.println("Hamster is running");
    }

    @Override
    void eat() {
        System.out.println("Hamster is eating");
    }
}
