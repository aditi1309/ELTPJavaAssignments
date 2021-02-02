package com.psl.training.assignments;

public class Faculty extends Person implements ITemporary,Salaried{

	String post;
	public Faculty(String name) {
		super(name);
		System.out.println("In Faculty class.........");
		// TODO Auto-generated constructor stub
	}

	@Override
	public int salary(String post) {
		this.post=post;
		System.out.println("This is implemented from Salaried interface");
		// TODO Auto-generated method stub
		if(post.equals("temp"))
			return 0;
		else
			return 10000;
	}

	@Override
	public String duration(String post) {
		this.post=post;
		System.out.println("This is implemented from ITemporary interface");
		if(post=="temp")
			return "6months";
		else
			return "untill retirement";
	}

	

}
