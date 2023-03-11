package IOPrograms.Q14;
import java.io.*;
/*@author Hari Prasath V
 *  @version 1.0
  */
public class FileCopy {
    public static void main(String[] args) {

        try (Reader reader = new FileReader( "IOPrograms/Q14/sourcefile.txt");
             Writer writer = new FileWriter("IOPrograms/Q14/destinationfile.txt")) {
            int i;
            while ((i = reader.read()) != -1) {
                
                writer.write(i);
            }
            System.out.println("File copied successfully....");
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
