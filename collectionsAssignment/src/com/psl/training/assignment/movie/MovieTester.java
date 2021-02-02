package com.psl.training.assignment.movie;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class MovieTester {
	SimpleDateFormat sdf=new SimpleDateFormat("dd-mm-yyyy");

	

	public static void main(String[] args) throws ParseException {
		List<Movies> movieList;

		// TODO Auto-generated method stub
		MovieTester m=new MovieTester();
		movieList=m.createMovieList();
		System.out.println("Sort by language");
		Collections.sort(movieList);
		for (Movies movies : movieList) {
			System.out.println(movies);
		}
		
		System.out.println("\nSort by Director:");

		Collections.sort(movieList,m.sortByDirector);
		for (Movies movies : movieList) {
			System.out.println(movies);
		}
		
		System.out.println("\nSort by Duration:");
		Collections.sort(movieList,m.new sortMovieByDuration());
		for (Movies movies : movieList) 
		{
			System.out.println(movies);
		}
		
		
		System.out.println("\nSort by Language and Release Date:");
		Collections.sort(movieList,new SortByLanguageAndReleaseDate(movieList) );
		for (Movies movies : movieList) 
		{
			System.out.println(movies);
		}
		
	}
	
	public List<Movies> createMovieList() throws ParseException
	{
		List<Movies> movieList=new ArrayList<>();
		movieList.add(new Movies("3 IDIOTS","HINDI",sdf.parse("13-09-20016"),"HIRANI","PP",2));
		movieList.add(new Movies("yy","English",sdf.parse("16-12-2009"),"DD","bony",3));
		movieList.add(new Movies("ZNMD","HINDI",sdf.parse("14-02-2007"),"JO","SJSA",2));
		movieList.add(new Movies("3D","MARATHI",sdf.parse("19-10-2006"),"ABC","SSA",4));
		return movieList;
	}
	
	Comparator<Movies> sortByDirector=new Comparator<Movies>() {
		
		@Override
		public int compare(Movies o1, Movies o2) {
			return o1.getDirector().compareTo(o2.getDirector());
			//return 0;
		}
	};
	
	class sortMovieByDuration implements Comparator<Movies>{

		@Override
		public int compare(Movies o1, Movies o2) {
			// TODO Auto-generated method stub
			if(o1.duration>o2.duration)
				return 1;
			else if(o1.duration==o2.duration)
				return 0;
			else	
				return -1;
		}
		
		
	}
}
