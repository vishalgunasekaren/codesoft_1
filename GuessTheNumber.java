import java.util.Scanner;
import java.util.Random;

public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int min = 1;
        int max = 100;
        int attempts = 10;
        int score = 0;

        boolean playAgain = true;

        while (playAgain) {
            int randomNumber = random.nextInt(max - min + 1) + min;
            System.out.println("Welcome to the Guess the Number Game!");
            System.out.println("I have selected a number between " + min + " and " + max + ".");
            System.out.println("You have " + attempts + " attempts to guess it.");

            for (int i = 1; i <= attempts; i++) {
                System.out.print("Attempt " + i + ": Enter your guess: ");
                int userGuess = scanner.nextInt();

                if (userGuess == randomNumber) {
                    System.out.println("Congratulations! You guessed the correct number.");
                    score++;
                    break;
                } else if (userGuess < randomNumber) {
                    System.out.println("Too low! Try again.");
                } else {
                    System.out.println("Too high! Try again.");
                }

                if (i == attempts) {
                    System.out.println("Sorry, you've run out of attempts. The correct number was: " + randomNumber);
                }
            }

            System.out.println("Your score: " + score);
            System.out.print("Do you want to play again? (yes/no): ");
            String playAgainChoice = scanner.next();

            if (!playAgainChoice.equalsIgnoreCase("yes")) {
                playAgain = false;
            }
        }

        System.out.println("Thank you for playing Guess the Number!");
        scanner.close();
    }
}
