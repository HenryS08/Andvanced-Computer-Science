public class Line {

    private int a, b, c;

    Line(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double calculateSlope() {
        double slope = -(double) a / (double) b;
        return slope;
    }

    public boolean isCoordinateOnLine(int x, int y) {
        return a * x + b * y == -c;
    }

    public String toString() {
        return "Equation: " + a + "x " + b + " " + c + "y = 0";
    }

    public void setA(int a) {
        this.a = a;
    }

    public void set(int b) {
        this.b = b;
    }

    public void setC(int c) {
        this.c = c;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }

}
