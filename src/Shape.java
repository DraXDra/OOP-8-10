/**
 * Abstract class representing a geometric shape.
 */
public abstract class Shape {
    protected Point centerPoint;
    private static int shapeCount = 0;

    public Shape(Point centerPoint) {
        this.centerPoint = centerPoint;
        shapeCount++;
    }

    public Point getCenterPoint() {
        return centerPoint;
    }

    public void setCenterPoint(Point centerPoint) {
        this.centerPoint = centerPoint;
    }

    public static int getShapeCount() {
        return shapeCount;
    }

    @Override
    public String toString() {
        return "Shape[centerPoint=" + centerPoint + "]";
    }
}
