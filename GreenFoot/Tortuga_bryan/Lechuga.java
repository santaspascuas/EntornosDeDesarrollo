import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * La clase lechuga es una clase vacia. Nos sirve para que nuestra tortuga pueda comersela eh ir
 * contado las puntuaciones que va acumulando.
 * 
 * @author (BRYAN CUADRADO)
 * @version (a version number or a date)
 */
public class Lechuga extends Animal
{
    /**
     * Act - do whatever the Lechuga wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move(2); // Establecemos el moviento continuo
        // CREAMOS UN OBJETO MUNDO. SERA NUESTRO MARGEN.
        World m = getWorld();
        if(getX()>=m.getWidth()-5 || getX()<=5){
            turn(180);
            
            
            
            if( Greenfoot.getRandomNumber(100)<10){
            turn(Greenfoot.getRandomNumber(90-45)); 
        }
    }
         if(getY()>=m.getWidth()-5 || getY()<=5){
            turn(180);
            if( Greenfoot.getRandomNumber(100)<10){
            turn(Greenfoot.getRandomNumber(90-45)); 
        }    
            
            
            
            
        
        
    }
}
}
