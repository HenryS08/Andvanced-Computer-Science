public class TriangleLoops {
    public static void main(String[] args) {
        // to-do: create a separate tester class
        // to-do: invoke each method at least 2 times in the tester class

        // for example:
        System.out.println(createLetterTriangleUp(3, 'A'));
        System.out.println(createLetterTriangleUp(15, 'B'));

    }

    /*
     * The method returns a String by creating rows of letters. Each row prints a number of letters
     * equal to the row number. The total number of rows printed is determined by numberOfRows.
     * 
     * @param numberOfRows the number of rows in the triangle
     * 
     * @param letter the letter to be printed
     * 
     * @return a String of letters in the shape of a triangle
     */

    // to-do: implement createLetterTriangleUp
    public static String createLetterTriangleUp(int numberOfRows, char letter) {
        String triangle = "";
        for (int i = 0; numberOfRows > i; i++) {
            for (int j = -1; i > j; j++) {
                triangle = triangle + letter;
            }
            triangle = triangle + "\n";
        }
        return triangle;
    }

    /*
     * The method returns a String by creating rows of letters. Each row prints a number of letters
     * equal to the total number of rows, descending downward. The total number of rows printed is
     * determined by numberOfRows.
     * 
     * @param numberOfRows the number of rows in the triangle
     * 
     * @param letter the letter to be printed
     * 
     * @return a String of letters in the shape of a triangle
     */
    // to-do: implement createLetterTriangleDown
    public static String createLetterTriangleDown(int numberOfRows, char letter) {
        String triangle = "";
        for (int i = 0; numberOfRows > i; i++) {
            for (int j = numberOfRows; i < j; j--) {
                triangle = triangle + letter;
            }
            triangle = triangle + "\n";
        }
        return triangle;
    }

    /*
     * This method returns a String of a number triangle. The number of rows in the triangle is
     * determined by the numberOfRows, and the number used in each row is determined by the row
     * number.
     * 
     * @param numberOfRows the number of rows in the triangle
     * 
     * @return a String of numbers in the shape of a triangle
     */
    // to-do: implement createNumbersTriangle
    public static String createNumbersTriangle(int numberOfRows) {
        String triangle = "";
        for (int i = 0; numberOfRows > i; i++) {
            for (int j = -1; i > j; j++) {
                triangle = triangle + (i + 1);
            }
            triangle = triangle + "\n";
        }
        return triangle;
    }

    /*
     * The method returns a String by creating a pyramid pattern using the alphabet. The method
     * determines the height of the pyramid by using the int numberOfRows.
     * 
     * @param numberOfRows the number of rows in the triangle
     * 
     * @return a String of letters in the shape of a pyramid
     */
    // to-do: implement createAlphabetTriangle
    public static String createAlphabetTriangle(int numberOfRows) {
        String triangle = "";
        if (numberOfRows > 26) {
            numberOfRows = 26;
        }
        for (int i = 0; numberOfRows > i; i++) {
            for (int j = numberOfRows - 1; i < j; j--) {
                triangle = triangle + "*";
            }
            for (int k = 1; k - 1 < i + 1; k++) {
                triangle = triangle + (char) (64 + k);
            }
            for (int l = 0; l + 1 < i + 1; l++) {
                triangle = triangle + (char) (64 + i - l);
            }
            triangle = triangle + "\n";
        }
        return triangle;
    }

}
