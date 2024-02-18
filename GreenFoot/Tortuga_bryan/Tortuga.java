import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Tortuga here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tortuga extends Animal
{
    /**
     * Act - do whatever the Tortuga wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */

    // Hemos REFACTORIZADO. Creado para cada acci—n su clase. Y en la calse ACT
    // llamar a las clases creadas.
    public void act()
    {
        MoverTortuga();
        comer();
        DoubleRandom();
        findelMundo();
        move(4);// El move hace que se mueva automaticamente. El numero de dentro es
        // es la velocidad.

    }

    public void MoverTortuga(){
        if (Greenfoot.isKeyDown("left")){
            turn(-3);
        }
        if (Greenfoot.isKeyDown("right")){

            turn(3);
        }

    }

    public void DoubleRandom(){
        // generamos un metodo random. La condici—n hace que el 10% de los numeros
        //cumplan la condici—n(10%).
        if(Greenfoot.getRandomNumber(100)<30){

            turn(Greenfoot.getRandomNumber(40)-20);

        } 
    }

    public void findelMundo(){
        if( atWorldEdge()){

            turn(7);
        }

    }

    
    public void comer(){
        Actor lechuga;

        lechuga = getOneObjectAtOffset(0,0,Lechuga.class);

        if(lechuga!= null){
            World world;
            world = getWorld();
            world.removeObject(lechuga);
            Greenfoot.playSound("slurp.wav");
        }

    }
    
    
    
    
}
