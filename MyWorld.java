import greenfoot.*;

public class MyWorld extends World {
    public MyWorld() {
        
        super(600, 400, 1);
        //Counter scoreCounter = new Counter("Score: ");
        //addObject(scoreCounter, 60, 20);

        Hero hero = new Hero();
        addObject(hero, 100, 100); 
        
        Baby baby = new Baby();
        addObject(baby, 600, 100);
    }

}
