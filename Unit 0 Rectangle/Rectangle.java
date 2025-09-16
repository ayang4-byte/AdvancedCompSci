public class Rectangle {
    private int length;
    private int width;
    private int startCoordinateX;
    private int startCoordinateY;

    public Rectangle(int newLength, int newWidth, int newStartCoordinateX, int newStartCoordinateY) {
        this.width = newWidth;
        this.length = newLength;
        this.startCoordinateX = newStartCoordinateX;
        this.startCoordinateY = newStartCoordinateY;
        System.out.println("The start coordinate is the bottom left corner of the rectangle");
    }

    public Rectangle() {
        width = 10;
        length = 20;
    }

    public double dist(int x, int y) {
        return Math.sqrt(x*x + y*y);
    }

    public double terminalSide(int opp, int adj) {
        return Math.atan(opp / adj);
    }

    public String rotate(int numberOfDegrees) {
        int rightCornerX = startCoordinateX + length;
        int upperCornerY = startCoordinateY + width;
        double numberOfRadians = numberOfDegrees * Math.PI / 180;

        double rotatedStartCoordinateX = dist(startCoordinateX, startCoordinateY) * Math.cos(numberOfRadians + terminalSide(startCoordinateX, startCoordinateY));
        double rotatedStartCoordinateY = dist(startCoordinateX, startCoordinateY) * Math.sin(numberOfRadians + terminalSide(startCoordinateX, startCoordinateY));

        double rotatedUpperLeftCornerX = dist(startCoordinateX, upperCornerY) * Math.cos(numberOfRadians + terminalSide(startCoordinateX, upperCornerY));
        double rotatedUpperLeftCornerY = dist(startCoordinateX, upperCornerY) * Math.sin(numberOfRadians + terminalSide(startCoordinateX, upperCornerY));

        double rotatedBottomRightCornerX = dist(rightCornerX, startCoordinateY) * Math.cos(numberOfRadians + terminalSide(rightCornerX, startCoordinateY));
        double rotatedBottomRightCornerY = dist(rightCornerX, startCoordinateY) * Math.sin(numberOfRadians + terminalSide(rightCornerX, startCoordinateY));

        double rotatedUpperRightCornerX = dist(rightCornerX, upperCornerY) * Math.sin(numberOfRadians + terminalSide(rightCornerX, upperCornerY));
        double rotatedUpperRightCornerY = dist(rightCornerX, upperCornerY) * Math.cos(numberOfRadians + terminalSide(rightCornerX, upperCornerY));

        return "The new coordinates of your rectangle are:"
        + "(" + (rotatedStartCoordinateX) + "," + (rotatedStartCoordinateY) + ")"
        + "(" + (rotatedBottomRightCornerX) + "," + (rotatedBottomRightCornerY) + ")"
        + "(" + (rotatedUpperLeftCornerX) + "," + (rotatedUpperLeftCornerY) + ")"
        +  "(" + (rotatedUpperRightCornerX) + "," +  (rotatedUpperRightCornerY) + ")" + "end" + (numberOfRadians);

    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getArea() {
        return length * width;
    }

    public int getPerimeter() {
        return 2 * length + 2 * width;
    }

    public double getDiagonal() {
        return Math.sqrt(length * length + width * width);
    }

    public String toString() {
        return "Rectangle: " + length + "x" + width;
    }

    public boolean equals(Rectangle anotherRectangle) {
        if (this.length == anotherRectangle.length 
            && this.width == anotherRectangle.width) {
            return true; 
        } else {
            return false;
        }
    }

    public int calculateArea() {
        int area = this.width * this.length;
        return area;
    }

    public int calculatePerimeter() {
        int perimeter = (2 * this.width) + (2 * this.length);
        return perimeter;
    }

    public double calculateDiagonal() {
        double diagonal = Math.sqrt(this.width * this.width + this.length * this.length);
        return diagonal;
    }
}
