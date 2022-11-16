package fan.example.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import fan.example.model.Author;

@Service
public class AuthorService {

	private static List<Author> authors = new ArrayList<Author>();
	
	static {
		authors.add(new Author("1", "Phan", "phan", 29));
		authors.add(new Author("2", "Ngoc", "ngoc", 30));
		authors.add(new Author("3", "Thao", "thao", 28));
		authors.add(new Author("4", "Nguyen", "nguyen", 27));
	}
	
	public Author findAuthorById(String id) {
		for (Author author : authors) {
			if (author.getId().equals(id)) {
				return author;
			}
		}
		return null;
	}
	
	public List<Author> findAll(int count, int offset) {
		return authors.subList(offset, count + offset);
	}
	
	public int count() {
		return authors.size();
	}
	
	public void save(Author author) {
		authors.add(author);
	}
}
