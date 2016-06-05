package com.collections;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;

/**
 * MAPS 
 * Implements a map with keys of type K and
values of type V where all keys must be
non-null.Is synchronized , Except that everythig is similar to HashMaps
 * @author jpasha
 *
 */
public class HashTableExplained {

	public static void main(String args[]){
		
		Hashtable<String,Student> studentMap=new Hashtable<String,Student>();
		//Create a Student Object and put it in the HashMap 
		//Storing, Retrieving, and Removing Objects
		studentMap.put("vit1", new Student("Modi","webservices"));
		studentMap.put("vit2",new Student("Ahad","Spring MVC"));
		studentMap.put("vit3", new Student("Veni","Struts"));
		studentMap.put("vit3", new Student("Mosharraf","Web Analytics"));
		
		
		
		Hashtable dupTable=new Hashtable();
		dupTable.put("Str1", "ToyotaCamry");
		dupTable.put("Str2", "Nissan350Z");
		dupTable.put("Str3", "HondaCivic");
		dupTable.put(null, null);
		
		
		//Get the keys from the Map and insert it into a Set 
		
		Set<String> studentsKey=studentMap.keySet();
		//Iterate over this keys 
	Iterator<String> keyIterator=studentsKey.iterator();
	while(keyIterator.hasNext()){
		System.out.println(keyIterator.next());
		
		
	}



	// Iterate over the values based on Keys 
	keyIterator=studentsKey.iterator();
	 while(keyIterator.hasNext()){
		 System.out.println("NAMES Stored in the HashMap are "+studentMap.get(keyIterator.next()).getName());
	 }
		

		
	Enumeration<String> enumdupTable=dupTable.keys();
	while(enumdupTable.hasMoreElements()){
		System.out.println("Testing dup hashTable "+dupTable.get(enumdupTable.nextElement()));
	}
	 
	 
		
		}

}
