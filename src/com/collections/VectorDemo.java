package com.collections;

/**
 * Implements a list as an array that automatically
increases in size to accommodate as many
elements as you need. Objects are stored and
retrieved using an index as in a normal array.
You can also use an iterator to retrieve objects
from a Vector<>. The Vector<> type is one
of two container classes in the java.util
package that are synchronized—that is, it is
well behaved when concurrently accessed by
two or more threads.
 */
import java.util.*;	
public class VectorDemo {
	String s;
	int q;
	public String getName(String s)
	{
		return s;
	}
public static void main(String args[])
{
	
	Vector names=new Vector();
	String[] employeenames={"Harendra","Abhinay","Saleem"};
	for(int i=0;i<employeenames.length;i++)
	{
		names.add(employeenames[i]);//adds elements into Vector
	}
	names.add(1, "Junaid");
	for(int j=0;j<names.size();j++)
	{
		System.out.println(names.get(j));
	}
	System.out.println("the name of the trainer is " +names.firstElement());
	
	
	System.out.println("Use and iterator to go throug the elements of vector");
	Iterator it=names.iterator();
	while(it.hasNext())
	{
		System.out.println("Names " +it.next());
	}
		
}
}