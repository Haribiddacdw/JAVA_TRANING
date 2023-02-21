package day1;

public class Program3 {

	public static void main(String[] agrs) {
		byte a = 29;
		System.out.println("Implicit Type Casting from byte to double");
		System.out.println("byte Value  :" + a);
		short b = a;
		System.out.println("short value :" + b);
		int c = b;
		System.out.println("int value :" + c);
		long d = c;
		System.out.println("long value :" + d);
		float e = d;
		System.out.println("float value :" + e);
		double f = e;
		System.out.println("double value :" + f);

		System.out.println("Explicit Type Casting from double to byte");
		double a1 = f;
		System.out.println("double value :" + a1);
		float b1 = (float) a1;
		System.out.println("float value :" + b1);
		long c1 = (long) b1;
		System.out.println("long value :" + c1);
		int d1 = (int) c1;
		System.out.println("int value :" + d1);
		short e1 = (short) d1;
		System.out.println("short value :" + e1);
		byte f1 = (byte) e1;
		System.out.println("byte value :" + f1);
	}
}
