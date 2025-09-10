public class RectangleTester {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(4, 6);

        System.out.println(rect.calculateArea());
        System.out.println(rect.calculateDiagonal());
        System.out.println(rect.toString());
    }
}
