import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Block here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Block extends SpriteSheet
{
    public Block(int ID) {
        setImage(getSprite(new GreenfootImage("terrain.png"), ID, 16, 16, 32, 32));
    }
}
