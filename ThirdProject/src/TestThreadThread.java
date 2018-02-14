import java.time.LocalDateTime;

/**
 * 
 */

/**
 * @author User
 *
 */
public class TestThreadThread extends Thread {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDateTime ldt = LocalDateTime.now();
		System.out.println(ldt+" This is currently running on the main thread, " + 
							"the id is: "+ Thread.currentThread().getId());
		TestThreadThread worker = new TestThreadThread();
		Thread thread = new Thread(worker); // 2 way to use/start thread.
		// worker.start(); // for extends
		//thread.start();
		Thread thread2 = new Thread(worker);
		thread2.setName("T2");
		thread2.setPriority(MIN_PRIORITY);
		//thread2.start(); // for implement runnable
		Thread thread3 = new Thread(worker);
		//thread3.start();
		Thread thread4 = new Thread(worker);
		thread4.setName("T4");
		thread4.setPriority(MAX_PRIORITY);
		//thread4.start();
		Thread thread5 = new Thread(worker);
		//thread5.start();
		Thread thread6 = new Thread(worker);
		//thread6.start();
		Thread thread7 = new Thread(worker);
		//thread7.start();
		ldt = LocalDateTime.now();
		System.out.println(ldt + "Main finished running....");
		
		//Start Thread
		thread.start();
		thread2.start();
		thread3.start();
		thread4.start();
		thread5.start();
		thread6.start();
		thread7.start();
		
	}
	
	@Override
	public void run()
	{
		LocalDateTime ldt = LocalDateTime.now();
		System.out.println(ldt+" This is currently running on a seperate thread, : " +
							"The id is : " + Thread.currentThread().getId() + 
							", with name : " + Thread.currentThread().getName() +
							", with priority : " + Thread.currentThread().getPriority());
		
		for (int i=0;i<1000;i++) {
			//Do Nothing
		}
		
		ldt = LocalDateTime.now();
		System.out.println(ldt+"The id is : " + Thread.currentThread().getId() + 
							", with name : " + Thread.currentThread().getName() +
							", Finished Executing ");
		
	}

}
