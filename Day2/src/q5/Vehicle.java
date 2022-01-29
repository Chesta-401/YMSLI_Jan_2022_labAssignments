package q5;

public class Vehicle {
	private int noOfWheel;
	private int noOfPassanger;
	private int model;
	private String make;

	public Vehicle(int noOfWheel, int noOfPassanger, int model, String make) {
		this.noOfWheel = noOfWheel;
		this.noOfPassanger = noOfPassanger;
		this.model = model;
		this.make = make;
	}

	public int getNoOfWheel() {
		return noOfWheel;
	}

	public void setNoOfWheel(int noOfWheel) {
		this.noOfWheel = noOfWheel;
	}

	public int getNoOfPassanger() {
		return noOfPassanger;
	}

	public void setNoOfPassanger(int noOfPassanger) {
		this.noOfPassanger = noOfPassanger;
	}

	public int getModel() {
		return model;
	}

	public String getMake() {
		return make;
	}

	public void display() {
		System.out.println("Make: " + make);
		System.out.println("Model: " + model);
		System.out.println("No. Of Wheels: " + noOfWheel);
		System.out.println("No. Of Passangers: " + noOfPassanger);
	}
}