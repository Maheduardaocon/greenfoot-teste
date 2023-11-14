import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class canario1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class canario1 extends World
{
    public int temp = 30;
    public int temp1 = 30;
    public int temp2 = 30;
     public int temp3 = 30;
    public int temp4 = 30;
    public int temp5 = 30;
    public int temp6 = 30;
    public int temp7 = 30;
    /**
     * Constructor for objects of class canario1.
     * 
     */
    public canario1()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        prepare();
    }
    public void act(){
    temp--;
    //Diálogo Toad
    if(Greenfoot.isKeyDown("enter") && (temp < 1)){
        setBackground(new GreenfootImage("1.png"));
        temp1--;
    }
    //Diálogo Mário
    if (Greenfoot.isKeyDown("enter") && (temp1 < 1)){
        setBackground(new GreenfootImage("2.png"));
        temp2--;
    }
    if(Greenfoot.isKeyDown("enter") && (temp2 < 1)){
        setBackground(new GreenfootImage("3.png"));
        temp3--;
    }
    //Diálogo Mário
    if (Greenfoot.isKeyDown("enter") && (temp3 < 1)){
        setBackground(new GreenfootImage("4.png"));
        temp4--;
    }
     if (Greenfoot.isKeyDown("enter") && (temp4 < 1)){
        setBackground(new GreenfootImage("5.png"));
        temp5--;
    }
    //Iniciar o jogo
    if (Greenfoot.isKeyDown("enter") && (temp5 < 1)){
        Mundo world = new Mundo();
        Greenfoot.setWorld(world);
    }
}
private void prepare(){
}
}
