package Q8;

/*@author Hari Prasath V
 *  @version 1.0
 */

 /* Import required packages
  */

public class SharedThread extends Thread {
  StringBuffer sb;

  /*
   * Constructor that initializes the StringBuffer instance variable.
   * @param sb The StringBuffer instance variable to be shared by multiple threads.
   */

  SharedThread(StringBuffer sb) {
    this.sb = sb;
  }

  /**
   * 
   * The run method that defines the behavior of the shared thread.
   */
  public void run() {
    synchronized (sb) {
      System.out.print(Thread.currentThread().getName());
      for (int i = 0; i <= 100; i++) {
        System.out.print(sb);
      }
      System.out.println();
      sb.setCharAt(0, (char) (sb.charAt(0) + 1));
    }
  }

  /**
   * The main method that creates and starts three instances of the SharedThread
   * class with a shared StringBuffer instance.
   * @param args
   * @return null
   */
  public static void main(String[] args) {
    StringBuffer sb = new StringBuffer("H");
    SharedThread t1 = new SharedThread(sb);
    SharedThread t2 = new SharedThread(sb);
    SharedThread t3 = new SharedThread(sb);
    t1.start();
    t2.start();
    t3.start();
  }
}
