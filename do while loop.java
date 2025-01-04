import java.util.Scanner;

public class DoWhileExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberToGuess = 7;  // The correct number
        int userGuess;

        do {
            System.out.print("Guess the number (between 1 and 10): ");
            userGuess = scanner.nextInt();

            if (userGuess == numberToGuess) {
                System.out.println("Congratulations! You guessed the correct number.");
            } else {
                System.out.println("Wrong guess, try again!");
            }
        } while (userGuess != numberToGuess);

        scanner.close();
    }
}
