package q5;

public class Convertible extends Car {
	boolean isHoodOpen;

	public Convertible(int noOfWheel, int noOfPassenger, int model, String make, int noOfDoor, boolean isHoodOpen) {
		super(noOfWheel, noOfPassenger, model, make, noOfDoor);
		this.isHoodOpen = isHoodOpen;
	}

	public void display() {
		super.display();
		if (isHoodOpen)
			System.out.println("Hood: Open");
		else
			System.out.println("Hood: Closed");
	}
}