package day2;

public class Program16 {
	public static void main(String[] args) {
		X x1 = new X();
		X x2 = new Y();
		Y y1 = new Y();

		y1.do2();
	}
}

class X {

	void do1() {

	}
}

class Y extends X {

	void do2() {

	}
}