package IncAssignment3.cycle_task4;

public class BiCycleFactory implements cycleFactory {
    @Override
    public Cycle getCycle() {
        return new BiCycle();
    }
}
