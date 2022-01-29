/*  Create a multithreaded program by using Runnable interface and then create, 
	initialize and start three Thread objects from your class. The threads will 
	execute concurrently and display from 0 to 100 in the format [thread name : 
	number].
*/
package question1;
class MyRunnable implements Runnable{
	public void run() {
		for(int i=0;i<=100;i++) {
			System.out.println("[ "+Thread.currentThread().getName() + ": "+i+" ]");
		}
	}
}

public class DisplayUsingThreads {

	public static void main(String[] args) {
	   MyRunnable r =  new MyRunnable();
	   Thread t1 = new Thread(r);
	   Thread t2=  new Thread(r);
	   Thread t3  = new Thread(r);
	   t1.start();
	   t2.start();
	   t3.start();
	}

}
 