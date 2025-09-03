// Solution: Unit 0 Exercises
public class Unit0Exercises {


    public static void main(String[] args) {
        Unit0Exercises obj = new Unit0Exercises();
        System.out.println();

        // testing sleepIn() method
        System.out.println(obj.sleepIn(false, false)); // output: true
        System.out.println(obj.sleepIn(true, false)); // sleepIn(true, false) -> true
        System.out.println(obj.sleepIn(false, true)); // sleepIn(false, true) -> true
        System.out.println(obj.sleepIn(true, true));


        // testing diff21() method
        System.out.println(obj.diff21(19)); // ouput: 2
        System.out.println(obj.diff21(10)); // diff21(10) -> 11
        System.out.println(obj.diff21(21)); // diff21(21) -> 0
        System.out.println(obj.diff21(25));

        // testing flooringCalculator() method
        System.out.println(obj.flooringCalculator(500, 2.5)); // output: 1250.0
        // flooringCalculator(0, 3.0) -> 0.0
        // flooringCalculator(100, -1.5) -> 0.0

    }

    public boolean sleepIn(boolean weekday, boolean vacation) {
        if (weekday && vacation) {
            return false;
        } else {
            return true;
        }
    }

    public int diff21(int n) {
        if (n > 21) {
            n = 2 * (n - 21);
            return n;
        } else {
            n = 21 - n;
        }
        return n;
    }

    public double flooringCalculator(int sqft, double pricePerSqft) {
        pricePerSqft = (double) sqft * pricePerSqft;
        if (pricePerSqft <= 0) {
            pricePerSqft = 0.0;
        }
        return pricePerSqft;
    }

}
