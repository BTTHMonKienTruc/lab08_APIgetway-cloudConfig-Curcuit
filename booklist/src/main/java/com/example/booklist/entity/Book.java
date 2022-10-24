package com.example.booklist.entity;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Book implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1646595600639108068L;
	private String title;
	private String author;
	//
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	//
	public Book(String title, String author) {
		super();
		this.title = title;
		this.author = author;
	}
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + "]";
	}
	

}
