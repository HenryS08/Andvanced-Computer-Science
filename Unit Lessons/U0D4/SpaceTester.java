public class SpaceTester {

    public static void main(String[] args) {
        // 1. intantiate a spaceship object
        Spaceship ship = new Spaceship("red", 30, 90.0, true);
        // the new keyword creates a new instance of the class (aka an object)

        // 2. invoke a method
        String shipDescription = ship.getDescription();

        int shipPassengerCount = ship.getPassengerCount();

        System.out.println(shipDescription);
        System.out.println(shipPassengerCount);

        // 3. manipulate the data
        ship.setDescription("blue");
        ship.setPassengerCount(35);
        ship.setFuelLevel(100.1);
    }
}
