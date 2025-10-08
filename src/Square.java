public class Square extends Rectangle {
    private double side;

    public Square(Point centerPoint, double side) {
        super(centerPoint, side, side);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
        super.setWidth(side);
        super.setHeight(side);
    }

    @Override
    public String toString() {
        return "Square[centerPoint=" + centerPoint + ",side=" + side + "]";
    }
}
