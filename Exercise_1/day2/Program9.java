package day2;

public class Program9 {

	public int a = 10;
	protected int b = 12;
	private int c = 14;

}

class B extends Program9 {

	public static void main(String[] args) {

		Program9 object = new Program9();

		System.out.println("Public member from class A " + object.a);
		System.out.println("Private member from class A " + object.b);
		System.out.println("Protected member from class A " + object.c); // The field Program9.c is not visible because
																			// it is Protected

	}

}