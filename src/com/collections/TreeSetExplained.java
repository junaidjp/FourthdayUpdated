package com.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 * An implementation of a set that orders the objects in the set in ascending sequence
 * This means that an iterator obtained from a TreeSet<> object will provide the objects in ascending sequence
 * @author jpasha
 *
 */
public class TreeSetExplained {
	
	public static void main(String args[]){
	     

			TreeSet<Integer> integerSet =new TreeSet<Integer>();
		integerSet.add(10);
			integerSet.add(8);
			integerSet.add(21);
			integerSet.add(4);
			
			boolean value = integerSet.contains(10);
			if(value){
				System.out.println("value exists");
				
			}
			
			// Iterating over the elements in the set
			Iterator it = integerSet.iterator();
			while (it.hasNext()) {
			    
			   System.out.println((it.next()));
			   
			    
			}
			
			
			
			

			
			
		}

}
