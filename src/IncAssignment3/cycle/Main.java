package IncAssignment3.cycle;

public class Main {
    public static void main(String[] args) {
        UniCycle uniCycle = new UniCycle();
        BiCycle biCycle = new BiCycle();
        TriCycle triCycle = new TriCycle();
        Cycle cycles[] = new Cycle[3];
        cycles[0] = uniCycle;
        cycles[1] = biCycle;
        cycles[2] = triCycle;
        //with upcasting we get compile time error since thr is no method balance in cycle
        ((UniCycle) cycles[0]).balance();
        ((BiCycle) cycles[1]).balance();
        // ((TriCycle)cycles[2]).balance(); ther is no method balance in tricycle so compile time error

    }
}
