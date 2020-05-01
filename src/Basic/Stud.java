package Basic;

public class Stud {

    private int rollno;
    private String name;

    public Stud(int a, String b) {
        rollno = a;
        name = b;
    }

    public void showStudInfo() {
        System.out.println("Roll Number : " + rollno);
        System.out.println("Student Name : " + name);
    }
}
