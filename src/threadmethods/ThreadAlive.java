package threadmethods;


/**
 * 2 
 * @author jpasha
 *
 */

/**
 * 
 * 
 * 
 * Why does Java have two ways to create child threads (by extending Thread or
implementing Runnable) and which approach is better?
A: The Thread class defines several methods that can be overridden by a derived class. Of
these methods, the only one that must be overridden is run( ). This is, of course, the
same method required when you implement Runnable. Some Java programmers feel
that classes should be extended only when they are being enhanced or modified in some
way. So, if you will not be overriding any of Thread’s other methods, it is probably
best to simply implement Runnable. This is, of course, up to you.
 */
public class ThreadAlive {
	public static void main(String args[]) {
		System.out.println("Main thread starting.");
		JoingingThreads mt1 = new JoingingThreads("Child #1");
		JoingingThreads mt2 = new JoingingThreads("Child #2");
		JoingingThreads mt3 = new JoingingThreads("Child #3");
		do {
			System.out.print(".");
			try {
				Thread.sleep(100);
			} catch (InterruptedException exc) {
				System.out.println("Main thread interrupted.");
			}
		} while (mt1.thrd.isAlive() || mt2.thrd.isAlive() || mt3.thrd.isAlive());
		System.out.println("Main thread ending.");
	}
}
