import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Aguaganhou here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Aguaganhou extends World
{

    /**
     * Constructor for objects of class Aguaganhou.
     * 
     */
    public Aguaganhou()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
    }
    public void act(){
    if(Greenfoot.isKeyDown("enter")){
      setBackground(new GreenfootImage("11.png"));  
        
    }
    if(Greenfoot.isKeyDown("enter")){
      setBackground(new GreenfootImage("Creditos.png"));  
        
    }
}
}
