/*  Implement following UML diagram, Write a program to test circle class
		 */
package q1;


		class Circle {
			private double radius;
			private String color;

			public Circle() {
				radius = 1;
				color = "Red";
			}

			public Circle(double r) {
				radius = r;
			}

			public double getRadius() {
				return radius;
			}

			public double getArea() {
				return 3.14 * radius * radius;
			}
		}

		
		public class UML {

			public static void main(String[] args) {
				

				// TODO Auto-generated method stub
				Circle circle1 = new Circle();
				Circle circle2=new Circle(1.5);
				System.out.println("Radius is: " + circle1.getRadius());
				System.out.println("Area is: " + circle1.getArea());
				System.out.println("Radius is: " + circle2.getRadius());
				System.out.println("Area is: " + circle2.getArea());

			}

		

	}


