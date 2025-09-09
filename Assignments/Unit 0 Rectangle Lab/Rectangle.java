public class Rectangle {

    private int length;
    private int width;

    public Rectangle(int newLength, int newWidth) {
        length = newLength;
        width = newWidth;
    }

    public Rectangle() {
        length = 0;
        width = 0;
    }

    public String toString() {
        String details = "This rectangle has a length of " + length + " and a width of " + width
                + ". Its area is " + length * width + ".";
        return details;
    }

    public boolean equals(Rectangle other) {
        return length == other.length && width == other.width;
    }

    public int calculateArea() {
        int area = width * length;
        return area;
    }

    public int calculatePerimeter() {
        int perimeter = 2 * (width + length);
        return perimeter;
    }

    public double calculateDiagonal() {
        double diagonal = Math.sqrt(width * width + length * length);
        return diagonal;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public void setLength(int newLength) {
        length = newLength;
    }

    public void setWidth(int newWidth) {
        width = newWidth;
    }

}
