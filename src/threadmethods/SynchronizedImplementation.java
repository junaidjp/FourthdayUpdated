package threadmethods;

/**
 * You can synchronize access to a method by modifying it with the synchronized keyword.
When that method is called, the calling thread enters the object’s monitor, 
which then locks the object. While locked, no other thread can enter the method, or enter any other synchronized
method defined by the object. When the thread returns from the method, the monitor unlocks
the object, allowing it to be used by the next thread. Thus, synchronization is achieved with
virtually no programming effort on your part
 * @author jpasha
 *
 */
public class SynchronizedImplementation {

	public static void main(String args[]) {
		int a[] = {1, 2, 3, 4, 5};
		JunaidThread mt1 = new JunaidThread("Duncan#1", a);
		JunaidThread mt2 = new JunaidThread("Imran#2", a);
		}
		}

