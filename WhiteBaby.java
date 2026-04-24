import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class WhiteBaby here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WhiteBaby extends Actor
{
    Counter c;
    /**
     * Act - do whatever the WhiteBaby wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public WhiteBaby()
    {
        GreenfootImage image = new GreenfootImage("baby1.png");
        setImage(image);
    }
    public void act()
    {
        // Add your action code here.
        if (getWorld() == null) 
        {
         return;   
        }
        if(!isTouching(Hero.class))
        {
            move(-30);
        }
        else
        {
            move(0);
        }
        
        if(getX() <= 0)
        {
            resetBaby();
        }
        
        if(c == null)
        {
            c = (Counter) getWorld().getObjects(Counter.class).get(0);
        }
        
        if(isTouching(Hero.class))
        {
            Ambulance weewoo = new Ambulance();
            getWorld().addObject(weewoo, 300, 200);
            c.equals(0);
            getWorld().removeObjects(getWorld().getObjects(Baby.class));
            getWorld().removeObjects(getWorld().getObjects(WhiteBaby.class));
            return;
        }
        
        if(isAtEdge())
        {
            
            c.add(1);
        }
    }
    public void resetBaby()
    {
        int num = Greenfoot.getRandomNumber(5);
        if(num == 0)
        {
            setLocation(600,50);
        }
        else if(num == 1)
        {
            setLocation(600,150);
        }
        else if(num == 2)
        {
            setLocation(600,250);
        }
        else if(num == 3)
        {
            setLocation(600,350);
        }
        else if(num == 4)
        {
            setLocation(600,0);
        }
        else
        {
            setLocation(600,450);
        }
    }
}
