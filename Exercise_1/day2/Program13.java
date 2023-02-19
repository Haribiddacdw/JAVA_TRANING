package day2;

public class Program13 {
	public static void main(String[] args) {
		B1 b = new B1();
       //We cannot instantiate an abstract class in Java because it is abstract, it is not complete, hence it cannot be used
	}
}

abstract class B1{
	
	public void check() {
		 System.out.println("Iam abstract class");
	}
}