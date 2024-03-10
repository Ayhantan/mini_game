package snakegame;

public class LevelManager {
    private final int SPEED_INCREASE_FACTOR = 2;

    public int updateSpeed(int score, int initialDelay) {
        return initialDelay - score * SPEED_INCREASE_FACTOR;
    }
}

