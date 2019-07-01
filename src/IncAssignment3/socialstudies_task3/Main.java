package IncAssignment3.socialstudies_task3;

public class Main {
    static void Geo(Geography geo) {
        geo.readG();
    }

    static void His(History his) {
        his.readH();
    }

    static void Civ(Civics civ) {
        civ.readC();
    }

    static void Soc(social soc) {
        soc.readSS();
    }

    public static void main(String[] args) {
        Study study = new Study();
        Geo(study);
        His(study);
        Civ(study);
        Soc(study);
    }
}
