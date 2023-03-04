package IOPrograms.Q12;

import java.io.*;
/*@author Hari Prasath V
 *  @version 1.0
  */

public class Q12 {
    public static void main(String[] args) {

        try (FileInputStream in = new FileInputStream("IOPrograms/Q12/surya.jpg");
             FileOutputStream out = new FileOutputStream("IOPrograms/Q12/surya2.jpg")) {

            byte[] buffer = new byte[2048];
            int bytesRead;

            while ((bytesRead = in.read(buffer)) != -1) {
                out.write(buffer,0, bytesRead);
            }
            System.out.println("Image copied successfully.");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
