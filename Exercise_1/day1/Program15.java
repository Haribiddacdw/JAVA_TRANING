package day1;

public class Program15 {
  public static void main(String[] agrs) {
	  System.out.println("Prime Numbers Between 1 to 100 :");
	  primeNumber();
	  System.out.println();
	  Program15b pA = new Program15b();
	  int number = 28;
	  System.out.println();
	  System.out.println("check wether given number is Armstrong number , Palindrone, Perfect Number ");
	  System.out.println();
	  pA.armstrongNumber(number);
	  pA.palindromeNumber(number);
	  pA.perfectNumber(number);
  }
  static void primeNumber()
  {
	  System.out.println();
	  for(int n=1; n<=100; n++){
		  int c = 0;
		  for (int i = 1; i <= n; i++)
		      if (n % i == 0)
		          c++;
		  if (c == 2)
		      System.out.print(n+" ");
		  else
		      continue;
		  }
  }
}

class Program15b {
	
	public void armstrongNumber(int number){

        int originalNumber, remainder,result = 0;

        originalNumber = number;

        while (originalNumber != 0)
        {
            remainder = originalNumber % 10;
            result += Math.pow(remainder, 3);
            originalNumber /= 10;
        }
        System.out.println((result==number)? number+" is a Armstrong Number":number+" is not a Armstrong Number");
	}
	
	public void palindromeNumber(int number) {
		int  reversedNum = 0, remainder;
	    
	    // store the number to originalNum
	    int originalNum = number;
	    
	    // get the reverse of originalNum
	    // store it in variable
	    while (number != 0) {
	      remainder = number % 10;
	      reversedNum = reversedNum * 10 + remainder;
	      number /= 10;
	    }
	    System.out.println((reversedNum==originalNum )? originalNum +" is a Palindrome":originalNum +" is not a Palindrome");
	}
	
	public void perfectNumber(int number) {
		int sum=0,originalNumber=number;
		originalNumber=number;
		for(int i=1;i<=number/2;i++)
		{
			if(number%i==0)
			{
				sum=sum+i;
			}
		}
	    System.out.println((sum==originalNumber )? originalNumber +" is a Perfect number":originalNumber +" is not a Perfect number");
	}
}
