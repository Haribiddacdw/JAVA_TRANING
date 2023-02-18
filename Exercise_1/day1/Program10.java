package day1;

public class Program10 {
	public static void main(String[] args) {

		  int[][] array = { {1,2,3,4},
				            {5,6,7,8},
				            {9,10,11,12},
				            {13,14,15,16}
				           };
		  System.out.println("Two Dimensional Matrix :");
		  print(array);

	  }
	  public static void print(int array[][])
	  {

		  for(int i=0;i<array.length;i++)
		  {
			  for(int j=0;j<array.length;j++)
			  {
				  
					  System.out.print(array[i][j]+" ");
				  
			  }
			  System.out.println();
		  }
	  }
}
