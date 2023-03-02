package CreationalPattern.FactoryPattern;

/**
 * The WhiteCricketBall class is a concrete implementation of the CricketBall
 * interface.
 */
public class WhiteCricketBall implements CricketBall {

    /**
     * Returns the type of the cricket ball as a string.
     */
    @Override
    public void getBallType() {
        System.out.println("This is a white cricket ball.");
    }
}

