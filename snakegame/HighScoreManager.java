package snakegame;

public class HighScoreManager {
    private int highScore = 0;

    public int updateHighScore(int score) {
        if (score > highScore) {
            highScore = score;
        }
        return highScore;
    }
}
