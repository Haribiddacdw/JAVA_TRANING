package IOPrograms.Q16;
import java.io.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
/*@author Hari Prasath V
 *  @version 1.0
  */
public class DateReadAndWrite {
    public static void main(String[] args) {
   
        // Write Date object to file
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("IOPrograms/Q16/dateFile.txt"))) {
            Date date = new Date();

            DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd");  
            String strDate = dateFormat.format(date);  
            System.out.println("Converted String: " + strDate);  

            outputStream.writeObject(strDate);

            System.out.println("Date object written to file.");
        } catch (IOException e) {
            System.out.println(e);
        }

        // Read Date object from file
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("IOPrograms/Q16/dateFile.txt"))) {
            String strDate =  (String) inputStream.readObject();
            System.out.println("Date object read from file: " + strDate );
        } catch (IOException | ClassNotFoundException e) {
           System.out.println(e);
        }
    }
}

