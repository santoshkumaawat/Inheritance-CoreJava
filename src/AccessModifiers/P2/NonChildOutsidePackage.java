package AccessModifiers.P2;

import AccessModifiers.P1.Main;

public class NonChildOutsidePackage {

    void show() {
        Main ob = new Main();
        System.out.println(ob.a);  //public
        //System.out.println(ob.b);  //protected
        //System.out.println(ob.c);  //default
        //System.out.println(ob.d);  //private
    }
}
