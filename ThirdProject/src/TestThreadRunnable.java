import java.time.LocalDateTime;

/**
 * 
 */

/**
 * @author User
 *
 */
public class TestThreadRunnable implements Runnable {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDateTime ldt = LocalDateTime.now();
		System.out.println(ldt+" This is currently running on the main thread, " + 
							"the id is: "+ Thread.currentThread().getId());
		TestThreadRunnable worker = new TestThreadRunnable();
		Thread thread = new Thread(worker);
		thread.start();
		Thread thread2 = new Thread(worker);
		thread2.start();
		Thread thread3 = new Thread(worker);
		thread3.start();
		Thread thread4 = new Thread(worker);
		thread4.start();
		Thread thread5 = new Thread(worker);
		thread5.start();
		Thread thread6 = new Thread(worker);
		thread6.start();
		Thread thread7 = new Thread(worker);
		thread7.start();
		System.out.println(ldt + "Main finished running....");
	}
	
	@Override
	public void run()
	{
		LocalDateTime ldt = LocalDateTime.now();
		System.out.println(ldt+" This is currently running on a seperate thread, : " + 
							Thread.currentThread().getId());
	}

}
