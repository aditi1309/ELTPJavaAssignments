package com.psl.training.assignments;

public class TestPerson {

	public TestPerson() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Student s=new Undergrad("Aditi");
		s.getName();
		System.out.println("-----------------------------");
		
		Undergrad stud=new Undergrad("UGStud");
		stud.getName();
		System.out.println("-----------------------------");
		
		Faculty f=new GradFaculty("fac1");
		f.getName();
		System.out.println(f.duration("temp"));
		System.out.println(f.salary("temp"));
		System.out.println("-----------------------------");
		
		UnderGradFaculty ugf=new UnderGradFaculty("Reena");
		ugf.getName();
		System.out.println(ugf.duration("permanent"));
		System.out.println(ugf.salary("permanent"));
		System.out.println("-----------------------------");
		
		// TODO Auto-generated method stub

	}

}
