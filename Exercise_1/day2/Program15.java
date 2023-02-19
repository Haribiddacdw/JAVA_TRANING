package day2;

public class Program15 {
  public static void main(String[] args)
  {
	  Door door = new Door(20,80);
	  Window window = new Window(20,60);
	  House house = new House(1700,door,window);
	  
	  int doorPrice = house.getDoorCost();
	  int windowPrice = house.getWindowCost();
	  System.out.println("cost for the door :"+doorPrice);
	  System.out.println("cost for the window :"+windowPrice);
  }
}

class House {
	private int area;
	private Door door;
	private Window window;
	
	House(int area,Door door,Window window){
		this.area = area;
		this.door = door;
		this.window = window;
	}
	
	 public int getArea() {
	        return area;
	    }

	   public int getDoorCost() {
	    	
	        return door.doorPrice();
	    }

	   public int getWindowCost() {
	    	
	        return window.windowPrice();
	    }
	    
}

class Door {
	 int area;
	 int costpersquarefeet;
	 
	 Door(int area,int costpersqaurefeet){
		 this.area = area;
		 this.costpersquarefeet = costpersqaurefeet;
	 }
	 
	public int doorPrice()
	{
		return area*costpersquarefeet;
	}
}

class Window {
	int area;
	 int costpersquarefeet;
	 
	 Window(int area,int costpersqaurefeet){
		 this.area = area;
		 this.costpersquarefeet = costpersqaurefeet;
	 }
	public int windowPrice()
	{
		return area*costpersquarefeet;
	}
}