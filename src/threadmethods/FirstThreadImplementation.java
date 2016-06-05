package threadmethods;

public class FirstThreadImplementation {

	public static void main(String args[]) {
		System.out.println("Main thread starting.");
		FirstThread mt = new FirstThread("Duncan");
		do {
			//System.out.print(".");
			try {
				System.out.println("Halt a while before you terminate Main");
				Thread.sleep(500);
			} catch (InterruptedException exc) {
				System.out.println("Main thread interrupted.");
			}
		} while (mt.count != 10);
		System.out.println("Main thread ending.");

	}
}