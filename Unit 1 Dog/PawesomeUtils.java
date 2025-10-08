public class PawesomeUtils {
    public static char generateDogChar(int dogId) {
        int onesDigit = (dogId % 100) % 10;
        int tensDigit = ((dogId % 100) - onesDigit) / 10;
        int hundredsDigit = (dogId - (dogId % 100)) / 100;
        int rawVal = ((onesDigit + tensDigit + hundredsDigit) % 10) + 'F';
        return (char) rawVal;
    }

    public static String generateDogTag(int dogId, char dogChar) {
        return "" + dogId + dogChar;
    }

    public static String pickup(Dog dog, String personName) {
        if (personName.equals(dog.getOwnerName())) {
            dog.setStillInFacility(false);
            return "" + dog.getName() + " has been picked up by their owner " + personName;
        } else {
            return "Safety First";
        }
    }

    public static void checkIn(Dog dog, String personName) {
        dog.setOwnerName(personName);
        dog.setStillInFacility(true);
    } 

    public static int validateDogId(int dogId) {
        if (dogId >= 100 && dogId <= 999) {
            return dogId;
        } else {
            int randomNumber = (int) (Math.random() * 899) + 100;
            return randomNumber;
        }

    }

    public static boolean validateDogTag(Dog dog) {
        int dogId = dog.getDogId();
        if (validateDogId(dogId) == dogId) {
            char dogChar = generateDogChar(dogId);
            String newDogTag = "" + dogId + dogChar;
            return newDogTag == dog.getDogTag();
        } else {
            return false;
        }
    }
}
