public class StaticDemo {
    public static void main(String[] args) {

        StaticDemo object = new StaticDemo();

        // object firstEffect();

        //static methods are sometimes calls helper methods
        //clases that hold static methods only acre called helper clases
        String demo = StaticDemo.secondIfTest();

        // you can print out the console without creating a System object
        System.out.println(demo);

        Math.random();

        System.out.println(Utils.generateRandomNumber(15, 101));
    
    }

    public void firstEffect() {
        int x = 4;
        int y = 3;
        int z = 4;

        if (x < y) {
            System.out.println("x is less than y");
        }
        if (x == z) {
            System.out.println("x is equal to z");
        }
    }

    public static String secondIfTest() {
        int x = 4;
        int y = 3;
        int z = 4;

        if (x < y) {
            System.out.println("x is less than y");
        }
        if (x == z) {
            System.out.println("x is equal to z");
        }

        return "hello there";
    }
}