
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
public class A1Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // New city called kitchener
       City kitchener = new City(); 
        // Creating 2 robots named bob and jeb then placing them in kitchener
       Robot maria = new Robot(kitchener, 0, 1, Direction.WEST);
       Robot karel = new Robot(kitchener, 3, 3, Direction.EAST);
        // Set labels for karel and maria
       maria.setLabel("M");
       karel.setLabel("K");
       
        // placing dropped items in kitchener
       new Thing(kitchener, 2, 2);
       new Thing(kitchener, 1, 2);
       new Thing(kitchener, 1, 1);
       new Thing(kitchener, 1, 0);
       new Thing(kitchener, 0, 0);
       
        // Placing walls in kitchener
       new Wall(kitchener, 3, 3, Direction.SOUTH);  
       new Wall(kitchener, 3, 3, Direction.EAST);
       new Wall(kitchener, 2, 3, Direction.WEST);
       new Wall(kitchener, 2, 3, Direction.NORTH);
       new Wall(kitchener, 2, 3, Direction.EAST);
       
        // karel turns West
       karel.turnLeft();
       karel.turnLeft();
       
        // karel and maria move 1 space
       karel.move();
       maria.move();
       
        // maria picks up item
       maria.pickThing();
       
        // maria turns South and karel turns North
       maria.turnLeft();
       karel.turnLeft();
       karel.turnLeft();
       karel.turnLeft();
        
        // karel and maria move 1 space
       karel.move();
       maria.move();
       
        // karel and maria pick up an item
       karel.pickThing();
       maria.pickThing();
       
        // maria turns East
       maria.turnLeft();
       
        // karel and maria move 1 space
       karel.move();
       maria.move();
       
        // karel and maria pick up an item
       karel.pickThing();
       maria.pickThing();
       
        // karel turns West
       karel.turnLeft();
    }
}
