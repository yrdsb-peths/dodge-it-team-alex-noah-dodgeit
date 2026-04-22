     import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Hero here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Hero extends Actor
{
    public Hero()
    {
        GreenfootImage image = new GreenfootImage("man.png");
        setImage(image);
    }
    
    boolean atTop = true;
    
    public void act()
    {
        if (Greenfoot.isKeyDown("up")) {
        setRotation(270);
        move(20);
        }
        if (Greenfoot.isKeyDown("down")) {
            setRotation(90);
            move(20);
        }
    }
}
