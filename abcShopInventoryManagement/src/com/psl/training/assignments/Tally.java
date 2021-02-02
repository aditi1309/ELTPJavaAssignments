package com.psl.training.assignments;

public class Tally extends Product{
	String OS;
	String memory;
	String licenseKey;
	
	public Tally(int productID, String productName, int serialNo,String OS,String memory,String licenseKey) {
			super(productID, productName, serialNo);
			this.OS=OS;
			this.memory=memory;
			this.licenseKey=licenseKey;
			System.out.println("inside Tally constructor.....");
			// TODO Auto-generated constructor stub
		}

	public String toString()
	{
		return "Microsoft Office- "+productID+" "+productName+" "+serialNo+" "+OS+" "+memory+" "+licenseKey;
		
	}
//	@Override
//	void getName() {
//		System.out.println(productName);
//		// TODO Auto-generated method stub
//		
//	}

}
