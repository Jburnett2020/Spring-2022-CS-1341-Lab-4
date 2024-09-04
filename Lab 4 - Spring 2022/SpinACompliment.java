/*
This Java program uses an array with (at least) five Strings containing compliments.
Prompt the user to press Enter/Return tp spin the compliment wheel, and use 
java.util.Random to generate a random index number from the array and display the 
compliment at that location in the array.
*/
//import statements
import java.util.Scanner;
import java.util.Random;
//SpinACompliment class
public class SpinACompliment{
    public static void main(String[] args) {
        // try loop and declare scanner
        try (Scanner input = new Scanner(System.in)) {
            //uses the random
            Random random = new Random();
            /*
            generate a random number and uses if then statements to 
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
}