package q12;

abstract public class Employee implements Payable{
	
	private String name;
	private int id;
	private double salary;
	private double rate;
	
	public Employee(String name, int id, double salary, double rate) {
		
		this.name = name;
		this.id = id;
		this.salary = salary;
		this.rate = rate;
	}
	

	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public double getRate() {
		return rate;
	}
	public void setRate(double rate) {
		this.rate = rate;
	}

	
	public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}
	
	
	public double getPayment() {
		return getSalary();
	}
	
	
	
}