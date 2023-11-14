import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Mundo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Mundo extends World
{
    
     GreenfootSound backgroundMusic = new GreenfootSound("music.mp3");
    public Mundo()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        prepare();
        backgroundMusic.playLoop();
    }  

    private void prepare()
    {

        Counter counter = new Counter();
        addObject(counter,226,66);
        Counter2 counter2 = new Counter2();
        addObject(counter2,552,69);

        agua agua = new agua();
        addObject(agua,194,341);
        fogo fogo = new fogo();
        addObject(fogo,621,323);
    }
}

