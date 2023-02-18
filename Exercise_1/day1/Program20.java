package day1;

public class Program20 {
	public static void main(String[] args) {
  
		  int row = 4;
		  int column = 4;
		  int[][] array = { {1,2,3,4},
				            {5,6,7,8},
				            {9,10,11,12},
				            {13,14,15,16}
				           };
		  System.out.println("Two Dimensional Matrix :");
	      largestnumberinRow(array,row,column);
		  

	  }
	
	  public static void largestnumberinRow(int[][] array,int row,int column) {
		     int i = 0;
	        int max = 0;
	        while (i < row) {
	        	
	            for (int j = 0; j < array[i].length; j++) {
	                if (array[i][j] > max) {
	                    max = array[i][j];
	                }
	            }
	            System.out.println("The Largest Element in row "+(i+1)+" is "+max);
	            max =0;
	            i++;
	 
	        } 
		  
	  }
}
