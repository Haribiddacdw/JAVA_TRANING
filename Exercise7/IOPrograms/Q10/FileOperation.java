package IOPrograms.Q10;

import java.io.File;
/*@author Hari Prasath V
 *  @version 1.0
  */
public class FileOperation {
    public static void main(String[] args) {

        File file = new File("IOPrograms/Q10/demo.txt"); 

        File renamedFile = new File("IOPrograms/Q10/demo222.txt");
        
        boolean flag = file.renameTo(renamedFile);
        if (flag == true) {
            System.out.println("File Successfully Rename");
        } else {
            System.out.println("Operation Failed");
        }

        File fileSize = new File("IOPrograms/Q10/size.txt"); 

        System.out.println("Size of the File :"+fileSize .length());

        if (renamedFile.delete()) 
            {
                System.out.println(renamedFile.getName() + " deleted"); 
            } else {
                System.out.println("failed");
            }
}
}