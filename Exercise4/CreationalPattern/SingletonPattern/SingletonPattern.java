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
        ClassBoard student1 = ClassBoard.getInstance();
        ClassBoard student2 = ClassBoard.getInstance();
        student1.visibility();
        student2.visibility();
        System.out.println("Student1 :"+student1);
        System.out.println("Student2 :"+student2);
    }
}
