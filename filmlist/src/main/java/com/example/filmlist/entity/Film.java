package com.example.filmlist.entity;

import lombok.Data;

/**
 * @author Avan
 *
 */
@Data
public class Film {
	private  String title;
	private  String actors;
	//

	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getActors() {
		return actors;
	}
	public void setActors(String actors) {
		this.actors = actors;
	}
	//
	public Film(String title, String actors) {
		super();
		this.title = title;
		this.actors = actors;
	}
	public Film() {
		super();
		// TODO Auto-generated constructor stub
	}
	//
	@Override
	public String toString() {
		return "Film [title=" + title + ", actors=" + actors + "]";
	}
	
	
	
}
