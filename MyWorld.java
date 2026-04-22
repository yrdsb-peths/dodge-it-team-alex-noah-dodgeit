import greenfoot.*;

public class MyWorld extends World {
    public MyWorld() {
        
        super(600, 400, 1);
        
        Hero hero = new Hero();
        addObject(hero, 100, 100); 
        
        Baby baby = new Baby();
        addObject(baby, 600, 100);
        
        Counter scoreCounter = new Counter();
        addObject(scoreCounter, 50, 20);
    }

}
