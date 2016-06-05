package threadmethods;

class JunaidThread implements Runnable {
	Thread thrd;
	static SumArray sa = new SumArray();
	int a[];
	int answer;
//	 Construct a new thread.
	public JunaidThread(String name, int nums[]) {
	thrd = new Thread(this, name);
	a = nums;
	thrd.start(); // start the thread
	}
//	 Begin execution of new thread.
	public void run() {
	int sum;
	System.out.println(thrd.getName() + " starting.");
	answer = sa.sumArray(a,thrd.getName());
	System.out.println("Sum for " + thrd.getName() +
	" is " + answer);
	System.out.println(thrd.getName() + " terminating.");
	}
	}
