public class Line {
    private int a;
    private int b;
    private int c;

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
