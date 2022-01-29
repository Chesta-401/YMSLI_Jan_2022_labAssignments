package q12;

public class SalariedEmployee extends Employee {

	private int weekly = 5;

	SalariedEmployee(String name, int id, double salary, double rate) {
		super(name, id, salary, rate);

	}

	public double getPayment() {
		setSalary(getSalary() * weekly);
		return getSalary();
	}

}