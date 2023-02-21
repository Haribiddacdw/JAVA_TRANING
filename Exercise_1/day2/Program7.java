package day2;

public class Program7 {
	public static void main(String[] agrs) {
		final Demo obj = new Demo("Dhoni", 7);
		obj.display();
		obj.favCricketer = "Virat Kohli";
		obj.jourseyNumber = 18;
		obj.display();
	}
}

class Demo {

	String favCricketer;
	int jourseyNumber;

	Demo(String name, int number) {
		favCricketer = name;
		jourseyNumber = number;

	}

	void display() {
		System.out.println(
				"Name of favorite cricket player : " + favCricketer + " and his joursey number is " + jourseyNumber);
	}

}