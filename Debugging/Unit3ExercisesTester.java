public class Unit3ExercisesTester {
    public static void testCalculateStringLengthAverage() {
        // Test Case - Main Case
        String[] letters = { "abc", "cde", "efg", "hij" };
        // expected output: 3.0
        System.out.println("Expected 3.0: " + Unit3Exercises.calculateAverageStringLength(letters));

        // Test Case - Edge Case: Null element array
        letters = new String[] { "abc", "cde", "efg", null, "hij" };
        // expected output: 3.0
        System.out.println("Expected 3.0: " + Unit3Exercises.calculateAverageStringLength(letters));

        // Test Case - Edge Case: Null array
        try {
            letters = null;
            // expected output: 0
            System.out.println("Expected exception: " + Unit3Exercises.calculateAverageStringLength(letters));
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println("The method threw an exception when the array was null, as intended");
        }
    }

    public static void testReverseString() {
        // Test Case - Main Case
        String testString = "abc";
        System.out.println("Expected cba: " + Unit3Exercises.reverseString(testString));

        // Test Case - Edge Case: String with spaces at the end and in the middle
        testString = " ab c ";
        System.out.println("Expected ' c ba ': " + Unit3Exercises.reverseString(testString));

        // Test Case - Edge Case: String with special characters
        testString = "a1b!c&";
        System.out.println("Expected '&c!b1a': " + Unit3Exercises.reverseString(testString));

        // Test Case - Edge Case: Null string
        try {
            testString = null;
            System.out.println("Expected exception: " + Unit3Exercises.reverseString(testString));
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println("The method threw an exception when the string was null, as intended");
        }
    }

    public static void testFindMaxValue() {
        int[] numbers = { -1, -2, -3, -4, -9, -6, -7, -8, -9 };
        System.out.println("Expected 9: " + Unit3Exercises.findMaxValue(numbers));

        try {
            int[] testInt = null;
            System.out.println("Expected exception: " + Unit3Exercises.findMaxValue(testInt));
        } catch (Exception e) {
            System.out.println((e.toString()));
            System.out.println("This method has a problem");
        }
    }

    public static void testIsPalindrome() {
        try {
            System.out.println(Unit3Exercises.isPalindrome(null));
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println("Something went wrong.");
        }

    }

    public static void testSumEvenNumbers() {
        int[] numbers = { 1, -2, -3, -4, 5, -6, 7, -8, 9 };
        try {
            System.out.println(Unit3Exercises.sumEvenNumbers(numbers));
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println("Something went wrong");
        }
    }

    public static void testCalculateSumOfSquares() {
        int[] numbers = null;
        try {
            System.out.println(Unit3Exercises.calculateSumOfSquares(numbers));
        } catch (Exception e) {
            System.out.println("Hello");
            // if (numbers == null) {
            // throw new IllegalArgumentException("Bad");
            // }
        }
    }

    public static void testGetNthFibonacci() {
        int n = 69;
        if (n < 0) {
            throw new IllegalArgumentException("Not Good");
        }
        System.out.println(Unit3Exercises.getNthFibonacci(n));
    }

    public static void testSortArrayDescending() {
        int[] numbers = { 1, 2, 3, 4, 5 };
        for (int i = 0; i < numbers.length; i++) {
            System.out.println((Unit3Exercises.sortArrayDescending(numbers))[i]);
        }
    }

    public static void testFindLongestWord() {
        System.out.println(Unit3Exercises.findLongestWord("The quick brown fox jumps over the lazy dog."));
    }

    public static void testCalculateInterest() {
        System.out.println(Unit3Exercises.calculateInterest(500, 50, 2));
    }

    public static void testParsePositiveInteger() {
        System.out.println(Unit3Exercises.parsePositiveInteger("-7"));
    }

    public static void testGetArrayElement() {
        System.out.println(Unit3Exercises.getArrayElement(null, 0));
    }

    public static void testCalculateSquareRoot() {
        System.out.println(Unit3Exercises.calculateSquareRoot(25));
    }

    public static void testSumArrayElements() {
        System.out.println(Unit3Exercises.sumArrayElements(null));
    }

    public static void testCalculatePower() {
        System.out.println(Unit3Exercises.calculatePower(5, 2));
    }

    public static void main(String[] args) {
        testCalculateStringLengthAverage();
        testReverseString();
        testFindMaxValue();
        testIsPalindrome();
        testSumEvenNumbers();
        testCalculateSumOfSquares();
        testGetNthFibonacci();
        testSortArrayDescending();
        testFindLongestWord();
        testCalculateInterest();
        testParsePositiveInteger();
        testGetArrayElement();
        testCalculateSquareRoot();
        testSumArrayElements();
        testCalculatePower();
    }
}
