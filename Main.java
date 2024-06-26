import java.util.Random;
import java.util.Scanner;
public class numberguessing{
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            Random random_number = new Random();
            int score = 0;
            boolean playAgain = true;
            while (playAgain) {
                int randomSearchNumber = random_number.nextInt(100) + 1;
                boolean hasGuessedCorrectly = false;

                System.out.println("Guess a number between 1 and 100:");

                for (int numberOfAttempts = 0; numberOfAttempts < 5; numberOfAttempts++) {
                    System.out.println("Enter a number:");
                    int userGuess = scanner.nextInt();

                    if (userGuess == randomSearchNumber) {
                        System.out.println("Congrats, you found it!!! The correct number is " + randomSearchNumber);
                        hasGuessedCorrectly = true;
                        score++;
                        break;
                    } else if (userGuess > randomSearchNumber) {
                        System.out.println("Your guess is high");
                    } else {
                        System.out.println("Your guess is low");
                    }
                }

                if (!hasGuessedCorrectly) {
                    System.out.println("Sorry, you've used all your attempts. The correct number was " + randomSearchNumber);
                }

                System.out.print("Do you want to play again? (yes/no): ");
                playAgain = scanner.next().equalsIgnoreCase("yes");
            }

            System.out.println("Your final score is: " + score);
        }
    }
}
