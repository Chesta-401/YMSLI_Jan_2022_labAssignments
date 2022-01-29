
/*  An Employee Record System
You need to implement the Employee records of a company. The Company has 3 types of employee;
1) Salaried employee-> This type of employees are paid a fixed weekly salary regardless of the number of 
hours worked.
2) Hourly employee -> They are paid by the hour. They have an hourly rate and their payment will depend 
on how many hours they worked. The more they work, the more they will be paid. So, the salary will be 
[hour worked per week* hourly rate]. 
3) Commission employee-> They are paid a percentage of their sales. If their percentage is “a” and total 
weekly sale is ”b”, the total weekly salary will be [a*b/100];
 */
package q12;
import java.util.*;
import q12.SalariedEmployee;
import q12.ComissionEmployee;
import q12.HourlyEmployee;
public class EmployeeRecordSystem{

	public static void main(String[] args) {
		ArrayList<Employee> employee = new ArrayList<Employee>();

		Employee employee1 = new SalariedEmployee("Chesta", 417, 1000000, 10);
		Employee employee2 = new ComissionEmployee("Raj", 41717, 35000, 20, 1000000, 30);
		Employee employee3 = new HourlyEmployee("Shruti", 33332, 60000, 15, 48);

		Invoice inv = new Invoice("41242", "Gear", 10, 400);

		employee.add(employee1);
		employee.add(employee2);
		employee.add(employee3);

		System.out.println("Salary Of " + employee1.getName() + " is " + employee1.getPayment());
		System.out.println("Salary Of " + employee2.getName() + " is " + employee2.getPayment());
		System.out.println("Salary Of " + employee3.getName() + " is " + employee3.getPayment());
		System.out.println("Invoice: "+inv);
		System.out.println("Total Cost: " + inv.getPayment());
	}
}