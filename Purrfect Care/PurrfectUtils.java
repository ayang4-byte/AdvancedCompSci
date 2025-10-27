public class PurrfectUtils {
    public static String determineCatMood(Cat cat) {
        if (cat.getMoodLevel() > 7) {
            return "" + cat.getName() + " is in a great mood.\nPetting is appreciated.";
        } else if (cat.getMoodLevel() > 4) {
            return "" + cat.getName() + " is reminiscing of a past life.\nPetting is acceptable.";
        } else {
            return "" + cat.getName() + " is plotting vengeance.\nPetting is extremely risky.";
        }
    }

    public static char generateCatChar(String catId) {
        int total = 0;
        for (int i = 0; i < catId.length(); i++) {
            String digitVal = catId.substring(i, i+1);
            Integer number = Integer.parseInt(digitVal);
            total = total + number;
        }
        char catChar = (char) ((total % 26) + 'A');
        return catChar;
    }

    public static int generateRandomNumber(int low, int high) {
        int newLow = 0;
        int newHigh = 0;
        if (low > high) {
            newLow = high;
            newHigh = low;
        } else {
            newLow = low;
            newHigh = high;
        }
        int randomNumber = (int) (Math.random() * (newHigh - newLow)) + newLow;
        return randomNumber;
    }

    public static String validateCatId(String catId) {
        Integer intCatId = Integer.parseInt(catId);
        if (intCatId <= 9999 && intCatId >= 1000) {
            return catId;
        } else {
            int randomNumber = (int) (1000 + Math.random() * 8999);
            return "" + randomNumber;
        }
    }

    public static int validateMoodLevel(int moodLevel) {
        if (moodLevel > 10) {
            moodLevel = 10;
        } else if (moodLevel < 0) {
            moodLevel = 0;
        }
        return moodLevel;
    }

    public static void bootUp(Cat cat) {
        System.out.println(cat.toString());
    }

    public static void pet(Cat cat) {
        int moodLevel = cat.getMoodLevel();
        boolean isHungry = cat.isHungry();
        if (moodLevel >= 2) {
            moodLevel += 1;
            System.out.println("Petting Successful!");
        } else if (moodLevel < 2 && isHungry == true) {
            moodLevel -= 1;
            System.out.println("Petting Failed...");
        } else if (moodLevel < 2 && isHungry == false) {
            moodLevel += 1;
            System.out.println("Petting Successful!");
        }
        cat.setMoodLevel(moodLevel);
    }

    public static void cleanLitterBox(Cat cat) {
        cat.setMoodLevel(cat.getMoodLevel() + 1);
        cat.setHungry(true);
        System.out.println("Cleaning the litter box...\nDone!\n" + cat.getName() + " appreciated that");
    }

    public static void feed(Cat cat) {
        cat.setMoodLevel(cat.getMoodLevel() + 2);
        cat.setHungry(false);
        System.out.println("Filling up" 
        + cat.getName() 
        + " 's bowl...\nDone!\n" 
        + cat.getName() 
        + " is eating...\n" 
        + cat.getName() 
        + " is full!");
    }
}

