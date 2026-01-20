import java.util.ArrayList;

public class Unit4Exercises {

    // Method 1: matchingEndSequences
    public static boolean matchingEndSequences(int[] nums, int n) {
        // to-do: implement the method
        for (int i = 0; i < n; i++) {
            if (nums[i] != nums[nums.length - n - 1]) {
                return false;
            }
        }
        return true;
    }

    // Method 2: hasThreeConsecutive
    public static boolean hasThreeConsecutive(int[] nums) {
        // to-do: implement the method
        for (int i = 0; i < nums.length - 3; i++) {
            if (nums[i] % 2 == 1 && nums[i + 1] % 2 == 1 && nums[i + 1] % 2 == 1) {
                return true;
            } else if (nums[i] % 2 == 0 && nums[i + 1] % 2 == 0 && nums[i + 1] % 2 == 0) {
                return true;
            }
        }
        return false;
    }

    // Method 3: generateNumberSequence
    public static int[] generateNumberSequence(int start, int end) {
        // to-do: implement the method
        int[] nums = new int[end - start];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = i + start;
        }
        return nums;
    }

    // Method 4: fizzBuzz
    public static String[] fizzBuzz(int start, int end) {
        // to-do: implement the method
        String[] nums = new String[end - start];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = "" + (i + start) + "";
            if ((i + start) % 3 == 0 && (i + start) % 5 == 0) {
                nums[i] = "FizzBuzz";
            } else if ((i + start) % 3 == 0) {
                nums[i] = "Fizz";
            } else if ((i + start) % 5 == 0) {
                nums[i] = "Buzz";
            }
        }
        return nums;
    }

    // Method 5: moveEvenBeforeOdd
    public static int[] moveEvenBeforeOdd(int[] nums) {
        // to-do: implement the method
        int[] newNums = new int[nums.length];
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                newNums[i] = nums[i];
            }
            count = i;
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 1) {
                newNums[i + count - 1] = nums[i];
            }
        }
        return newNums;
    }

    // ArrayList Methods

    // Method 1: noNegatives
    public static ArrayList<Integer> noNegatives(ArrayList<Integer> nums) {
        // to-do: implement the method
        return new ArrayList<>();

    }

    // Method 2: excludeTeenNumbers
    public static ArrayList<Integer> excludeTeenNumbers(ArrayList<Integer> nums) {
        // to-do: implement the method
        return new ArrayList<>();
    }

    // Method 3: appendY
    public static ArrayList<String> appendY(ArrayList<String> strs) {
        // to-do: implement the method
        return new ArrayList<>();
    }

    // Method 4: squarePlus10
    public static ArrayList<Integer> squarePlus10(ArrayList<Integer> nums) {
        // to-do: implement the method
        return new ArrayList<>();
    }

}