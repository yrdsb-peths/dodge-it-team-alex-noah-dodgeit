import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Counter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Counter extends Actor
{
    /**
     * Act - do whatever the Counter wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public int score = 0;
    public Counter() {
        updateImage();
    }

    public void add(int points) {
        score += points;
        updateImage();
    }

    private void updateImage() {
        setImage(new GreenfootImage("Score: " + score, 24, Color.WHITE, Color.BLACK));
    }
    
    public void act()
    {
        // Add your action code here.
        
    }
    
}
