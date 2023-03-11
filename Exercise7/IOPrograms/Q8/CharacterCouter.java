package IOPrograms.Q8;
import java.util.Scanner;
/*@author Hari Prasath V
 *  @version 1.0
  */
public class CharacterCouter{
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int count = 0;
            try  {
                //if there is a next input, and adding the length of the input to the count variable.
                while (scanner.hasNext()) {
                    String line = scanner.next();
                    count += line.length();
                }
            }finally{
                System.out.println("Number of characters entered: " + count);
            }
        }
    }
}
