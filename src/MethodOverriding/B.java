package MethodOverriding;

public class B extends A {

    //class B has overridden method m1 of parent class A
    @Override
    public void m1() {
        System.out.println("Hello from m1 of class B");
    }

    public void m3() {
        System.out.println("Hello from m3 of class B");
    }

    public void m4() {
        System.out.println("Hello from m4 of class B");
    }

    public static void main(String[] args) {
        B ob = new B();
        ob.m1();
        ob.m2();
        ob.m3();
        ob.m4();
        String res = ob.toString();
        System.out.println(res);
    }
}
