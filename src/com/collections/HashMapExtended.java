package com.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExtended {
	
	
	public static void main(String args[]) { 
		
		
		Map<String,Student> javaclassStudentMap = new HashMap<String,Student>();
		javaclassStudentMap.put("Anth", new Student("Anthony","Game Programmer"));
		javaclassStudentMap.put("Sina", new Student("Sinan","Android Programmer"));
		javaclassStudentMap.put("dav", new Student("David","Iphone Programmer"));
		
		
		Student std  = javaclassStudentMap.get("dav");
		System.out.println(std.getName());
		System.out.println(std.getSpecialization());
		
		
		
		Set<String> studentkeys = javaclassStudentMap.keySet();
		Iterator studentKeyItera = studentkeys.iterator();
		while(studentKeyItera.hasNext()) { 
			
			System.out.println(javaclassStudentMap.get(studentKeyItera.next()).getSpecialization());
			
		}
		
	}

}
