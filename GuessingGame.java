import java.util.Scanner; //This library helps with getting a users input.
import java.util.Random; //This imports the random library.

public class GuessingGame {
    public static void main(String[] args) {
        Random r = new Random(); // Sets r as the random function.

        Scanner kc = new Scanner(System.in);
        System.out.print("Enter the guess range number: "); //This picks the guess number range Ex. 10.
        int range = kc.nextInt();
        
        int num = r.nextInt(range); // This intialization num as the random number.
                                 // The ten in the bracket makes sures guess is under 10
        while (true) // while loop.
        {
            Scanner sc = new Scanner(System.in); // System.in is a standard input stream.
            System.out.print("Enter Guess: ");
            int guess = sc.nextInt(); // Takes in the users input.

            if (guess == num) // Conditon to win.
            {
                System.out.println("You Win");
                break;
            } 
            else if (guess < num) // Condition if the guess is too low.
            {
                System.out.println("Guess Higher");
            } 
            else // Condition if the guess is too high.
            {
                System.out.println("Guess Lower");
            }
        }
    }
}
