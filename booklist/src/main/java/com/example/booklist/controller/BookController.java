package com.example.booklist.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.booklist.entity.Book;

@RestController
@RequestMapping("/book")
public class BookController {
	 @GetMapping("/books")
	  public ResponseEntity<List<Book>> getAllBooks() {
	    List<Book> books = new ArrayList<Book>();
		books.add(new Book("Dế Mèn Phiêu Lưu Ký", "Tô Hoài"));
		books.add(new Book("Sherlock Homes", "Arthur Conan Doyle"));
	    books.add(new Book("Lược sử loài người", "Yuval Noah Harari"));
	    return ResponseEntity.ok().body(books);
	  }
}
