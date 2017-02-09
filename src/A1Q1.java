
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Wall;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author malij6756
 */
public class A1Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        City kitchener = new City(); // New city called kitchener
       Robot bob = new Robot(kitchener, 0, 2, Direction.WEST); // Creating a robot named bob
       new Wall(kitchener, 1, 2, Direction.NORTH); // Adding wall
       new Wall(kitchener, 1, 1, Direction.NORTH); // Adding wall
       new Wall(kitchener, 1, 1, Direction.WEST);  // Adding wall
       new Wall(kitchener, 2, 1, Direction.WEST);  // Adding wall
       new Wall(kitchener, 1, 2, Direction.EAST);  // Adding wall
       new Wall(kitchener, 2, 2, Direction.EAST);  // Adding wall
       new Wall(kitchener, 2, 2, Direction.SOUTH); // Adding wall
       new Wall(kitchener, 2, 1, Direction.SOUTH); // Adding wall
       
       bob.move(); // Move bob 1 space to the West
       bob.move(); // Move bob 1 space to the West
       
       bob.turnLeft(); // Turn bob South
       
       bob.move(); // Move bob 1 space to the South
       bob.move(); // Move bob 1 space to the South
       bob.move(); // Move bob 1 space to the South
       
       bob.turnLeft(); // Turn bob East
       
       bob.move(); // Move bob 1 space to the East
       bob.move(); // Move bob 1 space to the East
       bob.move(); // Move bob 1 space to the East
       
       bob.turnLeft(); // Turn bob North
       
       bob.move(); // Move bob 1 space to the North
       bob.move(); // Move bob 1 space to the North
       bob.move(); // Move bob 1 space to the North
       
       bob.turnLeft(); // Turn bob West
       
       bob.move(); // Move bob 1 space to the West, where he started
    }
}
