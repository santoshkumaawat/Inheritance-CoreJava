package AccessModifiers.P1;

public class ChildWithinPackage extends Main {

    void show() {
        System.out.println(a);  //public
        System.out.println(b);  //protected
        System.out.println(c);  //default
        //System.out.println(d);  //private
    }
}
