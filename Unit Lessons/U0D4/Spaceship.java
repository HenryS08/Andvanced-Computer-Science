// camelCase -> a way to write variable names, and it's a standard
// A
// thefoxjumpedoverthelazydog

// B
// TheFoxJumperOverTheLazyDog
// keep the first letter lowercase if if's a variable names and methods
// otherwise keep it capital for class names

// a class is just a blueprint for a new data type
// -> it's not the object itself, but rather a plan

public class Spaceship {

    // instance variables
    private String description;
    private int passengerCount;
    private double fuelLevel;
    private boolean shieldsActive;

    // constructors
    public Spaceship(String inputDescription, int inputPassengerCount, double inputFuelLevel,
            boolean inputShieldsAtive) {
        description = inputDescription;
        passengerCount = inputPassengerCount;
        fuelLevel = inputFuelLevel;
        shieldsActive = inputShieldsAtive;
    }

    // methods
    // getters (aka Accessors)
    public String getDescription() {
        return description;
    }

    public int getPassengerCount() {
        return passengerCount;
    }

    public double getFuelLevel() {
        return fuelLevel;
    }

    public boolean getShieldsActive() {
        return shieldsActive;
    }

    // setters (these methods are void)
    public void setDescription(String input) {
        description = input;
        System.out.println(description);
    }

    public void setPassengerCount(int input) {
        passengerCount = input;
        System.out.println(passengerCount);
    }

    public void setFuelLevel(double input) {
        fuelLevel = input;
        System.out.println(fuelLevel);
    }

    public void setShieldsActive(boolean input) {
        shieldsActive = input;
    }

    // challenge: use 3 setters to update the values of 3 different instance variable, make sure to
    // print pefore and after the update.
}
