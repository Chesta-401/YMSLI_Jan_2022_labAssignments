/*
 * Write a program to serialize and deserialize an object of Employee class. Employee class has the following 
		members.
 */
package q3;
import java.io.*;


class Employee implements Serializable {

	private static final long serialVersionUID = 1L;
	private String name;
	private String id;
	private String address;
	private transient double salary;

	public Employee(String name, String id, String address, double salary) {

		this.name = name;
		this.id = id;
		this.address = address;
		this.salary = salary;
	}

	public void display() {
		System.out.println("Name: " + name);
		System.out.println("ID: " + id);
		System.out.println("Address: " + address);
		System.out.println("Salary: " + salary);
	}
}

public class SerializableDeserializable  {
	// serialization---------------------------------------------
	public static void serialize(Employee employee, String file) {
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file))) {
			oos.writeObject(employee);
			System.out.println("Serialization is done");
			employee.display();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

	}

	// deserialization-----------------------------------------------
	public static void deserialize(String file) {
		Employee employee1 = null;
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
			employee1 = (Employee) ois.readObject();
			System.out.println("Deserialization is done");
			employee1.display();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public static void main(String[] args) {
		Employee employee = new Employee("Chesta", "04", "H.No-417", 1000000.00);
		String file = "File3.txt";
		serialize(employee, file);
		deserialize(file);
	}


}


