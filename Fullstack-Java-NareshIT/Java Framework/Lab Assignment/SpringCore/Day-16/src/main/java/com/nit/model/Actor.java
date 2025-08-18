package com.nit.model;

public class Actor {
	private int id;
	private String name;
	private String movies;
	
	//setter methods for all three variables.
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setMovies(String movies) {
		this.movies = movies;
	}
	
	public void display() {
		System.out.println("  Actor Details:\r\n"
				+ "  ID     : "+id+"\r\n"
				+ "  Name   : "+name+"\r\n"
				+ "  Movies : "+movies+"");
	}
	
}
