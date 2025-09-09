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
        System.out.println(rect.calculateDiagonal());
        System.out.println(rect2.calculateDiagonal());
    }

}