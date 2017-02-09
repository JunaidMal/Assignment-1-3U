
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
public class A1Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // New city called kitchener
       City kitchener = new City(); 
        // Creating 2 robots named bob and jeb then placing them in kitchener
       Robot bob = new Robot(kitchener, 0, 0, Direction.SOUTH);
       Robot jeb = new Robot(kitchener, 0, 1, Direction.SOUTH);
       
        // Placing walls in kitchener
       new Wall(kitchener, 0, 1, Direction.WEST);  
       new Wall(kitchener, 1, 1, Direction.WEST);
       new Wall(kitchener, 1, 1, Direction.SOUTH);
       
        // bob moves 3 spaces South, jeb moves 2 spaces South
       bob.move();
       jeb.move();
       bob.move();
       
        // bob and jeb turn to the East
       bob.turnLeft();
       jeb.turnLeft();
       
        // jeb moves 1 space East
       jeb.move();
       
        // jeb turns South
       jeb.turnLeft();
       jeb.turnLeft();
       jeb.turnLeft();
       
        // jeb moves 1 space to the South
       jeb.move();
       
        // jeb turns West
       jeb.turnLeft();
       jeb.turnLeft();
       jeb.turnLeft();
       
        // jeb and bob arrive at their destination, facing East and West
       bob.move();
       jeb.move();
       
    }
}
