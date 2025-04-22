public class GameUI {
    public void showWelcome() {
        System.out.println("🎯 Welcome to the Number Guessing Game!");
        System.out.println("Guess a number between 1 and 100.");
    }

    public void showFeedback(String message) {
        System.out.println(message);
    }

    public void showSuccess() {
        System.out.println("🎉 Congratulations! You guessed it right.");
    }
}
