package BehavioralPattern.StrategyPattern;
/*@author Hari Prasath V
 *  @version 1.0
 *
  */
public class StrategyPattern {
    /**
     *
     * @param args
     * @return null
     */
    public static void main(String[] args) {
        GoodFood goodFood = new GoodFood();
        goodFood.food = new Biryani();
        goodFood.displayFoodNames();
    }
}

/**
 * The GoodFood class contains a Food object and provides a method to display
 * the name of the food.
 */

class GoodFood {
    Food food;

    public void displayFoodNames() {
        food.foodName();
    }
}

/**
 * The Food abstract class defines an abstract method foodName, which must be
 * implemented by all its subclasses.
 */
abstract class Food {
    abstract public void foodName();
}

/**
 * The Biryani class extends the Food class and implements the foodName method
 * to display the name of the food.
 */
class Biryani extends Food {

    @Override
    public void foodName() {
        System.out.println("Biryani is ready");
    }
}

/**
 * The Dosa class extends the Food class and implements the foodName method to
 * display the name of the food.
 */
class Dosa extends Food {
    @Override
    public void foodName() {
        System.out.println("Dosaaaa is ready!!!!");
    }
}

/**
 * Th Chapati class extends the Food class and implements the foodName method to
 * display the name of the food.
 */
class Chapati extends Food {
    @Override
    public void foodName() {
        System.out.println("Chapati is ready");
    }
}



































/* 
 * The Strategy Design Pattern is useful when there is a set of related algorithms and a client object needs to be able to dynamically pick and 
   choose an algorithm from this set that suits its current need. 
 * The Strategy pattern suggests keeping the implementation of each of the algorithms in a separate class.
 *  Each such algorithm encapsulated in a separate class is referred to as a Strategy
*/