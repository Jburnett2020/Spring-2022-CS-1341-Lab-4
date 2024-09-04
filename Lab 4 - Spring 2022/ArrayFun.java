/*This problem includes a looping menu, creation and modifying an array 
of doubles, and multiple methods (including passing an array from one 
method to another.) Follow the pseudocode below to match the sample 
output.
*/
//import statements
import java.util.Scanner;
//ArrayFun class
public class ArrayFun{
    public static void main(String[] args) {
        //declare scanner
        Scanner input = new Scanner(System.in);
        //Print a welcome message and prompt for the size of the double array
        System.out.println("Welcome to Array Fun!");
        System.out.println("                             ");
        System.out.println("How many values would you like in your array?");
        int userInput = input.nextInt();
        //Declare and create a double array of the specified size and prompt user to enter its values.
        double [] numArray = new double [userInput] ;
        for (int i=0; i<userInput; i++) {
            System.out.println("Enter a floating point value #" + (i+1) + ":");
            double userValues = input.nextDouble();
            numArray [i] = userValues;
        }
        /*Within a while loop, display a menu with the four options shown in the 
        sample output. Repeat until the user chooses Exit.
        Option 1 should pass the array to the printArray method
        Option 2 should pass the array to the doubleArray method
        Option 3 should pass the array to the squareArray method
        Option 4 should break out of the loop and end the program
        */
        while (true) {
            System.out.println("                             ");
            System.out.println("Options");
            System.out.println("1. Print array contents");
            System.out.println("2. Double array contents");
            System.out.println("3. Square array contents");
            System.out.println("4. Exit");
            System.out.println("                             ");
            System.out.println("Enter choice: ");
            int userChoice = input.nextInt();
            if (userChoice == 1 ) {
                printArray(numArray);
            } else if (userChoice == 2 ) {
                doubleArray(numArray);
            } else if (userChoice == 3 ) {
                squareArray(numArray);
            } else if (userChoice == 4 ) {
                System.out.println("Goodbye :)" );
                break;
            }
        }

        
        
    }
    /*Loop through the array passed to this method and print each 
    of the double values it contains across one row, formatted as 
    shown in the sample output with a space between each value.
    */
    public static void printArray(double [] arrayOne) {
        System.out.print("The values are: ");
        for (int i=0; i<arrayOne.length; i++) {
            System.out.printf(" %.2f", arrayOne[i]);
        }
    }
    /*Loop through the array passed to this method and double each of 
    its values
    */
    public static void doubleArray(double [] arrayTwo){
        System.out.print("The values are: ");
        for (int i=0; i<arrayTwo.length; i++) {
            arrayTwo[i] = arrayTwo[i] * 2;
        }
    }
    /*Loop through the array passed to this method and square each of 
    its values
    */
    public static void squareArray(double [] arrayThree){
        System.out.print("The values are: ");
        for (int i=0; i < arrayThree.length; i++) {
            arrayThree[i] = arrayThree[i] * arrayThree[i];
        }
    }
}