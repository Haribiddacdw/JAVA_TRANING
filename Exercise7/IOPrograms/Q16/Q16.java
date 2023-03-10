package IOPrograms.Q16;
import java.io.*;
import java.util.Date;
/*@author Hari Prasath V
 *  @version 1.0
  */
public class Q16 {
    public static void main(String[] args) {
   
        // Write Date object to file
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("IOPrograms/Q16/dateFile.txt"))) {
            Date date = new Date();
            outputStream.writeObject(date);
            System.out.println("Date object written to file.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Read Date object from file
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("IOPrograms/Q16/dateFile.txt"))) {
            Date date = (Date) inputStream.readObject();
            System.out.println("Date object read from file: " + date);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
