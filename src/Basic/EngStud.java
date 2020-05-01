package Basic;

public class EngStud extends Stud {

    private String branch;
    private int sem;

    public EngStud(int a, String b, String c, int d) {
        super(a, b);
        branch = c;
        sem = d;
    }

    public void showEngInfo() {
        super.showStudInfo();
        System.out.println("Branch : " + branch);
        System.out.println("Semester : " + sem);
        System.out.println("--------------------------");
    }
}
