package com.psl.training.assignments;

public class StringManipulationAndArrays {
	
	//1
	static int check(String sentence,String word){ 
		String[] words=sentence.split(" ");
		int c=0;
		for(int i=0;i<words.length;i++)
		{
			if(words[i].toLowerCase().equals(word.toLowerCase()))
				c++;
		}
		return c;
		
		
	}
	//2
	static String[] initProductNames()
	{
		String[] str= {"Pen" ,"Pencil", "Ruler", "Notebooks", "Projectpapers", "Journals"};
		return str;
	}

	static boolean isPresent(String[] productNames, String keyword) 
	{
		boolean isavail=false;
		for(int i=0;i<productNames.length;i++)
		{
			if(productNames[i].equals(keyword))
			{
				isavail=true;
				break;
			}
		}
		return isavail;
	}
	
	//3
	static int findPosition(int num,int[] nos) 
	{
		int x=-1;
		for(int i=0;i<nos.length;i++)
		{
			if(num==nos[i])
			{
				x=i+1;
				break;
			}
		}
		return x;
	}
	
	
	//4
	static String  makeReverse(String str) 
	{
		String[] arr=str.split(" ");
		String revs="";
		for(int i=0;i<arr.length;i++)
		{
			StringBuilder sbBuilder=new StringBuilder(arr[i]);
			arr[i]=sbBuilder.reverse().toString();
			revs=revs+arr[i]+" ";
		}
		
		return revs;
	}
	
	 
	//5
	void findAndReplace(String given,String src)
	{
		String text="Hello Aditi. My name is Aditi. I live in Nagpur";
		System.out.println(text.replaceAll(given, src));
		
		
	}
	
	
	//6
	void findPrime(int start,int end)
	{
//		int[] p= new int[50]; 
	//	int x;
		boolean isPrime=false;
		for(int j=start;j<end;j++)
		{
			//System.out.println(j);
			for(int i=2;i<j/2;i++)
			{
				isPrime=true;
				if(j%i==0)
				{
					isPrime=false;
					break;
				}
				else
				{
					isPrime=true;
				}
				
			}
			if(isPrime==true)
			{
				System.out.println(j);
			}
			else
			{
				continue;
			}
			
		}
		//return p;
		
	}
	
	//7------------------------
	
	
	//8
	static char ticTacToe(char[][] arr)
	{
		int j=0,i1=0;
		boolean lines=true;
		char ans='a';
		for(int i=i1;i<arr.length-1;i++)
		{
			
				if((arr[i][j]==arr[i+1][j]))
				{
					ans=arr[i][j];
					lines=true;
					continue;
				}
				else
				{
					j++;
					lines=false;
					continue;
				}
		}
		if(lines == true)
		{
		    return ans;
		}
		else
		{
			ans='a';
			i1=0;
			for(int i=i1;i<arr.length-1;i++)
			{
				
					if((arr[i][i]==arr[i+1][i+1]))
					{
						ans=arr[i][i];
						lines=true;
						continue;
					}	
			}
			System.out.println("diag");
			return ans;
		}
	}
	public static void main(String[] args) {
//		System.out.println("Count ="+ check("hello world. I am HELLO how AREYOU hello","Hello"));
//		
//		int[] nos= {20,90,50,18,100};
//		System.out.println(findPosition(10, nos)==-1?"Not found":"Position:"+findPosition(10, nos));
//		
//		System.out.println(makeReverse("To be or not to be"));
		
		 //arr=new char[3][3];
//		 char[][] arr= {{'X','O','X'},{'O','X','O'},{'O','X','O'}};
//		System.out.println(ticTacToe(arr));
		StringManipulationAndArrays sma=new StringManipulationAndArrays();
////		sma.findAndReplace(" I live in Nagpur", " I love burhanpur");
		sma.findPrime(5, 50);
//		for(int l=0;l<p1.length;l++)
//		{
//			System.out.println(l);
//		}
		String[] items=initProductNames();
		System.out.println(isPresent(items, "Cover"));
		
	}
}
