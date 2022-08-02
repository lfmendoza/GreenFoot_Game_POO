import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Trash_3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Trash_3 extends Actor
{
    private boolean drag = false;
    private int coordX = 0, coordY = 0;
    /**
     * Act - do whatever the Trash_2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public void act()
    {
        if(Greenfoot.mouseDragged(this)) {
            MouseInfo mouse =  Greenfoot.getMouseInfo();
            if(drag) {
                drag = true;
                coordX = getX() - mouse.getX();
                coordY = getY() - mouse.getY();
            } else {
                setLocation(mouse.getX() + coordX, mouse.getY() + coordY);
            }
        }
        
        if(Greenfoot.mouseDragEnded(this)) {
            drag = false;
            World w = getWorld();
            
            if(isAtEdge()) {
                w.removeObject(this);
            } else {
                if(isTouching(Dumpster.class)) {
                    removeTouching(Trash_3.class);
                }
            }
        }
    }
}
