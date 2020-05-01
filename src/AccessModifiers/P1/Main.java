package AccessModifiers.P1;

public class Main {

    public int a = 10;
    protected int b = 20;
    int c = 30;
    private int d = 40;

    public void display() {
        System.out.println(a);  //public
        System.out.println(b);  //protected
        System.out.println(c);  //default
        System.out.println(d);  //private
    }

    public static void main(String[] args) {
        Main ob = new Main();
        ob.display();
    }

}
