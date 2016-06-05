package com.fifthday;

import java.util.List;

//The most simplest of the JavaBean
public class Student {

	public String name;
	public String specialization;
	
	public Address address;
	public List<Phone> phoneNumberArray;
	
	
	
	
	public List<Phone> getPhoneNumberArray() {
		return phoneNumberArray;
	}
	public void setPhoneNumberArray(List<Phone> phoneNumberArray) {
		this.phoneNumberArray = phoneNumberArray;
	}
	public Student() {
		super();
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
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
	
	
	
	
	
}
