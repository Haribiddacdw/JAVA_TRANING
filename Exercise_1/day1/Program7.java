package day1;

public class Program7 {
	public static void main(String[] args) {
//	  Scanner scan = new Scanner(System.in);
		int[] array = { 2, 4, 7, 5, 9, 1 };
		ascendingOrder(array);
		decendingOrder(array);
	}

	public static void ascendingOrder(int array[]) {
		int temp = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] > array[j]) {
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		System.out.println("ascending Order : ");
		print(array);
		System.out.println();
	}

	public static void decendingOrder(int array[]) {
		int temp = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] < array[j]) {
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		System.out.println("Descending Order : ");
		print(array);
	}

	public static void print(int array[]) {
		for (int i = 0; i < array.length; i++) {

			System.out.print(array[i] + " ");

		}
	}
}
