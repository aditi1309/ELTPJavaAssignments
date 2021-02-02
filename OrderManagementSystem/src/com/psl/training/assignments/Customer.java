package com.psl.training.assignments;

//import java.text.SimpleDateFormat;
import java.util.Date;

public class Customer {
private int id;
 String name;
private String homePhone,cellPhone,workPhone;
private String street;
private String city;
private String state;
private String zip;
PurchaseOrder[] pO;
//SimpleDateFormat objSDF = new SimpleDateFormat("dd-mm-yyyy");
	public Customer(int id,String name) 
	{
			this.id=id;
			this.name=name;
			// TODO Auto-generated constructor stub
	}
	
	void printPhoneNumbers()
	{
		System.out.println("Home phone: "+homePhone+"\nCell phone: "+cellPhone+"\nWork phone: "+workPhone);
	}
	
	void printShippingAddress()
	{
		System.out.println("Address: "+street+", "+city+", "+state+", "+zip);
	}
	
	void setPrintingAddress(String street,String city,String state,String zip)
	{
		this.street=street;
		this.city=city;
		this.state=state;
		this.zip=zip;
	}
	
	void setPhoneNumbers(String homePhone,String cellPhone,String workPhone)
	{
		this.cellPhone=cellPhone;
		this.homePhone=homePhone;
		this.workPhone=workPhone;
	}
	
	void printCustomerDetails()
	{
		System.out.println("Fetching Customer Details......");
		System.out.println("ID: "+this.id+"\nName: "+this.name);
		printPhoneNumbers();
		printShippingAddress();
		
	}
	
	
	PurchaseOrder[] getPurchaseOrders()
	{
		return pO;
	}
	
	
//	int setPurchaseOrders(int size,Date orderDate,int poNo)
//	{
//		
//		int poNo1=poNo;
//		this.pO=new PurchaseOrder[size];
//		for (PurchaseOrder purchaseOrder : pO) 
//		{
//			
//			purchaseOrder.create(poNo1, orderDate);
//			poNo1++;
//			
//		}
//		return poNo1;
//		
//	}

}
