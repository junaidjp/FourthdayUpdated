package threadmethods;

class SumArray {
	private int sum;

 synchronized	public int sumArray(int[] nums, String name) {
			 
					sum = 0; // reset sum
					for(int i=0; i<nums.length; i++) {
						System.out.println("The contents of Array at " +nums[i] +" is" + nums[i]);
						System.out.println("The current thread working on this method is" +name);
						
					sum += nums[i];
					System.out.println("The current value of Sum " + sum);
					System.out.println("Running total for " +
					Thread.currentThread().getName() +
					" is " + sum);
					try {
					Thread.sleep(10); // allow task-switch
					}
					catch(InterruptedException exc) {
					System.out.println("Main thread interrupted.");
					}
					}
					return sum;
					}
		}
