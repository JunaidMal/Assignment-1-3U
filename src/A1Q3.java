
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author malij6756
 */
public class A1Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
               // New city called kitchener
       City kitchener = new City(); 
        // Creating a robot named bob and placing it in kitchener
       Robot bob = new Robot(kitchener, 3, 0, Direction.EAST);
        // Placing "Thing" which represents a flag in kitchener
       new Thing(kitchener, 3, 1);
       
       // Placing walls in kitchener
       new Wall(kitchener, 3, 2, Direction.NORTH);  
       new Wall(kitchener, 3, 2, Direction.WEST);
       new Wall(kitchener, 2, 3, Direction.WEST);
       new Wall(kitchener, 1, 3, Direction.WEST);
       new Wall(kitchener, 1, 3, Direction.NORTH);
       new Wall(kitchener, 1, 3, Direction.EAST);
       new Wall(kitchener, 2, 4, Direction.NORTH);
       new Wall(kitchener, 2, 4, Direction.EAST);
       new Wall(kitchener, 3, 4, Direction.EAST);
       
        // move bob 1 space East
       bob.move();
       
        // bob picks up flag
       bob.pickThing();
       
        // turn bob North
       bob.turnLeft();
       
        // move bob 1 space North
       bob.move();
       
        // turn bob East by turning West, South, then East
       bob.turnLeft();
       bob.turnLeft();
       bob.turnLeft(); 
       
        // move bob 1 space East
       bob.move();
       
        // turn bob North
       bob.turnLeft();
       
        // move bob 2 spaces North
       bob.move();
       bob.move();
       
        // turn bob East by turning West, South, then East
       bob.turnLeft();
       bob.turnLeft();
       bob.turnLeft();
       
        // move bob 1 space East
       bob.move(); 
       
        // make bob drop flag
       bob.putThing();
       
        // move bob 1 space East
       bob.move();
       
        // turn bob South by turning North, West, then South
       bob.turnLeft();
       bob.turnLeft();
       bob.turnLeft();
       
        // move bob 1 space South
       bob.move();
       
        // turn bob East
       bob.turnLeft();
       
        // move bob 1 space East
       bob.move();
       
        // turn bob South by turning North, West, then South
       bob.turnLeft();
       bob.turnLeft();
       bob.turnLeft();
       
        // move bob 2 spaces South
       bob.move();
       bob.move();
       
        // turn bob East
       bob.turnLeft();
    }
}
