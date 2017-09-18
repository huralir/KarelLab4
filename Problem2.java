
import kareltherobot.*; 


/**
 * @author :  D. Appel
 */
public class Problem2 extends Robot
{
    public Problem2(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    public void plantBeepers() {
        for ( int x = 1; x>0; x ++) {
            if (!nextToABeeper()) {
                checkForWall();
            }
            else {
                turnOff();
            }
        }
    }
    
    public void checkForWall(){
        turnLeft();
        if (!frontIsClear()) {
            turnRight();
            putBeeper();
            if (frontIsClear()) {
                move();
            }
            else {
                turnRight();
                move();
            }
        }
        else {
            move();
            turnLeft();
            move();
            
    }
    }
    public void turnRight() {
        turnLeft();
        turnLeft();
        turnLeft();
    }
}

