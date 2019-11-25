import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ball here.
 * 
 * @author Rikard Karlsson
 * @version 2019-10-25
 */
public class Ball extends Actor
{
    public Ball()
    {
        int angle = Greenfoot.getRandomNumber(60) + 60;
        setRotation(angle);
    }
    
    public void act() 
    {
        move(5);
        checkGameOver();        
        checkWallCollision();       
        checkBrickCollision();       
        checkBalloonCollision();        
    }    
    
    public void checkGameOver()
    {
        if (getY() > 398)
        {
            getWorld().showText("Game Over", 250, 200);
            Greenfoot.stop();
        }
    }
    
    public void checkWallCollision()
    {
        if (isAtEdge())
        {
            int angle = Greenfoot.getRandomNumber(180) + 30;
            turn(angle);
        }
    }
    
    public void checkBrickCollision()
    {
        if (isTouching(Brick.class))
        {
            // moving left
            if (getRotation() > 90)
            {
                setRotation(360 - getRotation());
            }
            // moving right
            if (getRotation() < 90)
            {
                setRotation(360 - getRotation());
            }
            move(5);
        }
    }
    
    public void checkBalloonCollision()
    {
        if (isTouching(Balloon.class))
        {
            removeTouching(Balloon.class);
        }
    }
}
