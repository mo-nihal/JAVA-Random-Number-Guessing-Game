import java.util.Random;

public class GameLogic {
    private int target;

    public GameLogic() {
        Random random = new Random();
        target = random.nextInt(100) + 1; // 1 to 100
    }

    public boolean checkGuess(int guess) {
        return guess == target;
    }

    public String getHint(int guess) {
        if (guess < target) {
            return "Too low!";
        } else if (guess > target) {
            return "Too high!";
        } else {
            return "Correct!";
        }
    }
}
