import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class fogo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class fogo extends Actor
{
    /**
     * Act - do whatever the fogo wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
      public int speed = 3;
        /**
         * Act - do whatever the soldado wants to do. This method is called whenever
         * the 'Act' or 'Run' button gets pressed in the environment.
         */
        public void act()
        {
            movimento();
            
        }
        
        
     public void movimento(){
             if (Greenfoot.isKeyDown("up")){
            this.setLocation(this.getX(), this.getY () - speed);    
            }
            if (Greenfoot.isKeyDown("down")){
            this.setLocation(this.getX(), this.getY () + speed);
            }
            if (Greenfoot.isKeyDown("left")){
            this.setLocation(this.getX() - speed, this.getY());
            }
            if (Greenfoot.isKeyDown("right")){
            this.setLocation(this.getX() + speed, this.getY());
            } 
            if (Greenfoot.isKeyDown("l")){
                    getWorld().addObject(new poder(), getX() - 70, getY() + 10);   
            }
        }
    }
