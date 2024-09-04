/*
This program reuses the code you created in the previous two problems (RollDice and
SpinACompliment) to allow the user to repeatedly choose to Roll, Spin, or Exit. The loop
containing the user prompt should be in the main method, and roll Dice and spin a compliment
should each be in their own separate method that is called from main. The variables containing
the Scanner and Random objects should be declared as static outside the main method so they can
be used in all three methods.
*/
//import statements
import java.util.Scanner;
import java.util.Random;
//RollSpin class
public class RollSpin{
    //Declare and create a Scanner as static
    static Scanner input = new Scanner(System.in);
    //Declare and create a Random as static
    static Random random = new Random();
    //main class
    public static void main(String[] args) {
        /*Within a do while loop, prompt the user to Roll, Spin, or Exit. Repeat 
        until the user chooses Exit.
        If the user chooses Roll, call the rollDice method
        If the user choose Spin, call the spinACompliment method
        If the user chooses Exit, break out of the loop end end the
        program
        */
        do {
            System.out.println("Roll, Spin, or exit? (R/S/X)");
            String userInput = input.nextLine();
            if (userInput.equalsIgnoreCase("R")) {
                rollDice();
            }
            if (userInput.equalsIgnoreCase("S")) {
                spinACompliment();
            }
            if (userInput.equalsIgnoreCase("X")) {
                System.out.println("Goodbye :)");
                break;
            }
        }
        while(true);
        
    }
    //rollDice class
    public static void rollDice(){
        //this check the enter is clicked on keyboard to roll the two dice
        System.out.println("Press Enter to roll the dice...");
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
                System.out.println("Rolled " + dice + " and " + diceTwo + "  - doubles!!");
                }
            else{
                System.out.println("Rolled " + dice + " and " + diceTwo);
            }
    }
    ////SpinACompliment class
    public static void spinACompliment(){
        /* generate a random number and uses if then statements to 
        determine the outcome and the outcome prints a compliment 
        */
            System.out.println("Press Enter to spin the compliment wheel...");
            input.nextLine();
            int spin = random.nextInt(5)+1;
            if (spin==1) {
                System.out.println("You're swell!");
                }
            else if (spin==2){
                System.out.println("You...are...amazing!");
                }
            else if (spin==3){
                System.out.println("You are so fun!");
                }
            else if (spin==4){
                System.out.println("You are so nice!");
                }
            else if (spin==5) {
                System.out.println("You are Amesome!");
                }
        }
}