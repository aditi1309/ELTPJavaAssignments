package com.psl.training.assignment.movie;

import java.text.SimpleDateFormat;
import java.util.Date;


public class Movies implements Comparable<Movies>{
	SimpleDateFormat sdf=new SimpleDateFormat("dd-mm-yyyy");
	
	String name;
	String language;
	Date releaseDate;
	String director;
	String producer;
	int duration;
	
	public String getDirector() {
		return director;
	}

	

	@Override
	public String toString() {
		return "Name =" + name + ", language =" + language
				+ ", releaseDate=" + releaseDate + ", director=" + director
				+ ", producer=" + producer +", duration="+duration+ "]";
	}

	public Movies(String name, String language, Date releaseDate, String director, String producer, int duration) {
		super();
		this.name = name;
		this.language = language;
		this.releaseDate = releaseDate;
		this.director = director;
		this.producer = producer;
		this.duration = duration;
	}
	
	public Movies() {
		// TODO Auto-generated constructor stub
	}

//	public List<Movies> createMovieList() throws ParseException
//	{
//		List<Movies> movieList=new ArrayList<>();
//		movieList.add(new Movies("3 IDIOTS","HINDI",sdf.parse("13-09-2007"),"HIRANI","PP",2));
//		movieList.add(new Movies("yy","English",sdf.parse("16-12-2009"),"dd","bony",3));
//		movieList.add(new Movies("ZNMD","HINDI",sdf.parse("14-02-2016"),"JO","SJSA",2));
//
//		return movieList;
//	}

	@Override
	public int compareTo(Movies o) {
		return this.language.compareTo(o.language);
	}

}
