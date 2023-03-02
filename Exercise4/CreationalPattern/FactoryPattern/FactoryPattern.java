package CreationalPattern.FactoryPattern;
/*@author Hari Prasath V
 *  @version 1.0
 */
 /** Import required packages
  */
/**
 * The CricketBall interface defines the methods that all cricket balls should
 * have.
 */
 interface CricketBall {
    /**
     * Returns the type of the cricket ball.
     */
    public void getBallType();
}

/**
 * The Main class is the client code that creates cricket balls using the
 * CricketBallFactory.
 */
public class FactoryPattern {

    /**
     * Creates cricket balls based on the ground type and prints out their types.
     * 
     * @param args the command-line arguments
     */
    public static void main(String[] args) {
        CricketBall redBall = CricketBallFactory.createCricketBall("dry");
        redBall.getBallType();

        CricketBall whiteBall = CricketBallFactory.createCricketBall("wet");
        whiteBall.getBallType();
    }
}
