package q5;

public class Car extends Vehicle {
	private int noOfDoor;

	public Car(int noOfWheels, int noOfPassangers, int model, String make, int noOfDoor) {
		super(noOfWheels, noOfPassangers, model, make);
		this.noOfDoor = noOfDoor;
	}

	public void display() {
		System.out.println("Make: " + getMake());
		System.out.println("Model: " + getModel());
		System.out.println("Doors: " + noOfDoor);
	}
}