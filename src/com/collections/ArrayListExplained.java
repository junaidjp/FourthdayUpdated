package com.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ArrayListExplained {

public static void main(String[] args) {
		
		Student stdt;
		List<Student> arrayList = new ArrayList<Student>();
		
		
		arrayList.add(new Student("Ahad","Spring MVC"));
		arrayList.add(new Student("KrishnaVeni","WEB services"));
		arrayList.add(new Student("Modi","Struts Framework"));
		arrayList.add(new Student("Jpasha","JMS "));
		//linkedList.add(null);
		
		
		for(int i = 0 ; i < arrayList.size(); i ++ ) { 
			System.out.println(arrayList.get(i).getName());
		}
	
	
}
}