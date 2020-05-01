package AbstractClass;

public class UseShapes {

    public static void main(String[] args) {
        Circle c1 = new Circle();
        c1.setRadius(10);
        c1.computeArea();
        c1.showArea();

        Cylinder c2 = new Cylinder();
        c2.setRadius(50);
        c2.setHeight(100);
        c2.computeArea();
        c2.showArea();
    }
}
