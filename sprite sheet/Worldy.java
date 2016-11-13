import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Worldy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Worldy extends World
{

    /**
     * Constructor for objects of class Worldy.
     * 
     */
    public Worldy()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        addObject(new Box(0), 100, 200);
        addObject(new Box(1), 120, 200);
        addObject(new Box(2), 140, 200);
        addObject(new Box(0), 160, 200);
        addObject(new Box(1), 180, 200);
        addObject(new Box(2), 200, 200);
        addObject(new Box(0), 220, 200);
        addObject(new Box(1), 240, 200);
        addObject(new Box(2), 260, 200);
        addObject(new Box(0), 280, 200);
        addObject(new Box(1), 300, 200);
        addObject(new Box(2), 320, 200);
        addObject(new Box(0), 340, 200);
        addObject(new Box(1), 360, 200);
        addObject(new Box(2), 380, 200);
        addObject(new Box(0), 400, 200);
        addObject(new Box(1), 420, 200);
        addObject(new Box(2), 440, 200);
        addObject(new Box(0), 460, 200);
        addObject(new Box(1), 480, 200);
        addObject(new Box(2), 500, 200);
        addObject(new Creature(), 300, 170);
        addObject(new Block(35), 300, 300);
    }
}
