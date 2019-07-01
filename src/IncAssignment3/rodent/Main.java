package IncAssignment3.rodent;

public class Main {
    public static void main(String[] args) {
        Rodent[] rodents = new Rodent[2];
        rodents[0] = new Mouse();
        rodents[0].eat();
        rodents[0].run();
        rodents[1] = new Hamster();
        rodents[1].eat();
        rodents[1].run();
    }
}
