package CreationalPattern.FactoryPattern;

/**
 * The RedCricketBall class is a concrete implementation of the CricketBall
 * interface.
 */
public class RedCricketBall implements CricketBall {

    /**
     * Returns the type of the cricket ball as a string.
     */
    @Override
    public void getBallType() {
        System.out.println("Use red cricket ball.");
    }
}