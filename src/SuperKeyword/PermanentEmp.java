package SuperKeyword;

public class PermanentEmp extends Emp {

    private int sal;
    private String desg;

    public PermanentEmp(int a, String b, int c, String d) {
        super(a, b);
        sal = c;
        desg = d;
    }

    public void pEmpInfo() {
        super.empInfo();
        System.out.println("Salary : " + sal);
        System.out.println("Designation : " + desg);
    }

    public static void main(String[] args) {
        PermanentEmp ob = new PermanentEmp(111, "Santosh", 50000, "JD");
        ob.pEmpInfo();
    }
}
