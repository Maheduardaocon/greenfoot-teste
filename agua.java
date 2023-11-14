import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class agua here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class agua extends Actor
{
    /**
     * Act - do whatever the agua wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public int speed = 3;
        /**
         * Act - do whatever the ladrão wants to do. This method is called whenever
         * the 'Act' or 'Run' button gets pressed in the environment.
         */
        public void act()
        {
          moviment(); 
        }
        public void moviment () {
            if (Greenfoot.isKeyDown("w"))
            this.setLocation(this.getX(), this.getY () - speed);
            
            if (Greenfoot.isKeyDown("s"))
            this.setLocation(this.getX(), this.getY () + speed);
            
            if (Greenfoot.isKeyDown("a"))
            this.setLocation(this.getX() - speed, this.getY());
            
            if (Greenfoot.isKeyDown("d"))
            this.setLocation(this.getX() + speed, this.getY());
            if (Greenfoot.isKeyDown("f")){
            getWorld().addObject(new poder2(), getX() - 70, getY() + 10);   
            }
        }
    }
