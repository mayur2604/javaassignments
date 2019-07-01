package IncAssignment3.cycle_task4;

public class TriCycleFactory implements cycleFactory {
    @Override
    public Cycle getCycle() {
        return new TriCycle();
    }
}
