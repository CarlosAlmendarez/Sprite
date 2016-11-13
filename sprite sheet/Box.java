import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Box here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Box extends SpriteSheet
{
    public int delay = 25;
    public int img = 0;
    public Box(int img) {
        this.img = img;
        setImage(getSprite(new GreenfootImage("Sprites.png"), img*10, 0, img*10+10, 10, 20, 20));
    }
    
    public Box() {
        setImage(getSprite(new GreenfootImage("Sprites.png"), 0, 0, 10, 10, 20, 20));
    }
    
    public void act() {
        if(delay==0) {
            if(img<2) {
                img++;
            } else {
                img = 0;
            }
            delay = 25;
        } else {
            delay--;
        }
        setImage(getSprite(new GreenfootImage("Sprites.png"), img*10, 0, img*10+10, 10, 20, 20));
    }
}
