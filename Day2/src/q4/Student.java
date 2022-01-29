

/*Create a Student Class with 3 instance variables for name, id and grade. Create 3 overloaded constructors 
and 2 overloaded methods.
*/
package q4;

public class Student {
	private String name;
	private String id;
	private double grade;

	public Student(String id) {
		this.id = id;
	}

	public Student(String name, String id) {
		this(id);
		this.name = name;
	}

	public Student(String name, String id, double grade) {
		this(name, id);
		this.grade = grade;

	}

	public void display() {
		if (id != null)
			System.out.println("ID: " + id);
		if (name != null)
			System.out.println("Name: " + name);
		System.out.println("Grade: " + grade);
	}

	public void display(int year) {
		this.display();
		System.out.println("Year: " + year);
	}


}