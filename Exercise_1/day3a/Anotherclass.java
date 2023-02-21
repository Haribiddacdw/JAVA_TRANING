package day3a;

import day3.DerivedClass;

public class Anotherclass {
	public static void main(String[] args) {
//	  Program5 obj = new Program5();
//	  obj.protectedMethod();
		DerivedClass dc = new DerivedClass();
		dc.callProtectedMethod();

	}
}
