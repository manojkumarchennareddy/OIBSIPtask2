import java.util.Random;
import java.util.Scanner;

public class NumberGuessing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int numberToGuess = random.nextInt(100) + 1; // Generate a random number between 1 and 100
        int numGuesses = 0;
        int guess;
        int no_of_Guesses =0; // Set the maximum number of guesses to 10
       
        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I'm thinking of a number between 1 and 100. Can you guess it?");
        System.out.println();
        System.out.print("Enter the number of trails: ");
        no_of_Guesses=scanner.nextInt();
        System.out.println();

        while (numGuesses < no_of_Guesses) {
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();
            numGuesses++;

            if (guess < numberToGuess) {
                System.out.println("Too low! Try again.");
            } else if (guess > numberToGuess) {
                System.out.println("Too high! Try again.");
            } else {
                System.out.println("Congratulations! You guessed the number in " + numGuesses + " guesses.");
                break;
            }
        }

        if (numGuesses == no_of_Guesses) {
            System.out.println("you complete th game in "+no_of_Guesses+"guesses");
        }

        scanner.close();
    }
}

