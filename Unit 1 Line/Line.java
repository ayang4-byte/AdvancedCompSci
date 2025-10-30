public class Line {
    private int a;
    private int b;
    private int c;
    private Point p1;
    private Point p2;

    public Line(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Line() {
        this.a = generateRandomParameters();
        this.b = generateRandomParameters();
        this.c = generateRandomParameters();
    }

    public Line(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
        // instance variables a, b, and c
        // a = - (y2 - y1)
        this.a = -(p2.getY() - p1.getY()); 
        // b = x2 - x1
        this.b = p2.getX() - p1.getX(); 
        // c = - (a * x1 + b * y1)
        this.c = -(this.a * p1.getX() + p1.getY() * this.b); 
    }

    public int generateRandomParameters() {
        int num1 = 1;
        double num2 = Math.random();
        if (num2 == 0) {
            num2 = num2 + 0.1;
        }
        int finalNum = (int) (num1 / num2);
        int generator = (int) (Math.random());
        if (generator == 0) {
            finalNum = finalNum * -1;
        }
        return finalNum;
    }

    public String isParallel(Line other) {
        if (calculateSlope() == other.calculateSlope()) {
            return "Parallel";
        } else {
            double xCoord = (((double) other.c / other.b) - ((double) this.c / this.b)) / 
                            (((double) other.a / other.b) - ((double) this.a / this.b));
            double yCoord = ((c * -1) - (a * xCoord)) / b;
            return "(" + xCoord + ", " + yCoord + ")";
        } 

    }

    public Point getP1() {
        return p1;
    }

    public void setP1(Point p1) {
        this.p1 = p1;
    }

    public Point getP2() {
        return p2;
    }

    public void setP2(Point p2) {
        this.p2 = p2;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public double calculateSlope() {
        return -1 * ((double) a / (double) b);
    }

    public double calculateSlopeFromPoints() {
        double dY = p1.getY() - p2.getY();
        double dX = p1.getX() - p2.getX();
        return dY/dX;
    }

    public String generatePointSlopeFormula() {
        double m = this.calculateSlopeFromPoints();
        return "(y - " + p1.getY() + ") = " + m + "(x - " + p1.getX() + ")"; 
    }

    public boolean isCoordinateOnLine(Point p) {
        if ((a * p.getX()) + (b * p.getY()) + c == 0) {
            return true;
        } else {
            return false;
        }
    }

    public String toString() {
        return ("" + a + "x " + " + " + b + "y " + " + " + c + " = 0");
    }

    public boolean equals(Line otherLine) {
        if (otherLine.a == a 
            && otherLine.b == b 
            && otherLine.c == c) {
            return true;
        } else {
            return false;
        }
    } 
}
