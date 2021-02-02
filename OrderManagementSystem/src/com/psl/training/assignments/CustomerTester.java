package com.psl.training.assignments;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CustomerTester {

	public CustomerTester() {
		// TODO Auto-generated constructor stub
		//Milk, Chicken, Egg, Apple and Orange 
	}

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat objSDF = new SimpleDateFormat("dd-mm-yyyy");
		  Date dt_1 = objSDF.parse("15-01-2021");
		  Customer[] cust=new Customer[3];
		// TODO Auto-generated method stub
		cust[0]=new Customer(101, "Jamie");
		cust[0].setPhoneNumbers("2222222", "9422118","6666666");
		cust[0].setPrintingAddress("Ramnagar", "Ngp", "Maharashtra", "444444");
		//cust1.printCustomerDetails();
		
		cust[1]=new Customer(102, "Bill");
		cust[1].setPhoneNumbers("2000099", "4444444", "8787878");
		cust[1].setPrintingAddress("Modi No 1", "Achalpur", "Maharashtra", "110012");
		//cust2.printCustomerDetails();
		
		cust[2]=new Customer(103, "Joey");
		cust[2].setPhoneNumbers("9999999", "6663336", "8181818");
		cust[2].setPrintingAddress("Manishnagar", "Ngp", "Goa", "666666");
		//cust3.printCustomerDetails();
		
		StockItem it1=new StockItem(1, "Milk", 80);
		StockItem it2=new StockItem(2, "Chicken", 300);
		StockItem it3=new StockItem(3, "Egg", 50);
		StockItem it4=new StockItem(4, "Apple",70);
		StockItem it5=new StockItem(5, "Orange", 50);
		
		
		
		OrderItem oi1=new OrderItem(it1, 2);
		OrderItem oi2=new OrderItem(it2, 2);
		OrderItem oi3=new OrderItem(it3, 12);
		
		OrderItem[] orrar1= {oi1,oi2,oi3};
		
		OrderItem oi4=new OrderItem(it4, 5);
		OrderItem oi5=new OrderItem(it5, 10);
		OrderItem[] orrar2= {oi4,oi5};
		
		cust[0].pO=new PurchaseOrder[2];
		cust[0].pO[0]=new PurchaseOrder(1,dt_1,orrar1);
		cust[0].pO[1]=new PurchaseOrder(2,dt_1,orrar2);


		 oi4=new OrderItem(it2, 5);
		 oi5=new OrderItem(it4, 10);
			OrderItem[] orrar3= {oi4,oi5};
			cust[1].pO=new PurchaseOrder[1];
			cust[1].pO[0]=new PurchaseOrder(3,dt_1,orrar3);
			
System.out.println("---------PURCHASE ORDERS---------------");		
	
			// po=cust[1].getPurchaseOrders();
//			 cust[1].printCustomerDetails();
//			for (PurchaseOrder purchaseOrder : po) {
//				System.out.println("Order given:\n--------------------------------\n"+purchaseOrder.toString());
//				purchaseOrder.pString();
//			}
//			
			//Date sp_1 = objSDF.parse();
			cust[0].pO[0].setShipDate(objSDF.parse("30-01-2021"));
			cust[1].pO[0].setShipDate(objSDF.parse("31-01-2021"));
			cust[0].pO[1].setShipDate(objSDF.parse("02-02-2021"));
			
			for(int c=0;c<cust.length;c++)
			{
				if(cust[c].pO!=null)
				{
					System.out.println("\n---------PURCHASE ORDERS FOR CUSTOMER NAME : "+cust[c].name+" "+"---------------");	
					PurchaseOrder po[]=cust[c].getPurchaseOrders();
					cust[c].printCustomerDetails();
					for (PurchaseOrder purchaseOrder : po) {
						System.out.println("Order given:\n--------------------------------\n"+purchaseOrder.toString());
						purchaseOrder.getOrderItemDetails();
					}
				}
				
			}
			
//			System.out.println("-----------------Billing------------------");
//			
//			 po=cust[0].getPurchaseOrders();
//			 for(int i=0;i<po.length;i++)
//			 {
//				 System.out.println("Purchase order no: "+po[i].poNumber+"\nAmount= "+po[i].sumItems()+"\nShipping date:"+po[i].shipDate);
//			 }
//			
//			 
//			 
			System.out.println("\n---------BILLING---------------");	
			for(int c=0;c<cust.length;c++)
			{
				double total=0;
				if(cust[c].pO!=null)
				{
//					System.out.println("\n---------PURCHASE ORDERS FOR CUSTOMER NAME : "+cust[c].name+" "+"---------------");	
					PurchaseOrder po[]=cust[c].getPurchaseOrders();
//					cust[c].printCustomerDetails();
//					for (PurchaseOrder purchaseOrder : po) {
//						System.out.println("Order given:\n--------------------------------\n"+purchaseOrder.toString());
//						purchaseOrder.getOrderItemDetails();
//					}
					
					for (PurchaseOrder purchaseOrder : po) {
						purchaseOrder.getOrderItemDetails();
						double amt=purchaseOrder.sumItems();
						System.out.println("For purchase Order "+purchaseOrder.poNumber+" Amount is: "+amt+"\n");
						total=total+amt;
					}
					
					
					System.out.println("-------------------------------------------------------\nTOTAL AMT TO BE PAID BY "+cust[c].name+" IS: "+total+"\n");
				}
				
			}
		 
			 
			 
			 
			 
			 
			 
			 
			
	}

}
