package day1;

public class Program19 {
	public static void main(String[] args) {
  
		  int row = 4;
		  int column = 4;
		  int[][] array = { {1,2,3,4},
				            {5,6,7,8},
				            {9,10,11,12},
				            {13,14,15,16}
				           };
		  System.out.println("Two Dimensional Matrix :");
	      reverseArray(array,row,column);
		  

	  }
	
	  public static void reverseArray(int[][] array,int row,int column) {
		    for(int i=0;i<row;i++) {
		    	int rowstart = 0;
		    	int rowend = column-1;
		    	while(rowstart<rowend)
		    	{
		    		int temp = array[i][rowstart];
		    		array[i][rowstart]=array[i][rowend];
		    		array[i][rowend] = temp;
		    	rowstart++;
		    	rowend--;
		    	}
		    }
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
