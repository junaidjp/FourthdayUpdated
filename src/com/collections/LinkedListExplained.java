package com.collections;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * Linked list implementation of the List interface. Implements all optional list operations, and permits all elements (including null)
 * DescendingItetator iteratores from last to First
 * 
 * LinkedList allows for constant-time insertions or removals, but only sequential access of elements
 * Random Access to List elements is time consuming So USE ArrayList Instead . They are much faster
 * @author jpasha
 *
 */
public class LinkedListExplained {
	
	public static void main(String[] args) {
		
		Student stdt;
		LinkedList<Student> linkedList = new LinkedList<Student>();
		
		
		linkedList.add(new Student("Ahad","Spring MVC"));
		linkedList.add(new Student("KrishnaVeni","WEB services"));
		linkedList.add(new Student("Modi","Struts Framework"));
		linkedList.add(new Student("Jpasha","JMS "));
		
		//linkedList.remove(1);
		//linkedList.add(null);
		Iterator<Student> it = linkedList.descendingIterator();
		
		
		while(it.hasNext()){
		stdt=(Student)it.next();
		
		System.out.print(stdt.getSpecialization()+ "  " + stdt.getName());
			
			System.out.println("");
		}
		
		
		Iterator<Student> itNormal=linkedList.iterator();
		System.out.println("**********************************");
		while(itNormal.hasNext()){
			stdt=(Student)itNormal.next();
			itNormal.remove();
			System.out.print(stdt.getSpecialization()+ "  " + stdt.getName());
			System.out.println("");
			}
		
		
		System.out.println(linkedList.get(2).getName());
		/*for(String s:linkedList){
			
			
			
			
			System.out.println(s);
		}*/
	}


}
