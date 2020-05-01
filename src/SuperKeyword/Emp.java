package SuperKeyword;

public class Emp {

    private int eno;
    private String ename;

    public Emp(int a, String b) {
        eno = a;
        ename = b;
    }

    public void empInfo() {
        System.out.println("Employee Number : " + eno);
        System.out.println("Employee Name : " + ename);
    }
}
