import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int maxAttempts = 5; // Number of attempts allowed (point 5)
        int score = 0; // User's score (point 7)
        boolean playAgain = true;

        while (playAgain) {
            // Generate random number (point 1)
            int randomNumber = random.nextInt(100) + 1; // Range 1 to 100

            int attempts = 0; // Number of attempts used in this round
            boolean guessedCorrect = false;

            while (attempts < maxAttempts && !guessedCorrect) {
                System.out.println("Guess a number between 1 and 100 (Attempts: " + attempts + "): ");
                int guess = scanner.nextInt();

                attempts++;

                if (guess == randomNumber) {
                    guessedCorrect = true;
                    score++; // Increase score for correct guess (point 7)
                    System.out.println("Congratulations! You guessed the number in " + attempts + " attempts.");
                } else if (guess < randomNumber) {
                    System.out.println("Too low. Try again.");
                } else {
                    System.out.println("Too high. Try again.");
                }
            }

            if (!guessedCorrect) {
                System.out.println("You ran out of attempts. The number was: " + randomNumber);
            }

            System.out.println("Do you want to play again? (y/n): ");
            char choice = scanner.next().charAt(0);
            playAgain = choice == 'y' || choice == 'Y';
        }

        System.out.println("Thanks for playing! Your final score is: " + score);
        scanner.close();
    }
}
