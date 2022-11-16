package fan.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.graphql.data.method.annotation.SchemaMapping;
import org.springframework.stereotype.Controller;

import fan.example.model.Author;
import fan.example.model.Book;
import fan.example.service.AuthorService;
import fan.example.service.BookService;

@Controller
public class AuthorController {

	@Autowired
	private AuthorService authorService;
	
	@Autowired
	private BookService bookService;
	
	@QueryMapping
	public List<Author> findAllAuthor(@Argument int count, @Argument int offset) {
		return authorService.findAll(count, offset);
	}
	
	@QueryMapping
	public int countAllAuthor() {
		return authorService.count();
	}
	
	@SchemaMapping(typeName = "Author", field = "books")
	public List<Book> books(Author author) {
		return bookService.findBookByAuthorId(author.getId());
	}
	
	@MutationMapping
	public Author createAuthor(@Argument String id, @Argument String name, @Argument String thumbnail, @Argument int age) {
		Author author = new Author(id, name, thumbnail, age);
		
		authorService.save(author);
		
		return author;
	}
}
