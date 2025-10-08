public class MainProgram {
    public static void main(String[] args) {
        // Tạo danh sách các hình
        Shape[] shapes = new Shape[4];

        shapes[0] = new Rectangle(new Point(2, 3), 4, 6);
        shapes[1] = new Square(new Point(5, 5), 3);
        shapes[2] = new Circle(new Point(0, 0), 2.5);
        shapes[3] = new Rectangle(new Point(7, 1), 2, 3);

        // 1️⃣ Số lượng hình đã khởi tạo
        System.out.println("Số lượng hình đã khởi tạo: " + Shape.getShapeCount());

        // 2️⃣ Danh sách chi tiết các hình
        System.out.println("\nDanh sách chi tiết các hình:");
        for (Shape s : shapes) {
            System.out.println(s);
        }

        // 3️⃣ Danh sách tâm điểm
        System.out.println("\nDanh sách tâm điểm:");
        for (Shape s : shapes) {
            System.out.println(s.getCenterPoint());
        }
    }
}
