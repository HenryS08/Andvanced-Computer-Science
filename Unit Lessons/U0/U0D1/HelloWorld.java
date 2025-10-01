// A class is a collection of related attributes and behaviors

public class HelloWorld {

    // Main -> an entrypoint for your computer to start running code
    public static void main(String[] args) {
        System.out.println("Hello World");
        System.out.println("my name is Lopez");

        System.out.print("My favorite pizzatopping is Pepperoni");
        System.out.print("I don't drink caffine");

        // 8 primitive data types
        int number = 5; // integer
        char letter = 'a'; // character
        boolean isTrue = true; // true or false
        float decimal = 0.5f; // 32 bit decimal
        double bigdecimal = 0.6; // 64 bit decimal number

        // INT ALTERNATIVES (can ignore for this class)
        byte age = 25;
        short population = 3200;
        long bigInteger = 10000;

        String myName = "Henry"; // String is a CLASS not a primitve data type
        // a collection of characters to describe text

        // print out the length of the string using length() method
        System.out.println(myName.length());

        // conditional statements
        // if this happens then that happens
        int value = 5;
        if (value == 5) {
            System.out.println(value);
        }

        boolean isCompSciFun = true;
        if (isCompSciFun == false) {
            System.out.println("Comp Sci Sucks");
        } else if (isCompSciFun == true) {
            System.out.println("Comp Sci is fun!");
        }

        if (isCompSciFun) {
            System.out.println("Comp Sci is really fun!");
        } else {
            System.out.println("Comp Sci stresses me out.");
        }

        // Challenge Write a conditional if else statement where you do something if you ate 5
        // apples vs 10. It should print something if neither condition is true

        int appleCount = 7;
        if (appleCount == 5) {
            System.out.println("You ate 5 apples!");
        } else if (appleCount == 10) {
            System.out.println("You ate 10 apples!");
        } else {
            System.out.println("You ate " + appleCount + " a different amount of apples!");
        }

        // == equals

    }


}
