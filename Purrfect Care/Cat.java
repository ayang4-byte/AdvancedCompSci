public class Cat {
    private String name;
    private String ownerName;
    private int moodLevel;
    private String catId;
    private char catChar;
    private boolean isHungry;

    public Cat(String name, String ownerName, int moodLevel, String catId) {
        this.moodLevel = PurrfectUtils.validateMoodLevel(moodLevel);
        this.catId = PurrfectUtils.validateCatId(catId);
        this.catChar = PurrfectUtils.generateCatChar(catId);
        this.isHungry = true;
        this.name = name;
        this.ownerName = ownerName;
    }

    public Cat() {
        this.name = "Johnny";
        this.catId = "1234";
        this.catChar = PurrfectUtils.generateCatChar(catId);
        this.isHungry = true;
        this.ownerName = "Bill";
        this.moodLevel = 7;
    }

    public String generateCatTag() {
        return catId + catChar;
    }

    public String toString() {
        String who = "" + name + " is a cat.";
        String tag = "Their tag is " + generateCatTag();
        String mood = PurrfectUtils.determineCatMood(this);
        return "== ABOUT " + name.toUpperCase() + " ==\n" + who + "\n" + tag + "\n" + mood;
    }

    public boolean equals(Cat other) {
        if (other.toString().equals(this.toString())) {
            return true;
        }
        return false;
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
        if (moodLevel > 10) {
            moodLevel = 10;
        } else if (moodLevel < 0) {
            moodLevel = 0;
        }
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
