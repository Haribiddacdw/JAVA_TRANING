package day2;

public class Program12 {

	public static void main(String[] args) {
		 Wipro[] wipros = new Wipro[4];
	        wipros[0] = new Wipro();
	        wipros[1] = new WiproTechnologies();
	        wipros[2] = new WiproInfotech();
	        wipros[3] = new WiproBPO();

	        for (Wipro wipro : wipros) {
	            wipro.showInfo();
	        }

	}

}

class Wipro {
    public void showInfo() {
        System.out.println("This is a Wipro.");
    }
}

class WiproTechnologies extends Wipro {
    @Override
    public void showInfo() {
        System.out.println("This is a Wipro Technologies.");
    }
}

class WiproInfotech extends Wipro {
    @Override
    public void showInfo() {
        System.out.println("This is a Wipro Infotech.");
    }
}

class WiproBPO extends Wipro {
    @Override
    public void showInfo() {
        System.out.println("This is a Wipro BPO.");
    }
}


