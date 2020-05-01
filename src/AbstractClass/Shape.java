package AbstractClass;

public abstract class Shape {

    double radius, area;
    final double PI = 3.14;

    public final void setRadius(double r) {
        radius = r;
    }

    public abstract void computeArea();

    public final void showArea() {
        System.out.println("Area : " + area);
    }
}
