package CreationalPattern.SingletonPattern;
/*@author Hari Prasath V
 *  @version 1.0
 */
 /** Import required packages
  */
public class SingletonPattern {
    /** Main method used for testing the singleton pattern implementation. 

     * 
     * @param args The command line arguments.
     */
    public static void main(String[] args) {
        OneplusBuds rightBuds = OneplusBuds.getInstance();
        OneplusBuds leftBuds = OneplusBuds.getInstance();
        rightBuds.press();
        leftBuds.press();
    }
}
