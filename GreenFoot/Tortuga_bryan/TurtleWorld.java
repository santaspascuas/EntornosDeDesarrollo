import greenfoot.*;  // imports Actor, World, Greenfoot, GreenfootImage

public class TurtleWorld extends World
{
    /**
     * Create the turtle world. Our world has a size 
     * of 560x460 cells, where every cell is just 1 pixel.
     */
    public TurtleWorld() 
    {
        super(800, 600, 1);
        Tortuga mainTortuga = new Tortuga();
        addObject(mainTortuga,50,300);
        crearLechuga(45);
    }

    /**
     * Prepare the world for the start of the program. That is: create the initial
     * objects and add them to the world.
     */

    
    public void crearLechuga(int numero){
        
        for( int i =0; i< numero;i++){
            Lechuga l1 = new Lechuga();
            int x = Greenfoot.getRandomNumber(getWidth());
            int y = Greenfoot.getRandomNumber(getWidth());
            addObject(l1,x,y);
        }
        
    }
}