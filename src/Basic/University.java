package Basic;

public class University {

    public static void main(String[] args) {
        EngStud s1 = new EngStud(111, "Santosh", "MCA", 1);
        MediStud s2 = new MediStud(211, "Arun", 2);
        s1.showEngInfo();
        s2.showMediInfo();
    }
}
