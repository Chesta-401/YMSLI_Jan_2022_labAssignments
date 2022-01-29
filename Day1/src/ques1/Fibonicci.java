//Fibonacci program to display the first 20 Fibonacci numbers F(n), where 
//F(n)=F(n–1)+F(n–2) and F(1)=F(2)=1. Also compute their average.
package ques1;

public class Fibonicci {

	public static void main(String[] args) {
		int f0=1;
		int f1=1;
		int sum = f0+f1;
		float avg=0;
		System.out.println("The sum of first 20 fibonicci numbers are:-");
		System.out.print(f0+ " "+f1+" ");
		for(int i=2;i<20;i++) {
			int f2= f0+f1;
			sum+=f2;
			f0 = f1;
			f1=f2;
			System.out.print(f2+" ");
		}
		avg = sum/20;
		System.out.println();
		System.out.println("The average is "+avg);
	}

}
