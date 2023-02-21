package day3;

import vechicle.Fourwheeler;

class Car extends Fourwheeler {

	private String make;
	private String model;

	public Car(String make, String model) {
		super(4);
		this.make = make;
		this.model = model;
	}

	public String getMake() {
		return make;
	}

	public String getModel() {
		return model;
	}

	@Override
	public void drive() {
		System.out.println("Driving the car...");
	}
}
