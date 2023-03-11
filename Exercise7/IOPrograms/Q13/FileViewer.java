package IOPrograms.Q13;

import java.io.*;
/*@author Hari Prasath V
 *  @version 1.0
  */
public class  FileViewer{
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("IOPrograms/Q13/sample.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e) {
            System.out.println(e);
        }
    }
}

//eliminate printStacktrace use sysout
//use 
//logger 