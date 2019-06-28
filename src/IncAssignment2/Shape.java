package IncAssignment2;

public class Shape {
    public Shape() {
        System.out.println("default constructor");
    }

    public Shape(int side) {
        this();
        System.out.println("square");
    }

    public Shape(int length, int breadth) {
        this(length);
        System.out.println("Rectangle");
    }

    public static void main(String[] args) {
        new Shape(3, 4);
    }
}
