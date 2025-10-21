public class TriangleLoops {
    public static void main(String[] args) {
        // to-do: create a separate tester class
        // to-do: invoke each method at least 2 times in the tester class

        // for example:
        System.out.println(createLetterTriangleUp(3, 'A'));
        System.out.println(createLetterTriangleDown(3, 'B'));
        System.out.println(createNumbersTriangle(4));
        System.out.println(createAlphabetTriangle(42));

    }

    /*
     * The method returns a String by creating rows of letters. Each row prints a
     * number of letters equal to the row number. The total number of rows printed
     * is determined by numberOfRows.
     * @param numberOfRows the number of rows in the triangle
     * @param letter the letter to be printed
     * @return a String of letters in the shape of a triangle
     */

    // to-do: implement createLetterTriangleUp
    public static String createLetterTriangleUp(int numberOfRows, char letter) {
        String triangle = "";
        for (int i = 0; i < numberOfRows; i++) {
            for (int j = 0; j <= i; j++) {
                triangle = triangle + letter;
            }
            triangle = triangle + "\n";
        }
        return triangle;
    }

    /*
     * The method returns a String by creating rows of letters. Each row prints a
     * number of letters equal to the total number of rows, descending downward. The
     * total number of rows printed is determined by numberOfRows.
     * @param numberOfRows the number of rows in the triangle
     * @param letter the letter to be printed
     * @return a String of letters in the shape of a triangle
     */
    // to-do: implement createLetterTriangleDown
    public static String createLetterTriangleDown(int numberOfRows, char letter) {
        String triangle = "";
        for (int i = numberOfRows; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                triangle = triangle + letter;
            }
            triangle = triangle + "\n";
        }
        return triangle;
    }

    /*
     * This method returns a String of a number triangle. The number of rows in the
     * triangle is determined by the numberOfRows, and the number used in each row
     * is determined by the row number.
     * @param numberOfRows the number of rows in the triangle
     * @return a String of numbers in the shape of a triangle
     */
    // to-do: implement createNumbersTriangle
    public static String createNumbersTriangle(int numberOfRows) {
        String triangle = "";
        for (int i = 1; i <= numberOfRows; i++) {
            for (int j = 1; j <= i; j++) {
                triangle = triangle + i + " ";
            }
            triangle = triangle + "\n";
        }
        return triangle;
    }

    /*
     * The method returns a String by creating a pyramid pattern using the alphabet.
     * The method determines the height of the pyramid by using the int
     * numberOfRows.
     * @param numberOfRows the number of rows in the triangle
     * @return a String of letters in the shape of a pyramid
     */
    // to-do: implement createAlphabetTriangle
    public static String createAlphabetTriangle(int numberOfRows) {
        String triangle = "";
        int lastInt = 0;
        numberOfRows -= 1;
        if (numberOfRows >= 26) {
            numberOfRows = 25;
        }
        for (int i = 0; i <= numberOfRows; i++) {
            for (int j = 0; j < numberOfRows - i; j++) {
                triangle = triangle + " ";
            }
            for (int j = 65; (j - 64) <= i + 1; j++) {
                triangle = triangle + (char) j;
                lastInt = j;
            }
            for (int j = lastInt - 1; j > 64; j--) {
                triangle = triangle + (char) j;
            }
            triangle = triangle + "\n";
        }
        return triangle;
    }

}