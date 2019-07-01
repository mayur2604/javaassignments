package IncAssignment3.innerclasses_task5;

public class Rectangle extends Shape {
    class Side extends line {
        Side() {
            super("standing"); // since thr is no default constructor in line
        }

    }

    public Rectangle() {

        new Side();
    }

    public static void main(String[] args) {
        new Rectangle();
    }
}
