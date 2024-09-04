/*
This small Java program prompts the user to press Enter/Return to roll two dice. 
The values of each die is displayed, along with a notification if the player rolled doubles.
*/
//import statements
import java.util.Scanner;
import java.util.Random;
//RollDice class
public class RollDice{
    public static void main(String[] args) {
        // try loop and declare scanner
        try (Scanner input = new Scanner(System.in)) {
            //Declare and create a Random 
            Random random = new Random();
               System.out.println("Press Enter to roll the dice...");
               //this check the enter is clicked on keyboard to roll the two dice
                input.nextLine();
                //this creates the first dice
               int dice = random.nextInt(6)+1;
               //this creates the second dice
               int diceTwo = random.nextInt(6)+1;
               /*this sees if both are dice equal each other then 
               it will print Rolled the first dice output and the 
               second dice output - doubles!!
               if it doesn't equal then it will print Rolled the first 
               dice output and the second dice output
               */
               if (dice == diceTwo) {
                   System.out.println("");
                }
                else{
                    System.out.println("Rolled " + dice + " and " + diceTwo);
                }
        }



    }
}