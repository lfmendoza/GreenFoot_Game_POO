import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    public static int score = 0;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
    }
    
    public void act()
    {
        showText("Punteo: " + score, 50, 25);
        
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        score = 0;
        Greenfoot.playSound("Morning Lessons - Ty Simon.mp3");
        showText("Punteo: " + score, 50, 25);
        Dumpster dumpster = new Dumpster();
        addObject(dumpster,76,54);

        Trash_1[] trash1Collection = new Trash_1[3];
        Trash_2[] trash2Collection = new Trash_2[3];
        Trash_3[] trash3Collection = new Trash_3[3];
        Trash_4[] trash4Collection = new Trash_4[3];

        for (int i = 0; i < trash1Collection.length; i++)
        {
            trash1Collection[i] = new Trash_1();
            int xLocation = Greenfoot.getRandomNumber(getWidth());
            int yLocation = Greenfoot.getRandomNumber(getHeight());
            addObject(trash1Collection[i], xLocation, yLocation);
        }

        for (int i = 0; i < trash2Collection.length; i++)
        {
            trash2Collection[i] = new Trash_2();
            int xLocation = Greenfoot.getRandomNumber(getWidth());
            int yLocation = Greenfoot.getRandomNumber(getHeight());
            addObject(trash2Collection[i], xLocation, yLocation);
        }

        for (int i = 0; i < trash3Collection.length; i++)
        {
            trash3Collection[i] = new Trash_3();
            int xLocation = Greenfoot.getRandomNumber(getWidth());
            int yLocation = Greenfoot.getRandomNumber(getHeight());
            addObject(trash3Collection[i], xLocation, yLocation);
        }

        for (int i = 0; i < trash4Collection.length; i++)
        {
            trash4Collection[i] = new Trash_4();
            int xLocation = Greenfoot.getRandomNumber(getWidth());
            int yLocation = Greenfoot.getRandomNumber(getHeight());
            addObject(trash4Collection[i], xLocation, yLocation);
        }
    }
}
