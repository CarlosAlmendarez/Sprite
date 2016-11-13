import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Creature here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Creature extends SpriteSheet
{
    public int delay = 25;
    public int img = 0;
    
    public Creature() {
        setImage(getSprite(new GreenfootImage("Uni.png"), 0, 0, 200,90, 100, 35));
    }
    
    public void act() {
        if(delay==0) {
            if(img<1) {
                img+=200;
            } else {
               img+=200;
            }
            delay = 1;
            setLocation(getX()+2,getY());
        } else {
            delay--;
        }
        setImage(getSprite(new GreenfootImage("Uni.png"), img, 0, img+200, 90, 100,35));
    }
}
