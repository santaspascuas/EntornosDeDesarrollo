import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Serpiente here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Serpiente extends Animal
{
    /**
     * Act - do whatever the Serpiente wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act(){
        move(4);
        MovimientoRandom();
        findelMundo();
        comerTortuga();
       
    }
    
      public void MovimientoRandom(){
        // generamos un metodo random. La condici—n hace que el 10% de los numeros
        //cumplan la condici—n(10%).
         if(Greenfoot.getRandomNumber(100)<10){

            turn(Greenfoot.getRandomNumber(60)-20);

        } 
    }
    
    public void findelMundo(){
        if( atWorldEdge()){

            turn(7);
        }
        
    }
    
    public void comerTortuga(){
        Actor tortuga = getOneIntersectingObject(Tortuga.class);
       if( isTouching(Tortuga.class)){
           getWorld().addObject(new YouLose(),400,300);
           getWorld().removeObject(tortuga);
           Greenfoot.playSound("ohno.wav");
           Greenfoot.stop();
        }
        
        
    }
    
    
    
    
    
 
    
    
}
