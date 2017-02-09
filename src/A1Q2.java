
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
public class A1Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        City kitchener = new City(); // New city called kitchener
       Robot bob = new Robot(kitchener, 1, 2, Direction.SOUTH); // Creating a robot named bob
       new Thing(kitchener, 2, 2); // Placing "Thing" that represents a newspaper into kitchener
       new Wall(kitchener, 1, 2, Direction.NORTH); // Adding wall
       new Wall(kitchener, 1, 1, Direction.NORTH); // Adding wall
       new Wall(kitchener, 1, 1, Direction.WEST);  // Adding wall
       new Wall(kitchener, 2, 1, Direction.WEST);  // Adding wall
       new Wall(kitchener, 1, 2, Direction.EAST);  // Adding wall
       new Wall(kitchener, 1, 2, Direction.SOUTH); // Adding wall
       new Wall(kitchener, 2, 1, Direction.SOUTH); // Adding wall
       
       bob.turnLeft(); // Turning bob east
       bob.turnLeft(); // Turning bob North
       bob.turnLeft(); // Turning bob West
       
       bob.move(); // moving bob 1 space West
       
       bob.turnLeft(); // Turning bob South
       
       bob.move(); // moving bob 1 space South
       
       bob.turnLeft(); // turning bob East
       
       bob.move(); // moving bob 1 space East
       
       bob.pickThing(); // bob picks up newspaper
       
       bob.turnLeft(); // bob turns North
       bob.turnLeft(); // bob turns West
       
       bob.move(); // moving bob 1 space West
       
       bob.turnLeft(); // bob turns South
       bob.turnLeft(); // turning bob East
       bob.turnLeft(); // bob turns North
       
       bob.move(); // bob moves 1 space North
       
       bob.turnLeft(); // bob turns West
       bob.turnLeft(); // bob turns South
       bob.turnLeft(); // turning bob East
       
       bob.move(); // bob moves 1 space East
       
       bob.turnLeft(); // bob turns North
       bob.turnLeft(); // bob turns West
       bob.turnLeft(); // bob turns South and stops back in his bed
    }
}
