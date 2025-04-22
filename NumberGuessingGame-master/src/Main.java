public class Main {
    public static void main(String[] args) {
        GameLogic logic = new GameLogic();
        Player player = new Player();
        GameUI ui = new GameUI();

        ui.showWelcome();

        boolean guessedCorrectly = false;

        while (!guessedCorrectly) {
            int guess = player.getUserGuess();
            guessedCorrectly = logic.checkGuess(guess);
            ui.showFeedback(logic.getHint(guess));
        }

        ui.showSuccess();
    }
}