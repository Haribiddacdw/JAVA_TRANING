package CreationalPattern.SingletonPattern;

/**
 * 
 * The ClassBoard  class represents a singleton pattern implementation for a
 * no of students.
 * 
 * Only one instance of the class can exist at any given time, which is accessed
 * through the getInstance() method.
 */

public class ClassBoard {
    private static ClassBoard classBoard;

    /** Private constructor to prevent external instantiation of the class. */

    private ClassBoard() {
        
    }

    /**
     * Returns the instance of ClassBoard . If an instance has not yet been created,
     * creates a new instance and returns it. Otherwise, returns the existing
     * instance
     */

    public static ClassBoard getInstance() {

        if (classBoard == null) {

            classBoard = new ClassBoard();
        } else {
            return classBoard;
        }
        return classBoard;
    }

    public void visibility() {
        System.out.println("ABCDEFGH");
    }

    
}





/*
1) There should be only one instance allowed for a class and

2) We should allow global point of access to that single instance.

Private constructor to restrict instantiation of the class from other classes.

Private static variable of the same class that is the only instance of the class.

Public static method that returns the instance of the class, this is the global access point for outer world to get the instance of the singleton class.
 */
