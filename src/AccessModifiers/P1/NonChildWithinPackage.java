package AccessModifiers.P1;

public class NonChildWithinPackage {

    void print() {
        Main ob = new Main();
        System.out.println(ob.a);  //public
        System.out.println(ob.b);  //protected
        System.out.println(ob.c);  //default
        //System.out.println(ob.d);  //private
    }

}
