package day1;

public class Program11 {
	public static void main(String[] args) {
		System.out.println("Pattern using Two Dimensional Matrix :");
		int[][] array = new int[4][4];
		int k=1;
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j <= i; j++) {
                 
                array[i][j] = k++;
			}
		}
		print(array);
	}
	public static void print(int[][] array) {
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
			
                if( array[i][j] !=0 )
				System.out.print(array[i][j]+" ");

			}
			System.out.println();
		}
	}
}
