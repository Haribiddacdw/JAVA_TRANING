package day1;

public class Program26 {
	public static void main(String[] args) {
		int i = -243;
		int j = 243;
		if (i == j)
			;
		System.out.println("numbers are same");
	}
}

// line 6 ,there is a closing statement after if condition, so that why output is showing wrong
// please remove the semicolon after if condition in the line number 6