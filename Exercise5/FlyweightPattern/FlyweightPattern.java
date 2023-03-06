package FlyweightPattern;
import java.util.HashMap;
import java.util.Map;

/*@author Hari Prasath V
 *  @version 1.0
  */
//client
public class FlyweightPattern {
    /**
     * 
     * @param args
     * @return null
     */
    public static void main(String[] args) {
        MovieTicket movieTicket1 = (MovieTicket) TicketFactory.getTicket("Transformers 5 ");
        movieTicket1.printTicket("Time : 14:00-16:30", "Seat : D-5");
        MovieTicket movieTicket2 = (MovieTicket) TicketFactory.getTicket("Transformers 5 ");
        movieTicket2.printTicket("Time : 14:00-16:30", "Seat : F-6");
        MovieTicket movieTicket3 = (MovieTicket) TicketFactory.getTicket("Transformers 5 ");
        movieTicket3.printTicket("Time : 18:00-22:30", "Seat : A-2");
    }
}
//flyweight
interface Ticket {

    public void printTicket(String time, String seat);

}
//ConcreteFlyweight
class MovieTicket implements Ticket {
    
    //intrinsicState
    private String movieName;
    private String price;

    public MovieTicket(String movieName) {
        this.movieName = movieName;
        price = "Price " + "120";
    }

    @Override
    public void printTicket(String time, String seat) {
       
        System.out.printf("Movie Name :"+movieName);
        System.out.printf(time+" ");
        System.out.printf(seat+" ");
        System.out.printf(price+" ");
        System.out.println();
      
    }
}

//FlyweightFactory
 class TicketFactory {
    private static Map<String, Ticket> map = new HashMap<>();
    public static Ticket getTicket(String movieName) {
        if (map.containsKey(movieName)) {
            // object already been created it has been return that object
            return map.get(movieName);
        } else {
            Ticket ticket = new MovieTicket(movieName);
            map.put(movieName, ticket);
            return ticket;
        }
    }
}

 //store intrinsic properties in separate object to reduce memory consumption
 //where we will store that objects in need to access it ?
 //use factory pattern to store that FlyweightObjects 
