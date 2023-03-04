package IOPrograms.Q11;

import java.io.File;
/*@author Hari Prasath V
 *  @version 1.0
  */
public class Q11 {
    public static void main(String args[]){
        File dirname = new File(args[0]); 

        if(dirname.isDirectory())
        {
        String s[]=dirname.list();
        for(int I=0;I<s.length;I++)
        { 
            System.out.println(s[I]); 
        }   
       }else{

       }

    } 

}


 
