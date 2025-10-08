public class Circle extends Shape {
    private double radius;

    public Circle(Point centerPoint, double radius) {
        super(centerPoint);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle[centerPoint=" + centerPoint + ",radius=" + radius + "]";
    }
}
