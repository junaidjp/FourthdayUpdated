package com.collections;
//The most simplest of the JavaBean
public class Student    implements Comparable {

	public String name;
	public String specialization;
	
	
	public Student(String studentname, String studentSpecialization) {
		this.name=studentname;
		this.specialization=studentSpecialization;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSpecialization() {
		return specialization;
	}
	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}
	@Override
	public int compareTo(Object arg0) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	
	
	
}
