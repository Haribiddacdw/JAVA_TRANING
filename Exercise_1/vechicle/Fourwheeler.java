package vechicle;

public abstract class Fourwheeler {
	protected int numWheels;

	public Fourwheeler(int numWheels) {
		this.numWheels = numWheels;
	}

	public int getNumWheels() {
		return numWheels;
	}

	public abstract void drive();
}
