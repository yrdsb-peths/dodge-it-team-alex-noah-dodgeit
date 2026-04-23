import greenfoot.*;

public class ResetButton extends Actor
{
    public ResetButton() {
        setImage(new GreenfootImage("RESET GAME", 30, Color.WHITE, Color.RED));
    }

    public void act() {
        if (Greenfoot.mouseClicked(this)) {
            resetGame();
        }
    }

    private void resetGame() {
        // Option A: Just reset the score and clear the world
        Greenfoot.setWorld(new MyWorld()); 
        
        // Option B: Completely restart the World
        // Greenfoot.setWorld(new MyWorld());
    }
}