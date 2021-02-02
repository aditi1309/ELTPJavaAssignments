package com.psl.training.assignments;

import java.util.Date;

public class PurchaseOrder {
int poNumber;
Date orderDate;
Date shipDate;
OrderItem[] oi;
	public PurchaseOrder(int poNumber,Date orderDate,OrderItem[] oi) {
		this.poNumber=poNumber;
		this.oi=oi;
		this.orderDate=orderDate;
		
		
		// TODO Auto-generated constructor stub
	}
	
	boolean isShipped()
	{
		return true;
	}
	
	double sumItems()
	{
		double sum=0;
		for (OrderItem orderItem : oi) {
			sum=sum+orderItem.getTotal();
		}
		return sum;
	}
	
	void setShipDate(Date date)
	{
		this.shipDate=date;
	}
	
	void create(int poNo,Date orderDt)
	{
		this.poNumber=poNo;
		this.orderDate=orderDt;
	}
	
	OrderItem[] getItems()
	{
		return oi;
		
	}
	
	public void getOrderItemDetails()
	{
		for (OrderItem orderItem : oi) {
			System.out.println("Qty required:"+orderItem.noOfItems+" "+orderItem.stockItem.toString());
			
		}
	}
	
	public String toString() {
		return this.poNumber+"\nOrder date: "+this.orderDate+"\n"+"Shipping date: "+this.shipDate+"\nOrderItems are: ";
	}
	
	
}
