package AbstractClass;

/*if we want to be class Q still being Concrete Class,
 then we have to override all the abstract method of parent class
 */
public class Q extends P {

    @Override
    public void m3() {
        System.out.println("Hello from m3 of class Q");
    }

    @Override
    public void m4() {
        System.out.println("Hello from m4 of class Q");
    }
}
