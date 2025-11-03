public class CleanUtils {
    public static int validateCleanlinessLevel(int cleanlinessLevel) {
        if (cleanlinessLevel < 0) {
            cleanlinessLevel = 0;
        } else if (cleanlinessLevel > 10) {
            cleanlinessLevel = 10;
        }
        return cleanlinessLevel;
    }

    public static String generateUsername(String name) {
        int spaceLoc = name.indexOf(" ");
        String lastName = name.substring(spaceLoc+1);
        String firstName = name.substring(0, spaceLoc);
        int id = ((int) (Math.random() * 100)) + 1950;
        return "@" + firstName + "_" + lastName + "_" + id;
    }

    public static void cleanHome (Home home) {
        home.setCleanlinessLevel(home.getCleanlinessLevel() + 2);
    }

    public static String fixName(String name) {
        name = name.trim();
        int space = name.indexOf(" ");
        String lastName = name.substring(space);
        String firstName = name.substring(0, space);
        lastName = lastName.trim();
        return "" + firstName + " " + lastName;
    }
}
