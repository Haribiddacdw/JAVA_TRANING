package IOPrograms.Q15;
import java.io.*;
/*@author Hari Prasath V
 *  @version 1.0
  */
public class FileCopy{
    public static void main(String[] args) {

        try (BufferedReader reader = new BufferedReader(new FileReader( "IOPrograms/Q15/sourcefile.txt"));
        BufferedWriter writer = new BufferedWriter(new FileWriter("IOPrograms/Q15/destinationfile.txt"))) {
            String string;
            int count=0;
            while ((string = reader.readLine()) != null) {
                if(count==3) break;
                writer.write(string);
                writer.newLine();
                count++;
            }
            System.out.println("File copied successfully.");
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
