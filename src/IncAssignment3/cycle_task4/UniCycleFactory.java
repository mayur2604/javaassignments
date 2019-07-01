package IncAssignment3.cycle_task4;

public class UniCycleFactory implements cycleFactory {
    @Override
    public Cycle getCycle() {
        return new UniCycle();
    }
}
