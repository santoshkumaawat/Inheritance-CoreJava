package Basic;

//THIS CLASS USING CLASS A's MEMBERS BY INHERITANCE
public class C extends A {

    public void m5() {
        System.out.println("Hello from m5 of class C");
    }

    public void m6() {
        System.out.println("Hello from m6 of class C");
    }

    public void test() {
        m1();
        m2();
        m5();
        m6();
    }

    public static void main(String[] args) {
        C ob = new C();
        ob.test();
    }
}
