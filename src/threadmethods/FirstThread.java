package threadmethods;
/**
 * 
 * See the Extends Thread
 * @author jpasha
 *
 */
public class FirstThread extends Thread {
	int count;

	// Construct a new thread.
	public FirstThread(String name) {
		super(name); // name thread
		count = 0;
		start(); // start the thread
	}

	// Begin execution of new thread.
	public void run() {
		
		System.out.println(getName() + " starting.");
		try {
			do {
				Thread.sleep(5000);
				System.out.println("In " + getName() + ", count is " + count);
				count++;
			} while (count < 10);
		} catch (InterruptedException exc) {
			System.out.println(getName() + " interrupted.");
		}
		System.out.println(getName() + " terminating.");
	}
}
