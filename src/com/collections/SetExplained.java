package com.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


/**
 * A set is a collection that holds unique values. Adding a value that's already in the set has no effect. 
 *The order in which elements of the set are accessed is not
necessarily constant over time.
An implementation of a set that uses HashMap<> under the covers.


 * @author jpasha
 *
 */
public class SetExplained {
	
	public static void main(String args[]){
     
		
	Student studentOne=new Student("Ahad","Spring MVC");
	Student studentTwo=new Student("KrishnaVeni","WebSerevices");
	Student studentThree=new Student("Modi","Struts Framework");
	Student studentFour=new Student("Jpasha","product Planner");
	studentFour=new Student("Jpasha","J2ee Architect");
	
	
	Student studentFive = new Student("Anthony","Java Programmer");
	
		Set studentSet =new HashSet();
		studentSet.add(studentOne);
		studentSet.add(studentTwo);
		studentSet.add(studentThree);
		studentSet.add(studentFour);
		studentSet.add(studentFour);
		
		System.out.println("Size of the set is "+studentSet.size());
		
		boolean fourthStudent = studentSet.contains(studentFour);
		if(fourthStudent){
			System.out.println("FourthStudent exists in the set");
			
		}
		
		// Iterating over the elements in the set
		Iterator<Student> it = studentSet.iterator();
		while (it.hasNext()) {
		    // Get element
		    Student studentElement = it.next();
		   System.out.println(studentElement.getName());
		   //System.out.println(studentElement.getSpecialization());
		    
		}

		
		
	}

}
