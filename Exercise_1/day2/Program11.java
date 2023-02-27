package day2;

class Program11 {

	Program11(int value) {

		System.out.println("Class A with a value  " + value);

	}
}

class B {

	B(int value) {
		System.out.println("Class B with a value " + value);
	}

}

public class C extends A {

	private B b;

	C(int a, int b) {

		super(a);
		this.b = new B(33);
	}

	public static void main(String[] args) {
		C c = new C(32, 29);
	}

}