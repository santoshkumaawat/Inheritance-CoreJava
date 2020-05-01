package MethodOverriding;

public class A {

    public void m1() {
        System.out.println("Hello from m1 of class A");
    }

    public void m2() {
        System.out.println("Hello from m2 of class A");
    }

    @Override
    public String toString() {
        return "Hello From toString from class A";
    }
}
