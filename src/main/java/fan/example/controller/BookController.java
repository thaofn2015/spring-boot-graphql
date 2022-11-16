package fan.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.graphql.data.method.annotation.SchemaMapping;
import org.springframework.stereotype.Controller;

import fan.example.model.Author;
import fan.example.model.Book;
import fan.example.service.AuthorService;
import fan.example.service.BookService;

@Controller
public class BookController {
	
	@Autowired
	private BookService bookService;
	
	@Autowired
	private AuthorService authorService;
	
	@QueryMapping
	public Book findBookById(@Argument String id) {
		return bookService.findBookById(id);
	}
	
	@SchemaMapping(typeName="Book", field="author")
	public Author author(Book book) {
		return authorService.findAuthorById(book.getAuthorId());
	}
}
