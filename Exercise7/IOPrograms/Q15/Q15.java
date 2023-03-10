package IOPrograms.Q15;
import java.io.*;
/*@author Hari Prasath V
 *  @version 1.0
  */
public class Q15 {
    public static void main(String[] args) {

        try (BufferedReader reader = new BufferedReader(new FileReader( "IOPrograms/Q15/sourcefile.txt"));
        BufferedWriter writer = new BufferedWriter(new FileWriter("IOPrograms/Q15/destinationfile.txt"))) {
            String string;
            while ((string = reader.readLine()) != null) {
                writer.write(string);
                writer.newLine();
            }
            System.out.println("File copied successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
