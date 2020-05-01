package Basic;

public class MediStud extends Stud {

    private int profs;

    public MediStud(int a, String b, int c) {
        super(a, b);
        profs = c;
    }

    public void showMediInfo() {
        super.showStudInfo();
        System.out.println("Profs : " + profs);
        System.out.println("--------------------------");
    }
}
