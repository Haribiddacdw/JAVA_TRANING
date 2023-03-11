package IOPrograms.Q11;

import java.io.File;
/*@author Hari Prasath V
 *  @version 1.0
  */
public class ListDirectory {
    public static void main(String args[]){
        File dirname = new File(args[0]); 

        if(dirname.isDirectory())
        {
        String s[]=dirname.list();
        for(int i=0;i<s.length;i++)
        { 
            System.out.println(s[i]); 
        }   
       }else{

       }

    } 

}


 
