public class Dog {
    private String name;
    private String ownerName;
    private String dogTag;
    private int age;
    private int dogId;
    private char dogChar;
    private boolean stillInFacility;

    public Dog(String name, String ownerName, int age, int dogId) {
        this.name = name;
        this.ownerName = ownerName;
        this.age = age;
        this.dogId = dogId;
        this.dogTag = generateDogTag();
        this.dogChar = Dog.generateDogChar(this.dogId);
        this.stillInFacility = true;
    }

    public Dog() {
        this.name = "Spot";
        this.ownerName = "Dot";
        this.age = 67;
        this.dogId = 676;
        this.dogTag = generateDogTag();
        this.dogChar = Dog.generateDogChar(this.dogId);
        this.stillInFacility = true;
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

    public String getDogTag() {
        return dogTag;
    }

    public void setDogTag(String dogTag) {
        this.dogTag = dogTag;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getDogId() {
        return dogId;
    }

    public void setDogId(int dogId) {
        this.dogId = dogId;
    }

    public char getDogChar() {
        return dogChar;
    }

    public void setDogChar(char dogChar) {
        this.dogChar = dogChar;
    }

    public boolean isStillInFacility() {
        return stillInFacility;
    }

    public void setStillInFacility(boolean stillInFacility) {
        this.stillInFacility = stillInFacility;
    }

    public String toString() {
        return "Name: " + name + " Owner: " + ownerName + 
                " Dogtag: " + dogTag + " Age: " + age + 
                " DogID: " + dogId + " Dog Char: " + dogChar + 
                " Facility Status: " + stillInFacility;
    }

    public boolean equals(Dog other) {
        if (this.name.equals(other.name) && this.ownerName.equals(other.ownerName) 
            && this.dogTag.equals(other.dogTag) && this.age == other.age 
            && this.dogId == other.dogId && this.dogChar == other.dogChar 
            && this.stillInFacility == other.stillInFacility) {
                return true;
        }
        return false;
    }

    public static char generateDogChar(int dogId) {
        int onesDigit = (dogId % 100) % 10;
        int tensDigit = ((dogId % 100) - onesDigit) / 10;
        int hundredsDigit = (dogId - (dogId % 100)) / 100;
        int rawVal = ((onesDigit + tensDigit + hundredsDigit) % 10) + 'F';
        return (char) rawVal;
    }

    public String generateDogTag() {
        return "" + dogId + dogChar;
    }

    public static String pickup(Dog dog, String personName) {
        if (personName == dog.ownerName) {
            dog.stillInFacility = false;
            return "" + dog.name + " has been picked up by their owner " + personName;
        } else {
            return "Safety First";
        }
    }

    public static void checkIn(Dog dog, String personName) {
        dog.ownerName = personName;
        dog.stillInFacility = true;
    }


    
}
