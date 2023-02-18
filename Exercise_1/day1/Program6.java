package day1;
import java.util.Arrays;
import java.util.Scanner;
public class Program6 {
	    public static void main(String[] args) {
	    	try (Scanner scan = new Scanner(System.in)) {
				int[] oldArray = {1,2,3,4,5};
				System.out.println("Enter new Array Size :");
				int newSize = scan.nextInt();
				int[] newArray = Arrays.copyOf(oldArray, newSize);
				oldArray = null;
				System.out.println(Arrays.toString(newArray));
			}
	    }
	
}
