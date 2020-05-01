package Basic;

//THIS CLASS USING CLASS A's MEMBERS BY OBJECT.
public class B {

    A ob = new A();

    public void m3() {
        System.out.println("Hello from m3 of class B");
    }

    public void m4() {
        System.out.println("Hello from m4 of class B");
    }

    public void demo() {
        ob.m1();
        ob.m2();
        m3();
        m4();
    }

    public static void main(String[] args) {
        B ob = new B();
        ob.demo();
    }
}
