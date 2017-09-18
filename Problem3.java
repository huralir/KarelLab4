 
import kareltherobot.*; 


/**
 * @author :  D. Appel
 */
public class Problem3 extends Robot
{
    public Problem3(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    
    public void closeAllWindows() {
        turnLeft();
        move();
        turnRight();
        move();
        move();
        move();
        move();
        move();
        move();
        turnRight();
        for ( int x = 1; x>0; x ++) {
            if (frontIsClear()) {
                turnLeft();
                if (!frontIsClear()) {
                    turnRight();
                    move();
                }
                else {
                    turnRight();
                    putBeeper();
                    move();
                }
            }
            else {
                turnRight();   
            }
        }
    }
    public void turnRight2() {
        turnLeft();
        turnLeft();
        turnLeft();
        turnLeft();
        turnLeft();
        turnLeft();
    }
    public void turnRight() {
        turnLeft();
        turnLeft();
        turnLeft();
    }
}
