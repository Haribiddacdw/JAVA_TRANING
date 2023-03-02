package CreationalPattern.SingletonPattern;

/**
 * 
 * The OneplusBuds class represents a singleton pattern implementation for a
 * pair of OnePlus earbuds.
 * 
 * Only one instance of the class can exist at any given time, which is accessed
 * through the getInstance() method.
 */

public class OneplusBuds {
    public static OneplusBuds buds;

    /** Private constructor to prevent external instantiation of the class. */

    private OneplusBuds() {
        System.out.println("hi");
    }

    /**
     * Returns the instance of OneplusBuds. If an instance has not yet been created,
     * creates a new instance and returns it. Otherwise, returns the existing
     * instance.
     * 
     * @return The instance of OneplusBuds.
     */

    public static OneplusBuds getInstance() {
        if (buds == null) {

            buds = new OneplusBuds();
        } else {
            return buds;
        }
        return buds;
    }

    public void press() {
        System.out.println("Call hang up or Pause or Play");
    }

    
}