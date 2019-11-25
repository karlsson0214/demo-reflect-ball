import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Brick here.
 * 
 * @author Rikard Karlsson
 * @version 2019-10-25
 */
public class Brick extends Actor
{
    
    public Brick()
    {
        // Make brick big enough
        getImage().scale(100,20);
    }
    
    public void act() 
    {
        if (Greenfoot.isKeyDown("left"))
        {
            move(-10);
        }
        else if (Greenfoot.isKeyDown("right"))
        {
            move(10);
        }
    }    
}
