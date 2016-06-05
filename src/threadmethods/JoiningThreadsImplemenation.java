package threadmethods;

/**
 * Wait for a thread to finish is to call join( ),This method waits until the thread on which it is called terminates
 * 2A
 * @author jpasha
 *
 */
public class JoiningThreadsImplemenation {
	public static void main(String args[]) {
		System.out.println("Main thread starting.");
		JoingingThreads mt1 = new JoingingThreads("Jpasha #1");
		JoingingThreads mt2 = new JoingingThreads("Ahad #2");
		JoingingThreads mt3 = new JoingingThreads("KrishnaVeni #3");

		try {
			mt1.thrd.join();
			System.out.println("Jpasa #1 joined.");
			mt2.thrd.join();
			System.out.println("Ahad #2 joined.");
			mt3.thrd.join();
			System.out.println("KrishnaVeni #3 joined.");
		} catch (InterruptedException exc) {
			System.out.println("Main thread interrupted.");
		}
		System.out.println("Main thread ending.");
	}

}
