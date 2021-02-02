package com.psl.training.assignments;

public class OrderItem {
StockItem stockItem; 
int noOfItems;
	public OrderItem(StockItem st1,int qty) {
		stockItem=st1;
		this.noOfItems=qty;
		// TODO Auto-generated constructor stub
	}

	double getTotal()
	{
		double sum=0;
		sum=this.noOfItems*stockItem.itemPrice;
		return sum;
	}
	
	public String toString()
	{
		return stockItem.toString()+" "+"Qty: "+noOfItems;
	}

}
