package CreationalPattern.FactoryPattern;
import java.util.Scanner;
/*@author Hari Prasath V
 *  @version 1.0
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
 * The FactoryPattern class is the client code that creates cricket balls using the
 * CricketBallFactory.
 */
public class FactoryPattern {

    /**
     * Creates cricket balls based on the match type and prints out their types.
     * 
     * @param args 
     */
    public static void main(String[] args) {
       try (Scanner scanner = new Scanner(System.in)) {
        String matchType = scanner.nextLine();
           CricketBall Ball = CricketBallFactory.createCricketBall(matchType);
           Ball.getBallType();
    }
    }
}





/*
 *  Factory pattern removes the instantiation of actual implementation classes from client code,
 *  making it more robust, less coupled and easy to extend. 
 *  For example, we can easily change class implementation because client program is unaware of it.
 */



















/*
The Factory design pattern is used when we have a super class with multiple sub-classes and based on input, 
we need to return one of the sub-classes. 
This pattern takes out the responsibility of instantiation of a class from a client program to the factory class. 
 */