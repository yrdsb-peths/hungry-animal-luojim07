
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Respawn here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Restart extends World
{
    SimpleTimer timer = new SimpleTimer();
    /**
     * Constructor for objects of class Respawn.
     * 
     */
    public Restart()
    {   
        
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        
        
        Label res = new Label("Restart?", 80);
        addObject(res, getWidth()/2, getHeight()/2-40);
        Label spam = new Label("Press <space>!", 50);
        addObject(spam, getWidth()/2, getHeight()/2 + 40);
    }
    
    public void act()
    {
        if(Greenfoot.isKeyDown("space"))
        {
            MyWorld gameWorld = new MyWorld();
            Greenfoot.setWorld(gameWorld); 
        }
        if(timer.millisElapsed()  >= 5000)
        {
            TitleScreen world = new TitleScreen();
            Greenfoot.setWorld(world);
        }
    }
}
