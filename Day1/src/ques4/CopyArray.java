//	Write a boolean method called copyOf(), which an int Array and returns a copy of the given 
//	array. The method's signature is as follows:
//	public static int[] copyOf(int[] array)

package ques4;
import java.util.*;
public class CopyArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of the array: ");
		int n = sc.nextInt();
		
		int[] a= new int[n];
		for(int i =0;i<n;i++) {
			a[i] = sc.nextInt();
		}
		int[] b = new int[n];
		b = copyOf(a);
		a[0]=-1;
		for(int i:b) {
			System.out.print(i+" ");
		}
	}
	public static int[] copyOf(int[] a) {
		int[] b = new int[a.length];
		for(int i = 0;i<a.length;i++) {
			b[i] = a[i];
		}
		return b;
		
	}



}
