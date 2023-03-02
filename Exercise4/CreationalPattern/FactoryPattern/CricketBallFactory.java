package CreationalPattern.FactoryPattern;

/**
* The CricketBallFactory class is a factory class that creates cricket balls
* based on the ground type.
*/
public  class CricketBallFactory {
   /**
    * Creates a cricket ball based on the ground type.
    * 
    * @param groundType the type of the cricket ground
    * @return a cricket ball
    * @throws IllegalArgumentException if the ground type is not "dry" or "wet"
    */
   public static CricketBall createCricketBall(String groundType) {
       if (groundType.equalsIgnoreCase("dry")) {
           return new RedCricketBall();
       } else if (groundType.equalsIgnoreCase("wet")) {
           return new WhiteCricketBall();
       } else {
           throw new IllegalArgumentException("Invalid ground type: " + groundType);
       }
   }
}
