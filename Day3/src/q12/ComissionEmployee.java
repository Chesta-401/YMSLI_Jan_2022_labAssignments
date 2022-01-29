package q12;

public class ComissionEmployee extends Employee {
	private double totalWeeklySale;
	private double percentage;
	
	public ComissionEmployee(String name, int id, double salary, double rate, double totalWeeklySale,
			double percentage) {
		super(name, id, salary, rate);
		this.totalWeeklySale = totalWeeklySale;
		this.percentage = percentage;
	}

	public double getTotalWeeklySale() {
		return totalWeeklySale;
	}

	public void setTotSale(int totSale) {
		this.totalWeeklySale = totSale;
	}

	public double getPercentage() {
		return percentage;
	}

	public void setPercentage(int percentage) {
		this.percentage = percentage;
	}

	public double getPayment() {
		setSalary((totalWeeklySale * percentage) / 100);
		return getSalary();
	}

	
}
