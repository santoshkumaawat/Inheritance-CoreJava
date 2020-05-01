package AbstractClass;

public class Cylinder extends Shape {

    private double height;

    public void setHeight(double h) {
        height = h;
    }

    @Override
    public void computeArea() {
        area = (2 * PI * radius * height) + (2 * PI * radius * radius);
    }
}
