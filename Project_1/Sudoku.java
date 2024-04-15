import java.util.Arrays;

/**
 * @author Dylan O'Connor
 * date 2/07/2023
 * This class contains all the methods used in the main method
 */

public class Sudoku {
    /**
     * This is the display method calling a 2D array
     * This used for loops that goes through the 2D array and prints it
     * @param array
     */
    public static void display(Object array[][]) {
        for (int row = 0; row < array.length; row++) {
            for (int ind = 0; ind < array[row].length; ind++) {
                System.out.print(array[row][ind] + " ");
            }
        }
    }

    /**
     * This is the isSolved method calling a 2D array
     * In this method there is an array with the correct values.
     * It then calls a 2D array to be compared
     * returns a boolean true or false
     * @param array
     */
    public static boolean isSolved(Object array[][]) {
        //below is the solved array being compared
        Object solved[][] = {
                {" 5", 3, 4, "|", 6, 7, 8, "|", 9, 1, "2\n"},
                {6, 7, 2, "|", 1, 9, 5, "|", 3, 4, "8\n"},
                {1, 9, 8, "|", 3, 4, 2, "|", 5, 6, "7\n"},
                {"-", "-", "-", "+", "-", "-", "-", "+", "-", "-", "-\n"},
                {8, 5, 9, "|", 7, 6, 1, "|", 4, 2, "3\n"},
                {4, 2, 6, "|", 8, 5, 3, "|", 7, 9, 1},
                {"\n 7", 1, 3, "|", 9, 2, 4, "|", 8, 5, "6\n"},
                {"-", "-", "-", "+", "-", "-", "-", "+", "-", "-", "-\n",},
                {9, 6, 1, "|", 5, 3, 7, "|", 2, 8, "4\n"},
                {2, 8, 7, "|", 4, 1, 9, "|", 6, 3, "5\n"},
                {3, 4, 5, "|", 2, 8, 6, "|", 1, 7, "9\n"}};
        boolean result = Arrays.deepEquals(array, solved); //this checks if the array in the main method is the same as the solved array
        return result;

    }

    /**
     * This is the isValueValid method calling val2
     * This just checks to see if the value entered is between 1-9
     * @param val2
     */
    public static void isValueValid(int val2){
        if(val2 > 9 || val2 < 1){ //checks if the value is 1-9
            System.out.println("\nInvalid value");
        }
    }
    /**
     * This is the isRowColumnValid method calling row, col, and array
     * This method checks to make sure the user does not go out of the boundary of the array
     * It then checks the array value to see if it is a 0
     * @param row
     * @param col
     * @param array
     */
    public static void isRowColumnValid(int row, int col, Object array[][]){
        if(row>=0 && row<=10 && col>=0 && col<=10){ //this checks if the row and column is in the parameters
            if(array[row][col].equals(0)){ //this checks if the array value is 0
                System.out.println("\n0 value found\n");
            }
            else{
                System.out.println("\nNo 0 value found\n");
            }
        }

    }

    /**
     * This is the isEntryCorrect method calling row, col, val, and array.
     * This method creates a new array that is the solved puzzle.
     * it then checks the user entered value with the new solved array.
     * @param row
     * @param col
     * @param val
     * @param array
     */
    public static void isEntryCorrect(int row, int col, Object val, Object array[][]){
        //this is another array that is used to compare with each value given to see if the value entered is correct
        Object solved2[][] = {
                {" 5", 3, 4, "|", 6, 7, 8, "|", 9, 1, "2\n"},
                {6, 7, 2, "|", 1, 9, 5, "|", 3, 4, "8\n"},
                {1, 9, 8, "|", 3, 4, 2, "|", 5, 6, "7\n"},
                {"-", "-", "-", "+", "-", "-", "-", "+", "-", "-", "-\n"},
                {8, 5, 9, "|", 7, 6, 1, "|", 4, 2, "3\n"},
                {4, 2, 6, "|", 8, 5, 3, "|", 7, 9, 1},
                {"\n 7", 1, 3, "|", 9, 2, 4, "|", 8, 5, "6\n"},
                {"-", "-", "-", "+", "-", "-", "-", "+", "-", "-", "-\n",},
                {9, 6, 1, "|", 5, 3, 7, "|", 2, 8, "4\n"},
                {2, 8, 7, "|", 4, 1, 9, "|", 6, 3, "5\n"},
                {3, 4, 5, "|", 2, 8, 6, "|", 1, 7, "9\n"}};
        if(val == (solved2[row][col])){ //checks if the value is equal to the solved one
            System.out.println("\nCorrect value\n");
            array[row][col] = val; //replace the 0 value in the array with the value there
        }
        else{
            System.out.println("\nIncorrect Value\n");
        }
    }

}
