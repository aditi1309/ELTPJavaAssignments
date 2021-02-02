package com.psl.training.assignments;

public class TestProduct {

	public TestProduct() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product[] p=new Product[3];
		p[0]=new MicrosoftOffice(10, "MSOFFICE", 10, "Windows", "xx", "177");
		p[1]=new Computers(20, "Comp10", 100,70, "Hp", "daily", "5hrs");
		p[2]=new CarDecks(20, "CD-20", 120,50, "Boat", "2hrs", "8hrs");
		for(int i=0;i<p.length;i++)
		{
			System.out.println(p[i]);
		}
}
}
