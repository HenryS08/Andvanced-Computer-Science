public class RectangleTester {
    public static void main(String[] args) {

        Rectangle rect = new Rectangle(10, 20);
        Rectangle rect2 = new Rectangle(5, 8);

        System.out.println(rect.toString());
        System.out.println(rect2.toString());
        rect.setLength(5);
        rect2.setLength(8);
        System.out.println(rect.toString());
        System.out.println(rect2.toString());
        rect.equals(rect2);
        System.out.println("Diagonal of rectangle 1 " + rect.calculateDiagonal());
        System.out.println("Diagonal of rectangle 2 " + rect2.calculateDiagonal());
    }

}
