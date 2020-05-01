package AbstractClass;

/*if a class having one or more abstract method,
 then we have to declare class itself an abstract class
 */
public abstract class P {

    //Concrete Methods
    public void m1() {
        System.out.println("Hello from m1 of P");
    }

    public static void m2() {
        System.out.println("Hello from m2 of P");
    }

    //Abstract Methods
    public abstract void m3();

    public abstract void m4();
}
