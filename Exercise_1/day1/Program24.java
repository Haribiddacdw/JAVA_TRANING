package day1;

public class Program24 {
	public static void main(String[] agrs) {
		QuadraticFunctions q = new QuadraticFunctions(2, 3, 4);
		System.out.println("The value of Quadratic function f(x) =" + q.compute(2));

	}
}

class QuadraticFunctions {
	int a, b, c;

	QuadraticFunctions() {
		a = 1;
		b = 1;
		c = 1;

	}

	QuadraticFunctions(int a, int b, int c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public int compute(int x) {
		int fx = (a * x * x) + (b * x) + c;
		return fx;
	}
}