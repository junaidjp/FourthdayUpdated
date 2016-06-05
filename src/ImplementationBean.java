package com.fifthday;

import java.util.ArrayList;
import java.util.List;

//Enhancedforloop,Arraylist,Typecasting,ObjectArray,ExceptionHandling

public class ImplementationBean {
	
	
	public static void main(String args[]){
		
		
		String stringarray[]=new String[5];
		Student std=null;
		Student studentArray[]=new Student[5];
		
		List studentList=new ArrayList();
		
		
		
		Apartment apartmentOne=new Apartment();
		apartmentOne.setApartmentName("Meadow Creek");
		apartmentOne.setApartmentNo(11);
		
		
		Address studentaddress1=new Address();
		studentaddress1.setCity("Irving");
		studentaddress1.setState("TX");
		studentaddress1.setStreetname("walnut");
		studentaddress1.setZipcode("75081");
		studentaddress1.setApartment(apartmentOne); // Address you set apartment Object
		
		
 
		
		
		
		Student studentOne=new Student();
		studentOne.setName("Modi");
		studentOne.setSpecialization(".Net");
		studentOne.setAddress(studentaddress1);
		
		
		List<Phone> phoneList = new ArrayList<Phone>();
		Phone phoneOne = new Phone();
		phoneOne.setNoType("CELL");
		phoneOne.setNumber("2147447213");
		phoneList.add(phoneOne);
		Phone phoneTwo = new Phone();
		phoneTwo.setNoType("HOME");
		phoneTwo.setNumber("2148946754");
		phoneList.add(phoneTwo);	
		
		
		
		
		//phoneList will have two Objects
		// Now set the PhoneList to student Object 
		studentOne.setPhoneNumberArray(phoneList);
		
		
		
		
		System.out.println(studentOne.getAddress().getCity());
		System.out.println(studentOne.getAddress().getState());
		System.out.println(studentOne.getAddress().getApartment().getApartmentName());
		
		
		
		studentList.add(studentOne);
		studentList.add(new Student("KrishaVeni","webServices"));
		studentList.add(new Student("Ahad","Struts Framework"));
		studentList.remove(1);		
		
		for(int i=0;i<studentList.size();i++){
			std=(Student) studentList.get(i); //Typecasting
			System.out.println("Vitamin "+std.getName());
		}
		
		
		
	
		
		/*studentArray[0]=new Student("Modi",".Net");
		studentArray[1]=new Student("KrishnaVeni","WebServices");
		studentArray[2]=new Student("Ahad","Struts Framework");
		*/
		
		
		
		/*ImplementationBean impBean=new ImplementationBean();
		impBean.display();*/
		
	/*	for(int i=0;i<studentArray.length;i++){
			
		try {
			System.out.println(studentArray[i].getName());
			System.out.println(studentArray[i].getSpecialization());
			System.out.println("***********************************");
			}
			catch(NullPointerException exahad){
				System.out.println("Continue processing");
				exahad.printStackTrace();
			}
			
			finally {
				System.out.println("FINALLY THIS GETS PRINTED");
			}
			
			
			}
		*/
		Student studentArrayDup[]=new Student[2];		
		studentArrayDup[0]=new Student("Mosharrac","QA Analyst");
		studentArrayDup[1]=new Student("Subayyal","Business Graudate");
		
		for(int ij=0;ij<studentArrayDup.length;ij++){
			System.out.println("This person could not understand programming");
			System.out.println(studentArrayDup[ij].getName());
			System.out.println(studentArrayDup[ij].getSpecialization());
			
		}
		
		//Created a Object which is a POJO 
		/*
		System.out.println("The student name is"+student.getName());
		System.out.println("The student specialization is +" +student.getSpecialization());
*/
	}
	
	
	
	public  void display() throws NullPointerException {
		
		
		Student studentArrayDup[]=new Student[3];		
		studentArrayDup[0]=new Student("Mosharrac","QA Analyst");
		studentArrayDup[1]=new Student("Subayyal","Business Graudate");
		
		for(int ij=0;ij<studentArrayDup.length;ij++){
			System.out.println("This person could not understand programming");
			System.out.println(studentArrayDup[ij].getName());
			System.out.println(studentArrayDup[ij].getSpecialization());
			
		}
		
	}

}
