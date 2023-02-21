package day2;

public class Program5 {
	public static void main(String[] args) {
		ObjectsCount obj1 = new ObjectsCount();
		ObjectsCount obj2 = new ObjectsCount();
		ObjectsCount obj3 = new ObjectsCount();

		System.out.println("The total Number of objects created = " + obj1.count);

	}
}

class ObjectsCount {
	static int count = 0;

	ObjectsCount() {
		count++;
	}
}