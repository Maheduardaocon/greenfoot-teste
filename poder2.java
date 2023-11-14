import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class poder2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class poder2 extends Actor
{
    /**
     * Act - do whatever the poder wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */

       GifImage mygif = new GifImage("poder1.png");
       public int temp6=30;
    public void act()
    {
        setImage(mygif.getCurrentImage());
        moveAtaque();
        acertarAlvo();
    }
    public void moveAtaque()
    {
        double angle = Math.toRadians( getRotation());
        int x = (int) Math.round(getX() + Math.cos(angle));
        int y = (int) Math.round(getY() + Math.sin(angle));
        
        setLocation(x, y);
    }
    public void acertarAlvo(){
        Actor b = getOneIntersectingObject(fogo.class);
        if (b != null){
    
        Counter counter = (Counter) getWorld().getObjects(Counter.class).get(0);
        counter.add(1);
            
            getWorld().removeObject(b);
            getWorld().removeObject(this);
            temp6=0;
}
if(temp6<6){
    Aguaganhou world = new Aguaganhou();
    Greenfoot.setWorld(world);
}
    }
}

