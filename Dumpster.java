import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Dumpster here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Dumpster extends Actor
{
    /**
     * Act - do whatever the Dumpster wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    MyWorld trashCollectionGame;
    public void act()
    {
        if(isTouching(Trash_1.class)) {
            trashCollectionGame.score++;
            Greenfoot.playSound("effect.mp3");
            if(trashCollectionGame.score == 12) {
                GameOver gameover = new GameOver();
                getWorld().addObject(gameover, 300, 200);
            }
            removeTouching(Trash_1.class);
        }
        
        if(isTouching(Trash_2.class)) {
            trashCollectionGame.score++;
            Greenfoot.playSound("effect.mp3");
            if(trashCollectionGame.score == 12) {
                GameOver gameover = new GameOver();
                getWorld().addObject(gameover, 300, 200);
            }
            removeTouching(Trash_2.class);
        }
        
        if(isTouching(Trash_3.class)) {
            trashCollectionGame.score++;
            Greenfoot.playSound("effect.mp3");
            if(trashCollectionGame.score == 12) {
                GameOver gameover = new GameOver();
                getWorld().addObject(gameover, 300, 200);
            }
            removeTouching(Trash_3.class);
        }
        
        if(isTouching(Trash_4.class)) {
            trashCollectionGame.score++;
            if(trashCollectionGame.score == 12) {
                GameOver gameover = new GameOver();
                getWorld().addObject(gameover, 300, 200);
            }
            removeTouching(Trash_4.class);
        }
    }
}
