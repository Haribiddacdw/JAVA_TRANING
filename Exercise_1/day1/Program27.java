package day1;

public class Program27 {
	public static void main(String[] args) {
		float total = 14000;
		System.out.println("Original Investment: $" + total);
		total = total + (total * .4F);
		System.out.println("After one year: $" + total);
		total = total - 1500f;
		System.out.println("After two year: $" + total);
		total = total + (total * .12F);
		System.out.println("After three year: $" + total);
	}
}
