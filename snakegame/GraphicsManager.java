package snakegame;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

public class GraphicsManager {
    public void doDrawing(Graphics g, boolean inGame, int B_WIDTH, int B_HEIGHT, int apple_x, int apple_y, int dots,
            int[] x, int[] y, Image ball, Image head, Image apple, int score, int highScore) {
        if (inGame) {
            g.drawImage(apple, apple_x, apple_y, null);
            for (int z = 0; z < dots; z++) {
                if (z == 0) {
                    g.drawImage(head, x[z], y[z], null);
                } else {
                    g.drawImage(ball, x[z], y[z], null);
                }
            }
            g.setColor(Color.WHITE);
            g.drawString("Score: " + score, 10, 10);
            g.drawString("High Score: " + highScore, 10, 25);
            Toolkit.getDefaultToolkit().sync();
        } else {
            gameOver(g, B_WIDTH, B_HEIGHT, score, highScore);
        }
    }

    private void gameOver(Graphics g, int B_WIDTH, int B_HEIGHT, int score, int highScore) {
        String msg = "Game Over";
        Font small = new Font("Helvetica", Font.BOLD, 14);
        FontMetrics metr = g.getFontMetrics(small);
        g.setColor(Color.WHITE);
        g.setFont(small);
        g.drawString(msg, (B_WIDTH - metr.stringWidth(msg)) / 2, B_HEIGHT / 2);
        g.drawString("Score: " + score, (B_WIDTH - metr.stringWidth("Score: " + score)) / 2, B_HEIGHT / 2 + 20);
        g.drawString("High Score: " + highScore, (B_WIDTH - metr.stringWidth("High Score: " + highScore)) / 2,
                B_HEIGHT / 2 + 40);
    }
}

