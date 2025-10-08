/**
 * MainProgram.java
 * Program to demonstrate the functionality of Shape classes.
 */
public class MainProgram {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[4];

        shapes[0] = new Rectangle(new Point(2, 3), 4, 6);
        shapes[1] = new Square(new Point(5, 5), 3);
        shapes[2] = new Circle(new Point(0, 0), 2.5);
        shapes[3] = new Rectangle(new Point(7, 1), 2, 3);

        /**
         * Demonstration of functionalities:
         * 1️⃣ Total number of shapes created.
         * 2️⃣ Detailed list of all shapes.
         * 3️⃣ List of center points of all shapes.
         */

        /**
         * Total number of shapes created
         * Using static method getShapeCount() from Shape class
         * to display the total count of shapes.
         */
        System.out.println("Số lượng hình đã khởi tạo: " + Shape.getShapeCount());

        /**
         * Detailed list of all shapes
         * Using toString() method of each shape
         * to display their details.
         */
        System.out.println("\nDanh sách chi tiết các hình:");
        for (Shape s : shapes) {
            System.out.println(s);
        }

        /**
         * List of center points of all shapes
         * Using getCenterPoint() method of each shape
         * to display their center points.
         */
        System.out.println("\nDanh sách tâm điểm:");
        for (Shape s : shapes) {
            System.out.println(s.getCenterPoint());
        }
    }
}
