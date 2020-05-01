package AbstractClass;

public class Circle extends Shape {

    @Override
    public void computeArea() {
        area = PI * radius * radius;
    }
}
