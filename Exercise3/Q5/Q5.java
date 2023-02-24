package Q5;


public class Q5  
{    
       
    public static void main(String args[])  
    {    
        Start t1=new Start();    
        // this will call run() method  
        t1.start();    
        t1.start(); 
    }    

}  

class Start extends Thread{
    public void run()  
    {    
        System.out.println("Thread is running...");    
    } 
}
