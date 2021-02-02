package com.psl.training.assignments;

import java.util.Random;

public class Assignment1_txt {
	
	int noOfEvenNos(int[] arr)
	{
		int even=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0)
			{
				//System.out.println(arr[i]);
				even++;
			}
		}
		return even;
	}
	
	void evenAndMultiple5(int[] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0 && arr[i]%5==0)
			{
				System.out.print(arr[i]+" ");
			}
		}
		
	}
	
	void totalCharactersInString(String str)
	{
		String[] s=str.split(" ");
		int c=0;
		for(int i=0;i<s.length;i++)
		{
			c=c+s[i].length();
		}
		System.out.println(c);
	}
	
	void totalVowes(String str)
	{
		String l=str.toLowerCase();
//		System.out.println(l);
		int vowels=0;
		for(int i=0;i<l.length();i++)
		{
			if(l.charAt(i)=='a'||l.charAt(i)=='e'||l.charAt(i)=='i'||l.charAt(i)=='o'||l.charAt(i)=='u')
			{
//				System.out.println(str.charAt(i));
				vowels++;
			}
		}
		System.out.println(vowels);
	}
	
	void totalSpaces(String str)
	{
		int spaces=0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)==' ')
			{
//				System.out.println(str.charAt(i));
				spaces++;
			}
		}
		System.out.println(spaces);
	}
	
	
	void pattern6_1(int n)
	{
		int line=1;
		for(int i=1;i<=n;i++)
		{
			for(int i1=1;i1<=line;i1++)
			{
				System.out.print(i1+" ");
			}
			System.out.println(" ");
			line++;
		}
		for(int i=n-1;i>=1;i--)
		{
			line--;
			for(int i1=1;i1<line;i1++)
			{
				System.out.print(i1+" ");
			}
			System.out.println(" ");
		}
	}
	
	
	void pattern6_2(String s)
	{
		for(int i1=1;i1<=s.length();i1++)
		{
			for(int i=0;i<i1;i++)
			{
				System.out.print(s.charAt(i)+" ");
			}
			System.out.println(" ");
		}
	}
	
	void pattern6_3(String s)
	{
		String[] str=s.split(" ");
		for(int i=0;i<str.length;i++)
		{
			System.out.println(str[i]);
		}
	}
	
	public static void main(String[] args) {
//		Assignment1_txt at=new Assignment1_txt();
//		int arr[]={10,23,19,22,89,90};
		//System.out.println(at.noOfEvenNos(arr));
		//at.evenAndMultiple5(arr);
		//at.totalCharactersInString("Hello My name is Aditi" );
//		at.totalVowes("Hello My name is Aditi");
//		at.totalSpaces("  Hello My name is Aditi  ");
//		at.pattern6_1(5);
//		at.pattern6_2("Hello");
//		at.pattern6_3("This is a Java World");
		
		
		
		
		
		
		
		
		
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
