import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TitleScreen here.
 * 
 * @author jim
 * @version dec 6 2023
 */
public class TitleScreen extends World
{
    Label titleLabel = new Label("The Elephant", 60);
    /**
     * Constructor for objects of class TitleScreen.
     * 
     */
    public TitleScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 

        addObject(titleLabel, 156, 200);
        prepare();
    }

    public void act()
    {
        if(Greenfoot.isKeyDown("space"))
        {
            MyWorld gameWorld = new MyWorld();
            Greenfoot.setWorld(gameWorld);
        }
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Elephant elephant = new Elephant();
        addObject(elephant,450,111);
        Label label = new Label("press <space> to start", 40);
        addObject(label,256,223);
        elephant.setLocation(447,288);
        label.setLocation(176,240);
    }
}
