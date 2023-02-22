package day1;

public class Program9 {

	public static void main(String[] args) {

		int[] array = { 2, 4, 7, 5, 9, 1 };
		reverseArray(array);

	}

	public static void reverseArray(int array[]) {
		int temp = 0;

		for (int i = 0; i < array.length / 2; i++) {

			temp = array[i];
			array[i] = array[array.length - i - 1];
			array[array.length - i - 1] = temp;

		}

		System.out.println("Reverse Order : ");
		print(array);
		System.out.println();
	}

	public static void print(int array[]) {
		for (int i = 0; i < array.length; i++) {

			System.out.print(array[i] + " ");

		}
	}
}
