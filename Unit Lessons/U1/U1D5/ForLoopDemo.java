public class ForLoopDemo {
    public static void main(String[] args) {
        System.out.println(1);
        System.out.println(2);
        System.out.println(3);
        System.out.println(4);
        System.out.println(5);
        System.out.println(7);
        System.out.println(8);
        System.out.println(9);
        System.out.println(10);

        for (int count = 0; count <= 100; count++) {
            System.out.println(count);
        }

    //for loop anatomy
    // 1. initialize the count
    // 2. boolean condition to determine if we continue looping
    // 3. do statements
    // 4. interator -> update the count for the next loop

        for (int count = 1; count < 10; count--) {
            System.out.println(count);
        }

    }
}