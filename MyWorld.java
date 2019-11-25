import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author Rikard Karlsson
 * @version 2019-10-25
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(500, 400, 1); 
        prepare();
    }

    public void act()
    {
        // only ball and brick left
        if (numberOfObjects() < 3)
        {            
            showText("You made it", 300, 250);
            Greenfoot.stop();
        }
    }
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Brick brick = new Brick();
        addObject(brick,213,378);
        Ball ball = new Ball();
        addObject(ball,154,89);
        Balloon balloon = new Balloon();
        addObject(balloon,17,28);
        Balloon balloon2 = new Balloon();
        addObject(balloon2,51,27);
        Balloon balloon3 = new Balloon();
        addObject(balloon3,85,26);
        Balloon balloon4 = new Balloon();
        addObject(balloon4,121,26);
        Balloon balloon5 = new Balloon();
        addObject(balloon5,160,27);
        Balloon balloon6 = new Balloon();
        addObject(balloon6,197,29);
        Balloon balloon7 = new Balloon();
        addObject(balloon7,231,33);
        Balloon balloon8 = new Balloon();
        addObject(balloon8,271,29);
        Balloon balloon9 = new Balloon();
        addObject(balloon9,304,29);
        Balloon balloon10 = new Balloon();
        addObject(balloon10,339,31);
        Balloon balloon11 = new Balloon();
        addObject(balloon11,377,30);
        Balloon balloon12 = new Balloon();
        addObject(balloon12,411,38);
        Balloon balloon13 = new Balloon();
        addObject(balloon13,446,28);
        Balloon balloon14 = new Balloon();
        addObject(balloon14,478,49);
        Balloon balloon15 = new Balloon();
        addObject(balloon15,24,80);
        Balloon balloon16 = new Balloon();
        addObject(balloon16,72,80);
        Balloon balloon17 = new Balloon();
        addObject(balloon17,33,138);
        Balloon balloon18 = new Balloon();
        addObject(balloon18,418,96);
        Balloon balloon19 = new Balloon();
        addObject(balloon19,471,106);
        Balloon balloon20 = new Balloon();
        addObject(balloon20,460,166);
    }
}
