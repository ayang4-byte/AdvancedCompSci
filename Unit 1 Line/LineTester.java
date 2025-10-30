public class LineTester {
    public static void main(String[] args) {
        Line alpha = new Line(1, 1, 0);
        Line beta = new Line(1, -1, 0);
        Line gamma = new Line();
        System.out.println(alpha.calculateSlope());
        System.out.println(alpha.equals(beta));
        System.out.println(gamma.toString());
    }
}