public class Rectangle {
    private int width;
    private int length;
    // private int startCoordinateX;
    // private int startCoordinateY;

    public Rectangle(int newWidth, int newLength) {
        this.width = newWidth;
        this.length = newLength;
        // this.startCoordinateX = newStartCoordinateX;
        // this.startCoordinateY = newStartCoordinateY;
        // System.out.println("The start coordinate is the bottom left corner of the rectangle");
    }

    public Rectangle() {
        width = 10;
        length = 20;
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
