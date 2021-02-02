package com.psl.training.assignment.movie;


import java.util.Comparator;
import java.util.List;

public class SortByLanguageAndReleaseDate implements Comparator<Movies>{
	List<Movies> movieList;
	public SortByLanguageAndReleaseDate() {
		// TODO Auto-generated constructor stub
	}
	
	public SortByLanguageAndReleaseDate(List<Movies> movieList)
	{
		this.movieList=movieList;
	}

	@Override
	public int compare(Movies o1, Movies o2) {
		int i;
		i=o1.language.compareTo(o2.language);
		if(i==0)
		{
			i=o1.releaseDate.compareTo(o2.releaseDate);
		}
		// TODO Auto-generated method stub
		return i;
	}

}
