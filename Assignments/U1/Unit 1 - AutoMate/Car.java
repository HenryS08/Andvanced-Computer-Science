public class Car {

    private String model;
    private String ownerName;
    private String username;
    private int cleanlinessLevel;
    private boolean needsOilChange;

    public Car(String model, String ownerName, int cleanlinessLevel) {
        this.model = model;
        this.ownerName = AutoUtils.fixName(ownerName);
        username = AutoUtils.generateUsername("user name");
        this.cleanlinessLevel = AutoUtils.validateCleanlinessLevel(cleanlinessLevel);
        needsOilChange = false;
    }

    public Car() {
        model = "model";
        ownerName = "First Last";
        username = AutoUtils.generateUsername("user name");
        cleanlinessLevel = 5;
        needsOilChange = false;
    }

    public String toString() {
        String oilChange = "yes";
        if (!needsOilChange) {
            oilChange = "no";
        }
        return "== ABOUT CAR == \nModel: " + model + " \nOwner: " + ownerName + " \nUsername: "
                + username + " \nCleanliness Level: " + cleanlinessLevel
                + " \nDoes car need oil change? " + oilChange;
    }

    public boolean equals(Car other) {
        if (this.model.equals(other.model) && this.ownerName.equals(other.ownerName)
                && this.username.equals(other.username)
                && this.cleanlinessLevel == other.cleanlinessLevel
                && this.needsOilChange == other.needsOilChange) {
            return true;
        } else {
            return false;
        }
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = AutoUtils.fixName(ownerName);
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }


    public int getCleanlinessLevel() {
        return cleanlinessLevel;
    }

    public void setCleanlinessLevel(int cleanlinessLevel) {
        this.cleanlinessLevel = AutoUtils.validateCleanlinessLevel(cleanlinessLevel);
    }

    public boolean isNeedsOilChange() {
        return needsOilChange;
    }

    public void setNeedsOilChange(boolean needsOilChange) {
        this.needsOilChange = needsOilChange;
    }
}
