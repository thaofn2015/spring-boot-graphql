package fan.example.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import fan.example.model.Book;

@Service
public class BookService {

	private static List<Book> books = new ArrayList<Book>();
	
	static {
		books.add(new Book("1", "Book1", "Book1", "1"));
		books.add(new Book("2", "Book2", "Book2", "3"));
		books.add(new Book("3", "Book3", "Book3", "2"));
		books.add(new Book("4", "Book4", "Book4", "3"));
		books.add(new Book("5", "Book5", "Book5", "4"));
		books.add(new Book("6", "Book6", "Book6", "1"));
	}
	
	public List<Book> findBookByAuthorId(String authorId) {
		return books.stream().filter(x -> x.getAuthorId() == authorId).collect(Collectors.toList());
	}
	
	public Book findBookById(String id) {
		for (Book book : books) {
			if (book.getId().equals(id)) {
				return book;
			}
		}
		return null;
	}
}
