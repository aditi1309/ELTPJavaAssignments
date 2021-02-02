package com.psl.training.assignments;

public class CarDecks extends Product{
	int dimensions;
	int capacity;
	String brand;
	String power_supply_requirements;
	String battery_backup;
	
	public CarDecks(int productID, String productName, int serialNo,int dimensions,String brand ,String power_supply_requirement,String battery_backup) {
		super(productID, productName, serialNo);
		this.battery_backup=battery_backup;
		this.dimensions=dimensions;
		this.brand=brand;
		this.power_supply_requirements=power_supply_requirement;
		System.out.println("inside CarDecks constructor.....");

		// TODO Auto-generated constructor stub
		
	}
	public String toString()
	{
		return "Microsoft Office- "+productID+" "+productName+" "+serialNo+" "+dimensions+" "+capacity+" "+brand+" "+power_supply_requirements+" "+battery_backup;
		
	}


}
