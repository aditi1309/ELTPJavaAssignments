package com.psl.training.assignments;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Tester {

	public Tester() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf=new SimpleDateFormat("dd-mm-yyyy");
		// TODO Auto-generated method stub
		Date dt=sdf.parse("15-09-1998");
		//String ln = null;
		Contact c=new  Contact("Aditi", "Y","AGRAWAL" , dt,null,	null,"aya255@gmail.com" );
		c.valid();
	}
	
	
	public void stack(Contact c)
	{
		
	}

}
