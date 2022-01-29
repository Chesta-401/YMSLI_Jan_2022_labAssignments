package q5;
import q5.SportsCar;
import q5.Car;
import q5.Convertible;
import java.util.*;

public class ApplicationOverriding {

	public static void main(String[] args) {
		
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter make: ");
			String make = sc.nextLine();
			System.out.print("Enter model: ");
			int model = sc.nextInt();
			System.out.println("Enter number of Wheels: ");
			int noOfWheel = sc.nextInt();
			System.out.println("Enter number of Passengers: ");
			int noOfPassenger = sc.nextInt();
			System.out.println("Enter number of Doors: ");
			int noOfDoor = sc.nextInt();

			System.out.println("1. Create a Vehicle Object");
			System.out.println("2. Create a Car Object");
			System.out.println("3. Create a Convertible Object");
			System.out.println("4. Create a SportCar object");
			System.out.println("Enter choice: ");
			int choice = sc.nextInt();
			sc.nextLine();
			switch (choice) {
			case 1:
				Vehicle vehicle = new Vehicle(noOfWheel, noOfPassenger, model, make);
				vehicle.display();
				break;
			case 2:
				Car car = new Car(noOfWheel, noOfPassenger, model, make, noOfDoor);
				car.display();
				break;
			case 3:
				System.out.println("Enter 'Yes' if hood is open and 'No' if hood is close");
				String isHoodOpen = sc.nextLine();
				boolean stateOfHood = false;
				if (isHoodOpen.equals("Yes")) {
					stateOfHood = true;
				} else {
					stateOfHood = false;
				}
				Convertible convertible = new Convertible(noOfWheel, noOfPassenger, model, make, noOfDoor, stateOfHood);
				convertible.display();
				break;
			case 4:
				SportsCar sports = new SportsCar(noOfWheel, noOfPassenger, model, make);
				sports.display();
				break;
			default:
				System.out.println("Please enter choice from 1-4");
			}
		}

	

}
