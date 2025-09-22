public class LineTester {
    public static void main(String[] args) {
        Line alpha = new Line(5, 6, 7);
        Line beta = new Line(6, 7, 8);
        System.out.println(alpha.calculateSlope());
        System.out.println(alpha.equals(beta));
    }
    
}
