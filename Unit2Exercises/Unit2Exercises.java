public class Unit2Exercises {
    public static String alarmClock(int day, boolean vacation) {
        if (vacation == true) {
            if (day == 0 || day == 6) {
                return "off";
            } else {
                return "10:00";
            }
        } else {
            if (day == 0 || day == 6) {
                return "10:00";
            } else {
                return "7:00";
            }
        }
    }

    public static boolean love6(int a, int b) {
        if (a == 6 || b == 6 || (a + b) == 6 || Math.abs(a - b) == 6) {
            return true;
        }
        return false;
    }

    public static int redTicket(int a, int b, int c) {
        if (a == 2 && b == 2 && c == 2) {
            return 10;
        } else if (a == b && b == c) {
            return 5;
        } else if (b != a && c != a) {
            return 1;
        }
        return 0;
    }

    public static String fizzString(String str) {
        if (str.length() == 0) {
            return str;
        }
        if (str.substring(0, 1).equals("f") && str.substring(str.length() - 1).equals("b")) {
            return "FizzBuzz";
        } else if (str.substring(0, 1).equals("f")) {
            return "Fizz";
        } else if (str.substring(str.length() - 1).equals("b")) {
            return "Buzz";
        }
        return str;
    }

    public static String doubleChar(String str) {
        String newString = "";
        for (int i = 0; i < str.length(); i++) {
            newString = newString + str.substring(i, i + 1) + str.substring(i, i + 1);
        }
        return newString;
    }

    public static int countHi(String str) {
        int count = 0;
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.substring(i, i + 2).equals("hi")) {
                count = count + 1;
            }
        }
        return count;
    }

    public static boolean catDog(String str) {
        int catCount = 0;
        int dogCount = 0;
        for (int i = 0; i < str.length() - 2; i++) {
            if (str.substring(i, i + 3).equals("cat")) {
                catCount = catCount + 1;
            }
        }
        for (int i = 0; i < str.length() - 2; i++) {
            if (str.substring(i, i + 3).equals("dog")) {
                dogCount = dogCount + 1;
            }
        }
        if (catCount == dogCount) {
            return true;
        }
        return false;
    }

    public static String mixString(String a, String b) {
        int count = 0;
        String newString = "";
        if (a.length() < b.length()) {
            for (int i = 0; i < a.length(); i++) {
                newString = newString + a.substring(i, i + 1) + b.substring(i, i + 1);
                count = count + 1;
            }
            newString = newString + b.substring(count);
        } else {
            for (int i = 0; i < b.length(); i++) {
                newString = newString + a.substring(i, i + 1) + b.substring(i, i + 1);
                count = count + 1;
            }
            newString = newString + a.substring(count);
        }
        return newString;

    }

    public static String repeatEnd(String str, int n) {
        String newString = "";
        for (int i = 0; i < n; i++) {
            newString = newString + str.substring(str.length() - n);
        }
        return newString;
    }

    public static boolean endOther(String a, String b) {
        a = a.toLowerCase();
        b = b.toLowerCase();
        if (a.length() > b.length()) {
            if (a.substring(a.length() - b.length()).equals(b)) {
                return true;
            }
        } else {
            if (b.substring(b.length() - a.length()).equals(a)) {
                return true;
            }
        }
        return false;
    }

    public static int countCode(String str) {
        int count = 0;
        for (int i = 0; i < str.length() - 3; i++) {
            if (str.substring(i, i + 2).equals("co") && str.substring(i + 3, i + 4).equals("e")) {
                count = count + 1;
            }
        }
        return count;
    }

    public static int countEvens(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                count = count + 1;
            }
        }
        return count;
    }

    public static int bigDiff(int[] nums) {
        int max = 0;
        int min = nums[0];
        for (int i = 0; i < nums.length; i++) {
            max = Math.max(max, nums[i]);
            min = Math.min(min, nums[i]);
        }
        return max - min;
    }

    public static int sum13(int[] nums) {
        int sum = 0;
        if (nums == null) {
            return 0;
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 13) {
                break;
            }
            sum = sum + nums[i];
        }
        return sum;
    }

    public static int[] fizzArray(int n) {
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = i;
        }
        return array;
    }

    public static boolean haveThree(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 3 && nums[i] != nums[i + 1]) {
                count = count + 1;
            }
        }
        if (nums[nums.length - 1] == 3) {
            count = count + 1;
        }
        if (count == 3) {
            return true;
        }
        return false;
    }

    public static String[] fizzArray2(int n) {
        String[] array = new String[n];
        for (int i = 0; i < n; i++) {
            array[i] = "" + i;
        }
        return array;
    }

    public static int[] zeroFront(int[] nums) {
        int count = 0;
        int otherCounter = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                count = count + 1;
            }
        }
        int[] array = new int[nums.length];
        if (count == 0) {
            for (int i = 0; i < array.length - count; i++) {
                if (nums[i] != 0) {
                    array[otherCounter + count] = nums[i];
                    otherCounter += 1;
                }
            }
            if (nums[nums.length - 1] != 0) {
                array[nums.length - 1] = nums[nums.length - 1];
            }
            for (int i = 0; i < count; i++) {
                array[i] = 0;
            }
            return array;
        }
        for (int i = 0; i < array.length - count + 1; i++) {
            if (nums[i] != 0) {
                array[otherCounter + count] = nums[i];
                otherCounter += 1;
            }
        }
        if (nums[nums.length - 1] != 0) {
            array[nums.length - 1] = nums[nums.length - 1];
        }
        for (int i = 0; i < count; i++) {
            array[i] = 0;
        }
        return array;
    }

    public static String[] wordsWithout(String[] words, String target) {
        int count = 0;
        for (int i = 0; i < words.length; i++) {
            if (words[i].equals(target)) {
                count = count + 1;
            }
        }
        String[] array = new String[words.length - count];
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < words.length; j++) {
                if (! words[j].equals(target)) {
                    array[i] = words[j];
                    break;
                }
            } 
        }
        return array;
    }

    public static int scoresAverage(int[] scores) {
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < (scores.length / 2); i++) {
            sum1 = sum1 + scores[i];
        }
        for (int i = 0; i < (scores.length / 2); i++) {
            sum2 = sum2 + scores[i + (scores.length / 2)];
        }
        if (sum1 > sum2) {
            sum1 = sum1 / (scores.length / 2);
            return sum1;
        } else {
            return sum2 / (scores.length / 2);
        }
    }

    public static boolean scoresIncreasing(int[] scores) {
        for (int i = 0; i < scores.length - 1; i++) {
            if (scores[i + 1] < scores[i]) {
                return false;
            }
        }
        return true;
    }

    public static int scoresSpecial(int[] a, int[] b) {
        int maxA = 0;
        int maxB = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 10 == 0) {
                maxA = Math.max(maxA, a[i]);
            }
        }
        for (int i = 0; i < b.length; i++) {
            if (b[i] % 10 == 0) {
                maxB = Math.max(maxB, b[i]);
            }
        }
        return maxA + maxB;
    }

    public static String firstTwo(String str) {
        if (str.length() >= 2) {
            return str.substring(0, 2);
        } else if (str.length() == 1) {
            return str.substring(0) + "*";
        }
        return "**";
    }

    public static double divide(int a, int b) {
        if (a == 0 || b == 0) {
            return 0.0;
        }
        if (a > b) {
            return (double) a / b;
        }
        return (double) b / a;
    }
}
