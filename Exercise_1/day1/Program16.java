package day1;

import java.util.Scanner;

public class Program16 {
	public static void main(String[] args) {
    	try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Enter the element");
			int element = scan.nextInt();
			System.out.println("Enter the number you want that its location and occurrence ");
			int key = scan.nextInt();
			
			String s=String.valueOf(element);  
			int length = s.length(); 
			int count=0;
			String locations=" ";
			while(element>0)
			{
				
				int rem = element%10;
				if(rem==key)
				{
					count++;
					locations=locations+","+String.valueOf(length);
				}
				element/=10;
				length--;
			}
			if(count==0)
			System.out.println("Element is not Present");
			else
			{
			System.out.println("Occurrence of that number is "+count);	
			System.out.println("Location of that numbers :"+locations);
			}
		}
    }
}
