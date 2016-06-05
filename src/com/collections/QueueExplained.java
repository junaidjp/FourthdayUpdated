package com.collections;


import java.util.LinkedList;
import java.util.Queue;



/**
 * 
 * when you need FIFO
 * Can also be LIFO 
 * Queue is a Interface , implemented by LinkedList class which also Implements List interface 
 * Queue will have all methods of List interface , LinkedList class 
 * @author jpasha
 *
 */
public class QueueExplained {

	public static void main(String args[]){
		
		Queue<Student> studentQueue=new LinkedList<Student>();
		 studentQueue.add(new Student("Ahad","Spring MVC"));
		 studentQueue.add(new Student("Veni","Web Servcices"));
		 System.out.println("The size is "+studentQueue.size());
		 
		 System.out.println("NAME IS "+studentQueue.poll().getName()); // Retrieves and Removes the Head of the Queue 
		 
		 System.out.println("Now the  size is "+studentQueue.size());
		 
		 Queue<Student> studentQueue2=new LinkedList<Student>();
		 studentQueue2.add(new Student("Modi","Struts Framework"));
		 studentQueue2.add(new Student("jpasha","Product Planner"));
		 
		 System.out.println("The sise is "+studentQueue2.size());
		 System.out.println("NAME IS "+studentQueue2.peek().getName());
		 System.out.println("The sise is "+studentQueue2.size());
		 
		 
		 
		 
	}
	
	
}
