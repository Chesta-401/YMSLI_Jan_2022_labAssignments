package q4;

public class ApplicationOverloading {

	public static void main(String[] args) {
		Student s1=new Student("111");
		s1.display();
		Student s2=new Student("Chesta","42",10);
		s2.display();
		Student s3=new Student("Chesta","415");
		s3.display();
		s3.display(2000);

	}

}
