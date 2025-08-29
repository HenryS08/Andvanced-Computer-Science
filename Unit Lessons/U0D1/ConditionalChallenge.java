public class ConditionalChallenge {
    public static void main(String[] args) {
        // Your code will go here
        double temperature = 8.34;
        boolean isCold = true;
        if (isCold) {
            temperature -= 15;
        }
        else {
            temperature += 10;
        }
        // Part 1: Temperature Converter
        System.out.println("--- Part 1: Temperature Converter ---");
        System.out.println("Temperature is" + temperature);
        // Part 2: Grade Calculator
        int score = 49;
        if (score >= 70) {
            System.out.println("Passed");
            System.out.println(score + "Passed");
        }
        else {
            System.out.println("Failed");
            System.out.println(score + " Failed");
        }
        // Part 3: Leap Year Checker
        int temperature2 = 70;
        if (temperature2 > 80) {
            System.out.println(temperature2 + " Summer");
        }
        else if (temperature2 > 60 && temperature2 < 80) {
            System.out.println(temperature2 + " Spring");
        }
        else if (temperature2 > 40 && temperature2 < 59) {
            System.out.println(temperature2 + " Fall");
        }
        else {
            System.out.println(temperature2 + " Winter");
        }
        // Part 4: Number Classifier
        int number = 6;
    }
}