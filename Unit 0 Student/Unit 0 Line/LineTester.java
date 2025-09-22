public class LineTester {
    public static void main(String[] args) {
        Line Alpha = new Line(5, 6, 7);
        Line Beta = new Line(6, 7, 8);
        System.out.println(Alpha.calculateSlope());
        System.out.println(Alpha.equals(Beta));
    }
    
}
