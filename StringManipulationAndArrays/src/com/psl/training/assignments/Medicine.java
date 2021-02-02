package com.psl.training.assignments;

import java.util.Random;

public class Medicine 
{
    private String Name;
    private String Address;
	Medicine(String Name,String Address)
	{
		this.Name=Name;
		this.Address=Address;
	}
	public void displayLabel()
	{
		System.out.println("Name: "+this.Name);
		System.out.println("Address: "+this.Address);
	}
}

class Tablet extends Medicine
{

	Tablet(String Name, String Address) 
	{
		super(Name, Address);
	}
	
	@Override
	public void displayLabel() {
		super.displayLabel();
		System.out.println("Store in a cool dry place\n");
	}
	
}

class Syrup extends Medicine
{

	Syrup(String Name, String Address) 
	{
		super(Name, Address);
	}
	
	@Override
	public void displayLabel() 
	{
		super.displayLabel();
		System.out.println("Shake well before use\n");

	}
	
}


class Ointment extends Medicine
{

	Ointment(String Name, String Address) {
		super(Name, Address);
	}
	
	@Override
	public void displayLabel() 
	{
		super.displayLabel();
		System.out.println("For external use only\n");

	}
	
}



class TestMedicine
{
	public static void main(String[] args) 
	{
		//TestMedicine tm=new TestMedicine();
		Random rand=new Random();
		Medicine[] m=new Medicine[10];
		for(int i=0;i<m.length;i++)
		{
		int no = rand.nextInt(3);
		switch(no)
		{
			case 0:
				m[i]=new Tablet("Tablet"+i, "Gargi,Nagpur");
				m[i].displayLabel();
				break;
			case 1:
				m[i]=new Syrup("Syrup"+i, "Pune");
				m[i].displayLabel();
				break;
			case 2:
				m[i]=new Ointment("Ox"+i, "Delhi");
				m[i].displayLabel();
				break;
			default:
				break;
				
		}
	}
	
		
	}
}
