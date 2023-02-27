package day3;

public class Program5 {
	protected void protectedMethod() {
		System.out.println("This is a Protected Method");
	}
}

public class DerivedClass extends Program5 {
	public void callProtectedMethod() {
		protectedMethod();
	}
}