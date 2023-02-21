package day2;

import java.util.Arrays;

public class Program1 {

	public static void main(String[] args) {
		int data = 32;
		Value value = new Value();
		value.passByValue(data);
		System.out.println("Pass By Value " + data);// passbyvalue

		int[] array = { 1, 2, 7, 4, 5 };
		ReferenceArray RA = new ReferenceArray();
		RA.passByReference(array);// passByReferenceArray
		System.out.println("Pass By ReferenceArray " + Arrays.toString(array));

		ReferenceObject obj = new ReferenceObject();
		System.out.println("Before Pass By ReferenceObject " + obj.a);
		obj.passByObject(obj); // passByReferenceObject
		System.out.println("After Pass By ReferenceObject " + obj.a);
	}
}

class Value {

	public void passByValue(int data) {
		
		data = 23;
	}

}

class ReferenceArray {

	public void passByReference(int[] array) {
		array[2] = 3;
	}

}

class ReferenceObject {
	public int a;

	public ReferenceObject() {
		a = 10;
	}

	public void passByObject(ReferenceObject obj) {
		obj.a++;
	}
}