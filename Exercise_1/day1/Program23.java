package day1;

public class Program23 {
	
	 protected static int number1 = 29;  //create a class with protected data
	 protected static int number2 = 32;
	 
	public static void main(String args[])
	{
		Tested test1 = new Tested();
		test1.manupulate(number1,number2);
		
	}
	
       
}

class Tested{

    public void manupulate(int number1,int number2) {
    	
 	   System.out.println("Addition of two number the data comes from another class with protected modififer is " +(number1+number2));
 	   
    }
    
}
