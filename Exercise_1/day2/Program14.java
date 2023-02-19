package day2;

public class Program14 {
   String name = "Bidda";
   int   rollnumber = 32;
   public static void main(String[] args) {
	   Result result = new Result();
	   result.calculate();
   }
}

class Exam extends Program14{
	int Maths = 96;
	int Chemistry = 88;
	int Physics = 90;
	
}


class Result extends Exam{
	int totalMark;
	public void calculate()
	{
		totalMark = Maths+Chemistry+Physics;
		System.out.println("Student Name : "+name+" and Rollno : "+rollnumber+" and Total Mark : "+totalMark);
		
	}
}