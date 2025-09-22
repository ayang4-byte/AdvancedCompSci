public class Line {
    private int a;
    private int b;
    private int c;

    public Line(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
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

    public boolean isCoordinateOnLine(int x, int y) {
        if ((a * x) + (b * y) + c == 0) {
            return true;
        } else {
            return false;
        }
    }

    public String toString() {
        return ("" + a + "x " + b + "y " + c + " = 0");
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
