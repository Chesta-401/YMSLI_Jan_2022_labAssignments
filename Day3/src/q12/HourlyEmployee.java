package q12;

public class HourlyEmployee extends Employee {
	
	private int hourWorked;
	
	public int getHourWorked() {
		return hourWorked;
	}

	public void setHourWorked(int hourWorked) {
		this.hourWorked = hourWorked;
	}

	HourlyEmployee(String name, int id, double salary, double rate,int hourWorked) {
		super(name, id,salary,rate);
		this.hourWorked = hourWorked;
	}

	 public double getPayment() {
		 setSalary(getRate()*hourWorked);
		 return getSalary();
	 }
	 
}