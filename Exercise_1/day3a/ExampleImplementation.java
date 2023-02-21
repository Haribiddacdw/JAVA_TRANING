package day3a;

import day3.Program6;

public class ExampleImplementation implements Program6 {

	@Override
	public void methodOne() {
		System.out.println("Method One implementation");

	}

	@Override
	public void methodTwo() {
		System.out.println("Method Two implementation");
	}

	@Override
	public void methodThree() {
		System.out.println("Method Three implementation");
	}

}

class ExampleUsage {
	public static void main(String[] args) {
		ExampleImplementation eim = new ExampleImplementation();
		eim.methodOne();
		eim.methodTwo();
		eim.methodThree();
	}
}