package com.collections;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
Implements a map where objects of type V are
stored using keys of type K. This collection
allows null objects to be stored and allows a
key to be null . Is not synchronized . ( Not Thread safe ) 
 * @author jpasha
 *
 */

/**
 * The HashMap<> class defines a hash map in which objects are stored based on an associated key.
 * An Iterator<> is an interface for retrieving objects from a collection sequentially. An
Iterator<> object allows you to access all the objects it contains serially—but only once.
There’s no way to go back to the beginning.
Objects stored in any type of collection can be accessed using Iterator<> objects
The ListIterator<> interface provides methods for traversing the objects in a collection backwards
or forwards.

Objects stored in a Vector<>, a Stack<>, or a LinkedList<> can be accessed using
ListIterator<> objects.
 */
public class HashMapExplained {
	
	public static void main(String args[]){
	
	Map<String,Student> studentMap=new HashMap<String,Student>();
	//Create a Student Object and put it in the HashMap 
	//Storing, Retrieving, and Removing Objects
	studentMap.put("vit1", new Student("Modi","webservices"));
	studentMap.put("vit2",new Student("Ahad","Spring MVC"));
	studentMap.put("vit3", new Student("Veni","Struts"));
	studentMap.put("vit3", new Student("Mosharraf","Web Analytics"));
	
	
	HashMap dupMap=new HashMap();
	dupMap.put("Str1", "ToyotaCamry");
	dupMap.put("Str2", "Nissan350Z");
	dupMap.put("Str3", "HondaCivic");
	dupMap.put(null, null);
	
	
	//Get the keys from the Map and insert it into a Set 
	
	Set<String> studentsKey=studentMap.keySet();
	//Iterate over this keys 
Iterator<String> keyIterator=studentsKey.iterator();
while(keyIterator.hasNext()){
	System.out.println("JUST PRINT KEYS "+keyIterator.next());
	
	
}








// Iterate over the values based on Keys 
keyIterator=studentsKey.iterator();//Look for Line 52 
 while(keyIterator.hasNext()){
	 System.out.println("NAMES Stored in the HashMap are "
	 		+ ""+studentMap.get(keyIterator.next()).getName());
 }
	


 //Allows Null keys 
Set<String> carsMap=dupMap.keySet();
Iterator<String> carsIterator=carsMap.iterator();
while(carsIterator.hasNext()){
	System.out.println(carsIterator.next());
}
 	 
	
	}

}
