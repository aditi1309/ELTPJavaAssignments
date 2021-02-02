package com.psl.training.assignments;

public class StockItem {//Milk, Chicken, Egg, Apple and Orange 
int itemNumber;
String itemDescription;
double itemPrice;
int quantityAvail;
//int quantityreq;
	public StockItem(int itemNumber,String itemDes,double itemP) {
		this.itemDescription=itemDes;
		this.itemNumber=itemNumber;
		this.itemPrice=itemP;
		// TODO Auto-generated constructor stub
	}
	
	
	public int getQuantity()
	{
		if(itemDescription.equals("Milk"))
		{
			this.quantityAvail= 50;
			return 50;
		}
		else if(itemDescription.equals("Chicken"))
		{
			this.quantityAvail=100;
			return 100;
		}
		else if(itemDescription.equals("Egg"))
		{
			this.quantityAvail=200;
			return 200;
		}
		else if(itemDescription.equals("Apple"))
		{
			this.quantityAvail=250;
			return 250;
		}
		else
		{
			this.quantityAvail=300;
			return 300;
		}
	}
	
	
	public String toString() {
		return " "+this.itemDescription+" "+this.itemPrice;
		
	}

}
