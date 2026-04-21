import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Baby here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Baby extends Actor
{
    /**
     * Act - do whatever the Baby wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Baby()
    {
        GreenfootImage image = new GreenfootImage("baby2.png");
        setImage(image);
    }
    
    public void act()
    {
        // Add your action code here.
        move(-20);
        
        if(getX() <= 0)
        {
            resetBaby();
        }
        
        if(isTouching(Hero.class))
        {
            Ambulance weewoo = new Ambulance();
            getWorld().addObject(weewoo, 300, 200);
            //weewooo.scale(200,200);
            getWorld().removeObject(this);
        }
    }
    
    public void resetBaby()
    {
        int num = Greenfoot.getRandomNumber(2);
        if(num == 0)
        {
            setLocation(600,100);
        }
        else
        {
            setLocation(600,300);
        }
    }
}
