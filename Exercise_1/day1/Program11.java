package day1;

public class Program11 {
	public static void main(String[] args) {

		int number = 10;
		System.out.println("Pattern using Two Dimensional Matrix :");
		print(number);

	}

	public static void print(int n) {
		int number = 1;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < i; j++) {

				System.out.print((number++) + " ");

			}
			System.out.println();
		}
	}
}
