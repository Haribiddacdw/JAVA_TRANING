package day1;

public class Program3 {

	public static void main(String[] agrs) {
		byte byteValuea = 29;
		System.out.println("Implicit Type Casting from byte to double");
		System.out.println("byte Value  :" + byteValuea);
		short shortValue = byteValuea;
		System.out.println("short value :" + shortValue);
		int intValue = shortValue;
		System.out.println("int value :" + intValue);
		long longValue = intValue;
		System.out.println("long value :" + longValue);
		float floatValue = longValue;
		System.out.println("float value :" + floatValue);
		double doubleValue = floatValue;
		System.out.println("double value :" + doubleValue);

		System.out.println("Explicit Type Casting from double to byte");
		double doubleValue1 = doubleValue;
		System.out.println("double value :" + doubleValue1);
		float floatValue2 = (float) doubleValue1;
		System.out.println("float value :" + floatValue2);
		long longValue2 = (long) floatValue2;
		System.out.println("long value :" + longValue2);
		int intValue2 = (int) longValue2;
		System.out.println("int value :" + intValue2 );
		short shortValue2  = (short) intValue2 ;
		System.out.println("short value :" +shortValue2);
		byte byteValue = (byte) shortValue2;
		System.out.println("byte value :" + byteValue);
	}
}
