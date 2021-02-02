package com.psl.training.assignments;

public class Person implements IPerson 
{
	
	String name;
	public Person(String name)
	{
		this.name=name;
	}
		@Override
		public void getName() {
			// TODO Auto-generated method stub
			System.out.println(this.name);
			
		}
		

}
