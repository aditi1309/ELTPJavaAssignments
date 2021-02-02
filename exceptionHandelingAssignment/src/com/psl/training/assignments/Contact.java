package com.psl.training.assignments;

import java.util.Date;
// Anniversary, Address, Area, City, Pincode, State, Country, Telephone number, Mobile number, Email, Website. (Contact.java) 
public class Contact extends Exception{
String firstname;
String middlename;
String lastname;
Date dob;
String gender;
String address;
String area;
String city;
String pinCode;
String state;
String country;
String telephoneNo;
String mobileNo;
String email;
String website;

	public Contact(String firstname,String middlename,String lastname,Date dob,String telephoneNo,String mobileNo,String email)
	{
		this.firstname=firstname;
		this.lastname=lastname;
		this.middlename=middlename;
		this.dob=dob;
		this.telephoneNo=telephoneNo;
		this.mobileNo=mobileNo;
		this.email=email;
		// TODO Auto-generated constructor stub
		
	}
	
	public void valid()
	{
		try {
			if (this.firstname == null || this.lastname == null || this.dob == null || this.email == null)
				//throw new Exception("Compulsory attributes not present");
			System.out.println("Condition 1 validated....................");
			String regex = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$";
			if (!this.email.matches(regex))
				throw new Exception("Invalid Email id");
			System.out.println("Condition 2 validated...............\nEmail id: " + email);
			if (this.mobileNo == null && this.telephoneNo == null)
				throw new Exception("One of them should be specified");
			System.out.println("Condition 3 validated....................");

		} catch (Exception e) {
			System.out.println("Something went wrong " + e);
			e.printStackTrace();
			// System.out.println(e.getMessage());
		} finally {
			System.out.println("executing further");
		}

	}
	
	

}
//class MyException1 extends Exception{
//	public MyException1(String str) {
//		// TODO Auto-generated constructor stub
//		super(str);
//		
//	}
//	
//}
