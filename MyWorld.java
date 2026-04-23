import greenfoot.*;

public class MyWorld extends World {
    Counter gameCounter = new Counter();
    public MyWorld() {
        
        super(600, 400, 1);
        
        Hero hero = new Hero();
        addObject(hero, 100, 100); 
        
        Baby baby = new Baby();
        addObject(baby, 600, 100);
        
        
        addObject(gameCounter, 100, 30);
        addObject(new ResetButton(), 500, 30);
        
        
    }
    
    public void reset() {
        // Reset the score
        Greenfoot.setWorld(new MyWorld());
        
        // Remove existing enemies/objects (example)
        removeObjects(getObjects(Baby.class));
        removeObjects(getObjects(Hero.class));
        
        // Reposition player if necessary
    }
    
    public Counter getCounter() {
        return gameCounter;
    }

}
