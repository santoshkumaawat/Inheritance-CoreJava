package AccessModifiers.P2;

import AccessModifiers.P1.Main;

public class ChildOutsidePackage extends Main {

    void check() {
        System.out.println(a);  //public
        System.out.println(b);  //protected
        //System.out.println(c);  //default
        //System.out.println(d);  //private
    }
}
