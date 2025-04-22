import java.util.Scanner;

public class Player {
    private Scanner scanner;

    public Player() {
        scanner = new Scanner(System.in);
    }

    public int getUserGuess() {
        System.out.print("Enter your guess (1 to 100): ");
        while (!scanner.hasNextInt()) {
            System.out.print("Please enter a valid number: ");
            scanner.next(); // Skip invalid input
        }
        return scanner.nextInt();
    }
}
