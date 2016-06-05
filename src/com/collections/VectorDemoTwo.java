package com.collections;

import java.util.Iterator;
import java.util.Vector;

/** THREAD SAFE **/

/** VECTOR , ITERATOR , ENHANCED FOR LOOP , TYPE CAST **/


public class VectorDemoTwo {
	
	
	public static void main(String args[]){
		Vector<Student> studentVectorList=new Vector<Student>(); //Generics 
		
		Student studentOne=new Student("Modi","Struts");
		
		//studentVectorList.add(new Student("Modi","Struts"));
		studentVectorList.add(studentOne);
		studentVectorList.add(new Student("Ahad","Spring MVC"));
		studentVectorList.add(new Student("Veni","webservices"));
		
		
		
		for(int i=0;i<studentVectorList.size();i++){
			System.out.println(studentVectorList.get(i).getName());
		}
		
		
		studentVectorList.remove(2);
		
		
		for(int i=0;i<studentVectorList.size();i++){
			System.out.println(studentVectorList.get(i).getName());
		}
		
		
		for(Student stud:studentVectorList){ //Enhanced For Loop
			System.out.println(stud.getName());
		}
		
		
		Iterator it=studentVectorList.iterator();
		
		
		while(it.hasNext()){
		Student stud=(Student) it.next();
			System.out.println(stud.getName());
		}
		
		
	}

}
