package day2;

public class Program8 {
	public static void main(String[] args) {
		SingletonClass object = SingletonClass.getInstance();

	}
}

class SingletonClass {

	private static SingletonClass object;

	private SingletonClass() {
		// other classes cannot to create an object of this class.
	}

	public static SingletonClass getInstance() {

		if (null == object)
			object = new SingletonClass();

		return object;
	}
}