import java.util.Scanner;

import static java.lang.System.exit;
/**
 * @author Dylan O'Connor
 * date 2/07/2023
 * This class produces a sudoku puzzle and asks for user input to solve it.
 */
public class Driver extends Sudoku {

    /**
     * This is the main method
     * This method is a bit complicated. It asks the user to continue playing.
     * After that it prompts the user for a row, column, and value.
     * It then checks the array for a 0 value and if the value entered is the correct value.
     * Program ends once array is solved.
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("\nWelcome to my sudoku game!\n" + "The 0's are where you need to fill in." +
                "\nThe first row and column is 0 when entering a value and the lines count as a row and column.\nHave fun :)\n");

        //this is the array that will be changed as the user enters the values
        Object array1[][] = {
                {" 5", 3, 4, "|", 0, 7, 8, "|", 9, 1, "2\n"},
                {6, 7, 0, "|", 1, 9, 5, "|", 3, 4, "8\n"},
                {1, 9, 8, "|", 3, 4, 2, "|", 5, 0, "7\n"},
                {"-", "-", "-", "+", "-", "-", "-", "+", "-", "-", "-\n"},
                {8, 0, 9, "|", 7, 6, 1, "|", 4, 2, "3\n"},
                {4, 2, 6, "|", 8, 0, 3, "|", 7, 9, 0},
                {"\n 7", 1, 3, "|", 9, 2, 4, "|", 8, 5, "6\n"},
                {"-", "-", "-", "+", "-", "-", "-", "+", "-", "-", "-\n",},
                {9, 0, 1, "|", 5, 3, 7, "|", 2, 8, "4\n"},
                {2, 8, 7, "|", 4, 1, 9, "|", 6, 0, "5\n"},
                {3, 4, 5, "|", 2, 8, 6, "|", 1, 7, "9\n"}};




        Scanner input = new Scanner(System.in);

        Character yes = 'Y';
        Character no = 'N';
        Character con = 'Y';
        while (con.equals(yes)) {

            display(array1); //displays the array at beginning of loop
            System.out.println("\nContinue Playing: (Y/N)?");
            con = input.next().charAt(0);
            if(con.equals(yes)){
                //if continue is yes does nothing
            }
            else if(con.equals(no)){
                System.out.println("Thank you for playing :)");
                exit(0);
                //if user types N stops the proram
            }

            else{
                System.out.println("Invalid Input\n");
                con = 'Y';
                continue;
                //anything other than Y or N goes onto next loop
            }
            //inputs for row and column you would like to access
            System.out.println("Please enter a row:");
            int row = input.nextInt();
            System.out.println("Please enter a column:");
            int col = input.nextInt();

            isRowColumnValid(row, col, array1); //checks if the row and column is valid

            System.out.println("Please enter a value:");
            Object val = input.nextInt();
            int val2 = ((Integer) val).intValue();

            isValueValid(val2); //checks if the value is a valid value 1-9
            isEntryCorrect(row, col, val, array1); //checks if the entry is correct, if so replaces it


            if (isSolved(array1) == true) {
                display(array1); //if the puzzle is solved it displays the puzzle and ends the program
                System.out.println("\nNo more 0's, Congratulations on solving the puzzle");
                exit(0);
            }
            ;
        }
    }
}
    
