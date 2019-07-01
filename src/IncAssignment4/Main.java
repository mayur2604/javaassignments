package IncAssignment4;


public class Main {
    public static void throwException() throws Exception {
        throw new ExceptionA();
        // throw new ExceptionB();        //unreachable code so compile time error
        //throw new ExceptionC();
    }

    public static void main(String[] args) {
        try {
            throwException();
            throw new NullPointerException();
        } catch (Exception e) {
            System.out.println("exeption occured");
        } finally {
            System.out.println("finally block");
        }
    }
}
