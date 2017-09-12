
import kareltherobot.*; 


/**
 * @author :  D. Appel
 */
public class BeeperBot extends Robot
{
public BeeperBot(int st, int av, Direction dir, int numBeepers) {
    super(st, av, dir, numBeepers);
}
public void runRace() {
    move();
    move();
    faceNorth();
    while (!(facingEast() && !frontIsClear())) {
            collectColumnOfBeepers();
        }
}
public void collectColumnOfBeepers() {
    while (facingNorth() && nextToABeeper()) {
        pickBeeper();
        move();
    }
    faceSouth();
    while (frontIsClear()) {
        move();
    }
    faceEast();
    move();
    faceNorth();
}
public void faceEast() {
    while (!facingEast()) {
        turnLeft();
    }
}
public void faceSouth() {
    while (!facingSouth()) {
        turnLeft();
    }
}
public void faceNorth() {
    while (!facingNorth()) {
        turnLeft();
    }
}
}