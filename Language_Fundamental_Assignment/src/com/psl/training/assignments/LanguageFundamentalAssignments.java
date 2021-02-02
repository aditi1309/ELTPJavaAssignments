package com.psl.training.assignments;

public class LanguageFundamentalAssignments {
	
	static int calMax(int x,int y,int z) 
	{
		int max;
		if((x>=y)&&(x>=z))
		{
				max=x;
			
		}
		else if((y>=x) && (y>=z))
		{
			max=y;
		}
		else
		{
			max=z;
		}
		return max;
	}
	
	
	static boolean checkAlpha(char alph) 
	{
		alph=Character.toLowerCase(alph);
		if(alph=='a'||alph=='e'||alph=='i'||alph=='o'||alph=='u')
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	
	static double calInterest(int amt)  
	{
		double interest;
		if(amt>5000)
		{
			interest=amt*0.05;
		}
		else if(amt>1000 && amt<=5000)
		{
			interest=amt*(4.5/100);
		}
		else
		{
			interest=amt*0.04;
		}
		return interest;
	}
	
	static double calTax(int gp) 
	{
		if(gp>=480)
		{
			return gp*0.28;
		}
		else if(gp>240 &&  gp<480)
		{
			return gp*0.15;
		}
		else
			return 0;
		
	}
	
	
	static boolean isPrimeNumber( int num) 
	{
		boolean isprime=true;
		for(int i=2;i<num/2;i++)
		{
			if(num%i==0)
			{
				isprime= false;
				break;
			}
			else
			{
				isprime=true;
			}
		}
		return isprime;
	}
	
	
	void printPrime(int maxVal) 
	{
		for(int i=2;i<maxVal;i++)
		{
			if(isPrimeNumber(i))
			{
				System.out.print(i+" ");
			}
		}
	}
	
	
	static float calculateProfit( int numAttendees)
	{
		
		float sp=numAttendees*5;
		float cp=20+0.5f*numAttendees;
		return sp-cp;
	}
	
	
	void calculateElectricityBill(String type,int units)
	{
		type=type.toLowerCase();
		double bill;
		if(type.equals("domestic"))
		{
			if(units<=100)
			{
				bill=4*units;
				if(bill<250)
				{
					bill=250;
				}
			}
			else if(units>100 && units<300)
			{
				bill=4.5*units;
			}
			else if(units>300 && units<500)
			{
				bill=4.75*units;
			}
			else
			{
				bill=5*units;
			}
			System.out.println("Domestic Electric bill for "+units+" is: Rs."+bill);
		}
		else
		{
			if(units<=100)
			{
				bill=4.25*units;
				if(bill<350)
				{
					bill=350;
				}
			}
			else if(units>100 && units<300)
			{
				bill=4.75*units;
			}
			else if(units>300 && units<500)
			{
				bill=5*units;
			}
			else
			{
				bill=5.25*units;
			}
			System.out.println("Commercial Electric bill for "+units+" is: Rs."+bill);
		}
		
	}
	
	
	
	void payBackAmt(int amt)
	{
		double pbamt;
		if(amt>2500)
		{
			pbamt=1*0.01*amt;
		}
		else
		{
			if(amt<=500)
			{
				pbamt=0.25*0.01*amt;
				//System.out.println(pbamt);
			}
			else if(amt>500 && amt<1500)
			{
				amt=amt-500;
				pbamt=0.25*0.01*500+0.5*0.01*amt;
			}
			else
			{
				amt=amt-500-1000;
				pbamt=0.25*0.01*500+0.5*0.01*1000+0.75*0.01*amt;
				//System.out.println(pbamt);
			}
				
		}
		System.out.println("Payback amount for charges "+amt+" is= "+pbamt);
		
		
	}
	
	
	public static void main(String[] args) {
		
		LanguageFundamentalAssignments l=new LanguageFundamentalAssignments();
//		System.out.println(LanguageFundamentalAssignments.calMax(10, 10, 5));
//		System.out.println(checkAlpha('A'));
//		System.out.println(calInterest(10000));
//		System.out.println(calTax(450));
//		System.out.println(isPrimeNumber(49));
		//calculateProfit(20)<0f?System.out.println("loss "+calculateProfit(20)):System.out.println("profit "+calculateProfit(20));
//		System.out.println(calculateProfit(5));
		//l.printPrime(100);
		//l.calculateElectricityBill("COMMERCIAL", 70);
		l.payBackAmt(2000);
		l.payBackAmt(2600);
	}

}
