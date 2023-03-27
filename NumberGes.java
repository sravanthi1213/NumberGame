
import java.util.Random;
import java.util.Scanner;

public class NumberGes {

    public static void main(String[] args) {

        int ans, ges, gesNum = 0;
        final int maxGes = 3;
        String playAgain = "y";

        try (Scanner sc = new Scanner(System.in)) {
            Random generator = new Random();
            ans = generator.nextInt(101) + 1;

            do{
                System.out.println(" Welcome to the game \nGuess a number between 1 and 100");
                System.out.println("Guess a number (0 to quit):");

                ges = sc.nextInt();
                gesNum = 0;
                while (ges != 0) {
                    gesNum++;
                    if (ges == ans) {
                        System.out.println("Perfect! You got it Right!");
                        break;
                    } else if (ges < ans)
                        System.out.println("Opss! Your guess was too LOW, try some higher numbers.");
                    else if (ges > ans)
                        System.out.println("Opps! Your guess was too HIGH, Try some lower numbers");
                    if (gesNum == maxGes) {
                        System.out.println("The number was " + ans + "\nBetter luck next time");
                        break;
                    }
                    System.out.println("Enter your guess (0 to quit):");
                    ges = sc.nextInt();
                }
                System.out.println("Want to Play again?(y/n)");
                playAgain = sc.next();
            }while (playAgain.equals("y") || playAgain.equals("Y")) ;
        }
        System.out.println("Thanks for playing!");
    }
}
