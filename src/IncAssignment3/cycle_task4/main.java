package IncAssignment3.cycle_task4;

public class main {

    public static void rideCycle(cycleFactory factory) {
        Cycle cycle = factory.getCycle();
        cycle.ride();
    }

    public static void main(String[] args) {
        rideCycle(new UniCycleFactory());
        rideCycle(new BiCycleFactory());
        rideCycle(new TriCycleFactory());
    }
}
