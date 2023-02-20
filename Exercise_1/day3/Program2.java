package day3;

public class Program2 {
	public static void main(String[] args) {
     Circle circle = new Circle();
     Square square = new Square();
     Triangle triangle = new Triangle();
     Sphere sphere = new Sphere();
     Cuboid cuboid = new Cuboid();
     
     System.out.println("Area of circle :"+circle.calculateArea());
     System.out.println("Area of square :"+square.calculateArea());
     System.out.println("Area of Triangle :"+triangle.calculateArea());
     System.out.println("Area of sphere :"+sphere.calculateArea());
     System.out.println("Volume of sphere :"+sphere.calculateArea());
     System.out.println("Area of cuboid :"+cuboid.calculateArea());
     System.out.println("Volume of cuboid :"+cuboid.calculateArea());
}
}
interface CalcArea{
	double calculateArea();
	
}
interface CalcVolume{
	double calculateVolume();
}

class Circle implements CalcArea{

	
    double pi = 3.14;
    double r = 22;
	@Override
	public double calculateArea() {
		double area = pi * r * r;
		return area;
	}
	
}
class Square implements CalcArea{

	
	int length = 55;
	
	@Override
	public double calculateArea() {
		
		return length*length;
	}
	
}

class Triangle implements CalcArea,CalcVolume{

	@Override
	public double calculateVolume() {
		
		return 0;
	}

	@Override
	public double calculateArea() {
		
		return 0;
	}
	
}

class Sphere implements CalcArea,CalcVolume{
   
	double pi = 3.14;
    double r = 22;
    
	@Override
	public double calculateVolume() {
		double c = 4/3;
		double volume = c * pi * r*r*r;
		return volume;
	}

	
	@Override
	public double calculateArea() {
		double area = pi * r * r;
		return area;
	}
	
}


class Cuboid implements CalcArea,CalcVolume{
    
	double a = 3;
	@Override
	public double calculateVolume() {
		
		return a*a;
	}

	@Override
	public double calculateArea() {
		
		return a*a*a;
	}
	
}
