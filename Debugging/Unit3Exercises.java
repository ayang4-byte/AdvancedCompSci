public class Unit3Exercises {
    // Intended: return the average length of the strings in the array.
    public static double calculateAverageStringLength(String[] strs) {
        double sum = 0;
        int count = 0;
        for (int i = 0; i < strs.length; i++) {
            if (strs[i] != null) {
                sum += strs[i].length();
            } else {
                count = count + 1;
            }
        }
        return sum / (strs.length - count);
    }

    // Intended: produce a new string with the characters of the input reversed.
    public static String reverseString(String str) {
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed = reversed + str.charAt(i);
        }
        return reversed;
    }

    public static int findMaxValue(int[] numbers) {
        int max = numbers[0];
        for (int i = 1; i <= numbers.length; i++) {
            if (numbers[i - 1] > max) {
                max = numbers[i - 1];
            }
        }
        return max;
    }

    // Intended: check whether the input string reads the same forwards and
    // backwards.
    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;
        while (left < right) {
            char a = str.charAt(left);
            char b = str.charAt(right);
            if (a != b) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    // Intended: sum only the even numbers in the array.
    public static int sumEvenNumbers(int[] numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i] % 2 == 0) {
                sum += numbers[i];
            }
        }
        return sum;
    }

    public static int calculateSumOfSquares(int[] numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += Math.pow(numbers[i], 2);
        }
        return sum;
    }

    public static int getNthFibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        int a = 0, b = 1, c;
        for (int i = 1; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return b;
    }

    public static int[] sortArrayDescending(int[] arr) {
        if (arr == null) {
            throw new IllegalArgumentException("Null Array");
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > arr[i]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

    public static String findLongestWord(String sentence) {
        if (sentence == null) {
            throw new IllegalArgumentException("No Sentence");
        } else if (sentence.equals("")) {
            throw new IllegalArgumentException("Empty Sentence");
        }
        String[] words = sentence.split(" ");
        String longestWord = words[0];
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() > longestWord.length()) {
                longestWord = words[i];
            }
        }
        return longestWord;
    }

    public static double calculateInterest(double principal, double rate, int years) {
        if (principal < 0) {
            throw new IllegalArgumentException("Negative Number");
        } else if (rate < 0) {
            throw new IllegalArgumentException("Negative Number");
        } else if (years < 0) {
            throw new IllegalArgumentException("Negative Number");
        }
        for (int i = 0; i < years; i++) {
            principal += principal * (rate / 100);
        }
        return principal;
    }

    public static int parsePositiveInteger(String str) {
        try {
            int number = Integer.parseInt(str);
            if (number < 0) {
                throw new NumberFormatException("Negative");
            }
            return number; // Method should return 1 if it's negative
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return 1;
        }

    }

    public static String getArrayElement(String[] arr, int index) {
        try {
            if (arr == null || index >= arr.length || index < 0) {
                throw new IndexOutOfBoundsException("Out of Bounds");
            }
            return arr[index];
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    public static double calculateSquareRoot(int number) {
        try {
            if (number < 0) {
                throw new NumberFormatException("Negative Number");
            }
            return Math.sqrt(number);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return Double.NaN;
        }
    }

    public static int sumArrayElements(int[] array) {
        try {
            int sum = 0;
            for (int i = 0; i < array.length; i++) {
                sum += array[i];
            }
            return sum;
        } catch (Exception e) {
            System.out.println("Null array");
            return 0;
        }
    }

    public static double calculatePower(double base, int exponent) {
        try {
            if (exponent < 0) {
                throw new IllegalArgumentException("Negative Exponent");
            }
            return Math.pow(base, exponent);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return 1;
        }
    }
}
