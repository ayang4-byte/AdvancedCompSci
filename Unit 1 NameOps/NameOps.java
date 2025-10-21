public class NameOps {
    public static String printMethodCall(String method, String name) {
        return "" + method + "(\"" + name + "\"): ";
    }

    public static String whoIsAwesome(String name) {
        return "" + name + " is awesome!";
    }

    public static int indexOfFirstSpace(String name) {
        int firstSpace = name.indexOf(" ");
        return firstSpace;
    }

    public static int indexOfSecondSpace(String name) {
        int firstSpace = indexOfFirstSpace(name);
        if (firstSpace != -1) {
            String newName = name.substring(firstSpace + 1);
            int secondSpace = indexOfFirstSpace(newName);
            if (secondSpace != -1) {
                return firstSpace + secondSpace + 1;
            }
        }
        return -1;
    }

    public static String findFirstName(String name) {
        int firstSpace = indexOfFirstSpace(name);
        if (firstSpace != -1) {
            return name.substring(0, firstSpace);
        } else {
            return name;
        }
    }

    public static String findLastName(String name) {
        int secondSpace = indexOfSecondSpace(name);
        int firstSpace = indexOfFirstSpace(name);
        if (firstSpace != -1 && secondSpace == -1) {
            return name.substring(firstSpace + 1);
        } else if (secondSpace != -1) {
            return name.substring(secondSpace + 1);
        } else {
            return "";
        }
    }

    public static String findMiddleName(String name) {
        int firstSpace = indexOfFirstSpace(name) + 1;
        int secondSpace = indexOfSecondSpace(name);
        if (secondSpace != -1 && firstSpace != -1) {
            return name.substring(firstSpace, secondSpace);
        } else {
            return "";
        }
    }

    public static String generateLastFirstMidInitial(String name) {
        String middleName = findMiddleName(name);
        if (middleName != "") {
            char middleInitial = middleName.charAt(0);
            return "" + findLastName(name) + ", " + findFirstName(name) + " " + middleInitial + ".";
        } else if (findLastName(name) != "") {
            return "" + findLastName(name) + ", " + findFirstName(name);
        } else {
            return "" + findFirstName(name);
        }
    }
}
