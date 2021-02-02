package com.psl.training.assignments;

public abstract class Product {
	int productID;
	String productName;
	int serialNo;
	public Product(int productID,String productName,int serialNo) {
		this.productID=productID;
		this.productName=productName;
		this.serialNo=serialNo;
		// TODO Auto-generated constructor stub
	}
	
    
	 void getName() {
		 System.out.println(productName);
	 }
}
