import greenfoot.*;

public class Counter extends Actor
{
    public int score = 0;
    // Adding 'static' makes this value persist across different worlds/runs
    public static int highScore = 0; 

    public Counter() {
        updateImage();
    }

    public void add(int points) {
        score += points;
        if (score > highScore) {
            highScore = score;
        }
        updateImage();
    }

    // You no longer need resetScore() if you are using Option B, 
    // because the new Counter instance will naturally start at score = 0.

    private void updateImage() {
        String text = "Score: " + score + " | High Score: " + highScore;
        setImage(new GreenfootImage(text, 24, Color.WHITE, Color.BLACK));
    }
}