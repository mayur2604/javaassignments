package IncAssignment3.socialstudies_task3;

public class Study extends Science implements social {
    @Override
    public void readC() {
        System.out.println("reading civics");
    }

    @Override
    public void readSS() {
        System.out.println("reading social");
    }

    @Override
    public void readG() {
        System.out.println("reading geo");
    }

    @Override
    public void readH() {
        System.out.println("reading his");
    }

    @Override
    public void writeC() {
        System.out.println("writing civics");
    }

    @Override
    public void writeG() {
        System.out.println("writing geo");
    }

    @Override
    public void writeH() {
        System.out.println("writing his");
    }

}
