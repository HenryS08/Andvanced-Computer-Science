public class Cat {

    private String name;
    private String ownerName;
    private int moodLevel;
    private String catId;
    private char catChar;
    private boolean isHungry;

    public Cat(String name, String ownerName, int moodLevel, String catId) {
        this.name = name;
        this.ownerName = ownerName;
        this.moodLevel = PurrfectUtils.validateMoodLevel(moodLevel);
        this.catId = PurrfectUtils.validateCatId(catId);
        catChar = PurrfectUtils.generateCatChar(catId);
        isHungry = true;
    }

    public Cat() {
        name = "name";
        ownerName = "ownerName";
        moodLevel = 1;
        catId = "1000";
        catChar = PurrfectUtils.generateCatChar(catId);
        isHungry = true;
    }

    public String generateCatTag() {
        return catId + catChar;
    }

    public String toString() {
        return "== ABOUT " + name.toUpperCase() + " ==\n" + //
                "" + name + " is a cat.\n" + //
                "Their tag is " + generateCatTag() + ". \n" + PurrfectUtils.determineCatMood(this);
    }

    public boolean equals(Cat other) {
        if (this.name.equals(other.name) && this.ownerName.equals(other.ownerName)
                && this.moodLevel == other.moodLevel
                && this.generateCatTag().equals(other.generateCatTag())
                && this.isHungry == other.isHungry) {
            return true;
        } else {
            return false;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public int getMoodLevel() {
        return moodLevel;
    }

    public void setMoodLevel(int moodLevel) {
        this.moodLevel = moodLevel;
    }

    public String getCatId() {
        return catId;
    }

    public void setCatId(String catId) {
        this.catId = catId;
    }

    public char getCatChar() {
        return catChar;
    }

    public void setCatChar(char catChar) {
        this.catChar = catChar;
    }

    public boolean isHungry() {
        return isHungry;
    }

    public void setHungry(boolean isHungry) {
        this.isHungry = isHungry;
    }


}
