public class Squid {
    // instance variables
    private int tentacleCount;
    private double inkMeter;
    private String funFact;

    // constructor
    // default Constructor
    public Squid(){
        tentacleCount = 10;
        inkMeter = 100.0;
        funFact = ("you can use pieces of squid as fish bait!");

    }

    // getters
    public int getTentacleCount() {
        return tentacleCount;
    }

    // setters
    public void setTestacleCount(int value){
        tentacleCount = value;
    }

    // a built in method that returns all of the values of an object in a nice sentace.
    public String toString() {
        return "This is a squid. It has " + tentacleCount + " tentacles, and its current ink level is " + inkMeter + ". Also did you know that" + funFact + "?";
    }
    public boolean equals(Squid other){
        return tentacleCount == other.tentacleCount && inkMeter == other.inkMeter && funFact.equals(other.funFact);
    }
}
