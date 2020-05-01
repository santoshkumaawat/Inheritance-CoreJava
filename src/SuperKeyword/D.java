package SuperKeyword;

public class D extends C {

    D() {
        this(10);
        System.out.println("Hello Zero args constructor from D");
    }

    D(int a) {
        super();
        System.out.println("Hello one args constructor from D");
    }

    public static void main(String[] args) {
        D ob = new D();
    }
}
