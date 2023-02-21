package day1;

public class Program22 {
	public static void main(String args[]) {
		Test test = new Test();

		System.out.println("Public data members Access :" + test.number1);
		// System.out.print("Private data members Access"+test.number2); //The field
		// Test.number2 is not visible Because it is private variable

		System.out.println("Protected data members Access :" + test.number3);
		System.out.println("Default data members Access :" + test.number4);
		System.out.println();
		test.display1();
		// test.display2(); //The method display2() from the type Test is not visible
		// Because it is private method
		test.display3();
		test.display4();
		test.getNumber2();
	}

}

class Test {

	public int number1 = 32;
	private int number2 = 29;
	protected int number3 = 33;
	int number4 = 1;

	public void display1() {
		System.out.println("Public method Access");
	}

	@SuppressWarnings("unused")
	private void display2() {
		System.out.println("Private method Access");
	}

	protected void display3() {
		System.out.println("Protected method Access");
	}

	void display4() {
		System.out.println("default method Access");
	}

	public int getNumber2() {
		return number2;
	}

	public void setNumber2(int number2) {
		this.number2 = number2;
	}
}
