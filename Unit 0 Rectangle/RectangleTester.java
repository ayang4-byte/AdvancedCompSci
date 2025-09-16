public class RectangleTester {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(3, 3, 2, 2);

        System.out.println(rect.calculateArea());
        System.out.println(rect.calculateDiagonal());
        System.out.println(rect.toString());
        System.out.println(rect.calculatePerimeter());
        System.out.println(rect.rotate(90));
        System.out.println(rect.dist(7, 24));
        System.out.println(Math.cos((Math.PI)/2.0));


    }
}
